package com.ste.emer.service;

import com.ste.emer.model.DetailIncident;
import com.ste.emer.model.EmergencyIncident;
import com.ste.emer.model.EmergencyIncidentStatusEnum;
import com.stee.dsms.model.PageInfo;
import com.stee.dsms.model.PageResult;
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
 * ClassName : EmergencyIncidentService.java
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

public interface EmergencyIncidentService {
	/**
	 * 创建应急事件
	 * 
	 * @param emergencyIncident
	 *            应急事件
	 * @return EmergencyIncident 应急事件
	 * @author zhouhongyong
	 */
	Result addEmergencyIncident(EmergencyIncident emergencyIncident);

	/**
	 * 修改应急事件
	 * 
	 * @param emergencyIncident
	 *            应急事件
	 * @return
	 * @author zhouhongyong
	 */
	Result updateEmergencyIncident(EmergencyIncident emergencyIncident);

	/**
	 * 查询应急事件
	 * 
	 * @param status
	 *            事件状态
	 * @return 应急事件列表
	 * @author zhouhongyong
	 */
	PageResult findEmergencyIncidentByStatus(PageInfo pageInfo,
			EmergencyIncidentStatusEnum style);

	/**
	 * 查询事件数目
	 * 
	 * @param
	 * @return 事件数目
	 * @author zhouhongyong
	 */
	int getAllPages(int status);

	/**
	 * 通过ID获取事件信息
	 * 
	 * @param id
	 * @return
	 */
	public EmergencyIncident getEmergencyIncidentById(String id);

    String exportIncident(String incidentId);

    List<EmergencyIncident> getCurrentIncident();

	DetailIncident findDetailIncidentById(String id);

}
