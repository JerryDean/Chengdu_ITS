package com.ste.emer.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ste.emer.dao.EmergencySMSMapper;
import com.stee.dsms.jms.Sender;

/**
 * Copyright @ 2007, ST Electronics Info-comm Systems PTE. LTD All rights
 * reserved.
 *
 * This software is confidential and proprietary property of ST Electronics
 * Info-comm Systems PTE. LTD. The user shall not disclose the contents of this
 * software and shall only use it in accordance with the terms and conditions
 * stated in the contract or licence agreement with ST Electronics Info-comm
 * Systems PTE. LTD.
 *
 * Project Name : emergency
 * <p>
 * PackageName : com.ste.emer.jms
 * </p>
 * <p>
 * ClassName : JmsMessageListener.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-12-02
 * </p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

@Component
public class JmsMessageListener implements MessageListener {
	
	@Autowired
	@Qualifier("topicSender")
	private Sender sender;
	
	@Autowired
	private EmergencySMSMapper emergencySMSMapper;
	
	private Logger logger = Logger.getLogger(JmsMessageListener.class);

	public JmsMessageListener() {
	}

	@Override
	public void onMessage(Message msg) {
		
		/*接受到的JMS信息*/
		String content = null;
		
		String msgId = null;
		String phoneNumber = null;
		String status = null;

		TextMessage tm = (TextMessage) msg;//msg.getId()^msg.getRecipient()^OK
										   //qwertyuiopasdfghjkl^13999090909^OK

		try {

			content = tm.getText();
			System.out.println(content);
			
			String [] contentArray = content.split("\\^");
			
			if(contentArray.length == 3) {
				
				msgId = contentArray[0].trim();
				phoneNumber = contentArray[1].trim();
				status = contentArray[2].trim().toUpperCase();
				
			}else{
				
				return;
				
			}
			
			//
			int num = emergencySMSMapper.updateEmerMsg(msgId, phoneNumber, status);
			
			//更新数据库是否成功
			if(num >= 1) {
				
				logger.debug("updateEmerMsg-->更新数据库SUCCESS");
				
			}else{
				
				logger.debug("updateEmerMsg-->更新数据库FAIL");
				
			}
			

			sender.send("Topic_Ers_msg", content);


		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
