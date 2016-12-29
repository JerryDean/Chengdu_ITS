package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.EmergencyIncidentGISStatus;
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
 * ClassName : EmergencyIncidentGISStatusService.java
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

public interface EmergencyIncidentGISStatusService {

	/**
	 * 创建一个GIS状态信息
	 * 
	 * @param status
	 *            一条应急事件GIS状态信息实例
	 * @return 返回操作代码
	 * @author DengBW
	 */
	List<Result> addEmergencyIncidentGISStatus(
			List<EmergencyIncidentGISStatus> statusList);

	/**
	 * 根据GIS状态信息的ID，查找GIS状态信息
	 * 
	 * @param emergencyIncidentId
	 *            应急事件GIS状态的ID
	 * @return 一条与emergencyIncidentId相对应的EmergencyIncidentGISStatus实例
	 * @author DengBW
	 */
	List<EmergencyIncidentGISStatus> getEmergencyIncidentGISStatus(
			String emergencyIncidentId);
}
