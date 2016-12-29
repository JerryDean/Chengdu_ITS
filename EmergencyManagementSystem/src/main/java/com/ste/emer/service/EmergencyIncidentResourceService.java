package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.EmergencyIncidentResource;
import com.ste.emer.model.EmergencyIncidentResourceTypeEnum;
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
 * ClassName : EmergencyIncidentResourceService.java
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

public interface EmergencyIncidentResourceService {

	/**
	 * 录入一条应急资源信息
	 * 
	 * @param resource
	 *            一个应急资源信息的实例
	 * @return 添加的应急资源实例
	 * @author DengBW
	 */
	Result addEmergencyIncidentResource(EmergencyIncidentResource resource);

	/**
	 * 根据传入的应急资源实例，修改应急资源信息
	 * 
	 * @param resource
	 *            一个应急资源信息的实例
	 * @return 操作代码
	 * @author DengBW
	 */
	Result updateEmergencyIncidentResource(EmergencyIncidentResource resource);

	/**
	 * 根据应急资源的ID，删除应急资源信息
	 * 
	 * @param resourceId
	 *            一条应急资源信息的ID
	 * @return 操作代码
	 * @author DengBW
	 */
	Result deleteEmergencyIncidentResource(String resourceId);

	/**
	 * 根据应急资源类型、存放地点查询应急资源列表
	 * 
	 * @param resourceType
	 *            应急资源类型
	 * @param location
	 *            应急资源的存放位置
	 * @return 返回相关类型和地点的全部应急资源
	 * @author DengBW
	 */
	List<EmergencyIncidentResource> getEmergencyIncidentResource(
			EmergencyIncidentResourceTypeEnum e_resourceType, String location);
}
