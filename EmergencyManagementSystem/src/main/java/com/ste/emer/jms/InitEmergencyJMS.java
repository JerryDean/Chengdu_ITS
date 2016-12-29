package com.ste.emer.jms;

import javax.jms.MessageListener;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.stee.dsms.jms.Receiver;

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
 * ClassName : InitEmergencyJMS.java
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
public class InitEmergencyJMS implements
		ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private Receiver receiver;
	@Autowired
	private MessageListener listener;

	private Logger logger = Logger.getLogger(InitEmergencyJMS.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {

			receiver.listenMessage("Topic_SMS", listener);

		} catch (Exception e) {
			logger.error(e);
		}
	}

}
