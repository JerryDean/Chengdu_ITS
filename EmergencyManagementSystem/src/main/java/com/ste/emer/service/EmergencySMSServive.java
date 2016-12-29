package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.EmergencyMsg;
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
 * PackageName : com.ste.emer.service
 * </p>
 * <p>
 * ClassName : EmergencySMSServive.java
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

public interface EmergencySMSServive {

	/**
	 * 
	 * @param emergencyMsg
	 *            应急事件消息实体
	 * @return Result 包含消息的Id以及操作码
	 * @author DengBW
	 */
	Result sendEmergencyMessage(EmergencyMsg emergencyMsg) throws Exception;

	/**
	 * 
	 * @param emergencyId
	 *            应急事件Id
	 * @return emergencyMsg 应急事件消息实体
	 * @author DengBW
	 */
	List<EmergencyMsg> getEmerMsgByEmergencyId(String emergencyId);
}
