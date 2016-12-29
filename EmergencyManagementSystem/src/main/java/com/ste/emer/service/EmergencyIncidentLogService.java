package com.ste.emer.service;

import com.ste.emer.model.EmergencyIncidentLog;
import com.stee.dsms.model.Result;

import java.util.List;

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
 * ClassName : EmergencyIncidentLogService.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-10-29
 * </p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

public interface EmergencyIncidentLogService {
	/**
	 * 创建应急事件执行记录
	 * 
	 * @param emergencyIncidentLog
	 *            事件执行记录
	 * @return 事件执行记录
	 * @author zhouhongyong
	 */
	Result addEmergencyIncidentLog(EmergencyIncidentLog emergencyIncidentLog);

	/**
	 * 通过事件ID获取事件执行记录
	 * 
	 * @param emergencyIncidentId
	 *            事件执行记录ID
	 * @return 事件日志
	 * @author zhouhongyong
	 */
	List<EmergencyIncidentLog> findLogByEmergencyIncidentId(
			String emergencyIncidentId);

	/**
	 * 更新应急事件执行记录
	 *
	 * @param emergencyIncidentLog
	 * @return
	 */
    Result updateEmergencyIncidentLog(EmergencyIncidentLog emergencyIncidentLog);

    Result deleteEmergencyIncidentLog(String id);
}
