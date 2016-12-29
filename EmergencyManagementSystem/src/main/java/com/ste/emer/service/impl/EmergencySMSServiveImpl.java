package com.ste.emer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.client.SMSManagement.ISendMessageWS;
import com.ste.emer.client.SMSManagement.OutBoundMessage;
import com.ste.emer.dao.EmergencySMSMapper;
import com.ste.emer.model.EmergencyMsg;
import com.ste.emer.model.PhoneState;
import com.ste.emer.service.EmergencySMSServive;
import com.ste.emer.wsClientUtil.PropertiesUtil;
import com.ste.emer.wsClientUtil.SMSClient;
import com.stee.dsms.model.Result;

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
 * PackageName : com.ste.emer.service.impl
 * </p>
 * <p>
 * ClassName : EmergencySMSServiveImpl.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-12-01
 * </p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

@Service
public class EmergencySMSServiveImpl implements EmergencySMSServive {

	private Logger logger = Logger.getLogger(EmergencySMSServiveImpl.class);

	private static final String SUCCESS = "000000";
	private static final String FAILED = "900102";

	@Autowired
	private EmergencySMSMapper emergencySMSMapper;

	@Override
	public Result sendEmergencyMessage(EmergencyMsg emergencyMsg)
			throws Exception {

		logger.info("sendEmergencyMessage-->" + emergencyMsg);

		Result result = new Result();
		int num1 = -1;
		int num2 = -1;
		
		//存储电话号码到数据库中的条数
		int sum = 0;

		if (isNull(emergencyMsg)) {// 不为空则执行

			// 存储到数据库中
			num1 = emergencySMSMapper.addEmerMsg(emergencyMsg);
			if (num1 == 1) {

				for (PhoneState p : emergencyMsg.getPhoneStates()) {

					num2 = emergencySMSMapper.addEmerPhone(
							emergencyMsg.getMsgId(), p.getPhoneNumber(),
							p.getStatus());

					if (num2 == 1) {

						sum++;

					} else {

						logger.info("phoneNumber:" + p.getPhoneNumber()
								+ ",未录入");
						// 电话号码没有准确录入，抛出异常
						throw new Exception("录入失败，请检查网络以及对象属性合法性");
					}
				}

			}

			if (sum >= 1) {//录入电话到数据库成功，则执行
				// 调用SMS方法
				OutBoundMessage o = new OutBoundMessage();
				o.setMsgId(emergencyMsg.getMsgId());
				o.setText(emergencyMsg.getContent());
				for (PhoneState p : emergencyMsg.getPhoneStates()) {

					o.getPhoneNumbers().add(p.getPhoneNumber());

				}

				logger.info("发送信息内容:" + o.getText());

				ISendMessageWS sendMessageWS = SMSClient
						.getSMSManagementClient(PropertiesUtil.wsdlUrl);

				com.ste.emer.client.SMSManagement.Result r = sendMessageWS
						.sendMessage(o);
				result.setId(r.getId());

				// 对返回的statusCode进行判断
				if ("000000".equals(r.getStatusCode())) {

					result.setStatusCode(SUCCESS);

				} else {

					result.setStatusCode(FAILED);

				}

				return result;

			} else {//录入电话到数据库失败，则返回操作码

				result.setId(emergencyMsg.getMsgId());
				result.setStatusCode(FAILED);
				return result;

			}

		} else {// 为空则返回失败操作码

			result.setId(emergencyMsg.getMsgId());
			result.setStatusCode(FAILED);
			return result;

		}

	}

	@Override
	public List<EmergencyMsg> getEmerMsgByEmergencyId(String emergencyId) {

		logger.info("getEmerMsgByEmergencyId-->emergencyId:" + emergencyId);

		List<EmergencyMsg> emergencyMsgs = null;

		if (emergencyId != null && emergencyId != "") {

			emergencyMsgs = emergencySMSMapper
					.getEmerMsgByEmergencyId(emergencyId);
//		    System.out.println(emergencyMsg);

		}
		return emergencyMsgs;
	}

	/**
	 * 方法用于判断EmergencyMsg实例中相关属性是否为null
	 * 
	 * @param e
	 *            一个EmergencyMsg实例
	 * @return 若满足条件，则返回true，若不满足条件，则返回false
	 * @author DengBW
	 */
	private boolean isNull(EmergencyMsg e) {

		List<Object> list = new ArrayList<Object>();

		list.add(e.getMsgId());
		list.add(e.getContent());
		list.add(e.getEmergencyId());

		for (Object o : list) {
			if (o == null || "".equals(o)) {
				return false;
			}
		}

		for (PhoneState p : e.getPhoneStates()) {

			if (p.getPhoneNumber() == null || "".equals(p.getPhoneNumber())) {

				return false;

			}

		}

		return true;
	}

}
