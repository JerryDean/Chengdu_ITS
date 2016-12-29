package com.ste.emer.dao;

import java.util.List;

import com.ste.emer.model.EmergencyIncidentResourceDetail;

/** Copyright @ 2007, ST Electronics Info-comm Systems PTE. LTD
 * All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics Info-comm Systems PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or licence agreement with ST Electronics Info-comm Systems PTE. LTD.
 *
 * Project Name : emergency
 * <p>PackageName : com.ste.emer.dao </p>
 * <p>ClassName   : EmergencyIncidentResourceDetailMapper.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-29</p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

public interface EmergencyIncidentResourceDetailMapper {
	/**
	 * 创建应急事件资源详细信息
	 * @param resource 事件资源详细信息
	 * @return 事件资源详细信息
	 * @author zhouhongyong
	 */
	public int addEmergencyIncidentResourceDetail(EmergencyIncidentResourceDetail resource);
	/**
	 * 更新应急事件资源详细信息
	 * @param resource 事件资源详细信息
	 * @return  操作状态信息
	 * @author zhouhongyong
	 */
	int updateEmergencyIncidentResourceDetail(EmergencyIncidentResourceDetail resource) ;
	/**
	 * 删除应急事件资源详细信息
	 * @param resourceId 事件资源详细信息ID
	 * @return 操作状态信息
	 * @author zhouhongyong
	 */
	public int deleteEmergencyIncidentResourceDetail(String resourceId);
	/**
	 * 通过事件ID查找应急事件资源详细信息
	 * @param emergencyIncidentId 事件ID
	 * @return 返回事件资源详细信息列表
	 * @author zhouhongyong
	 */
	public List<EmergencyIncidentResourceDetail> findResourceDetailByEmergencyIncidentId(String emergencyIncidentId);
	/**
	 * 获取最新插入数据
	 * @return 插入数据ID
	 */
	public int slectMaxId();
}
