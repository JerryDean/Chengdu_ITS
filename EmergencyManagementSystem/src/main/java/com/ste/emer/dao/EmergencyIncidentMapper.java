package com.ste.emer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ste.emer.model.EmergencyIncident;

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
 * <p>ClassName   : EmergencyIncidentMapper.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-29</p>
 *
 * @author DengBW
 * @version 1.0
 *
 */
public interface EmergencyIncidentMapper {
	/**
	 * 创建应急事件
	 * @param emergencyIncident 应急事件
	 * @return  EmergencyIncident 应急事件 
	 * @author zhouhongyong
	 */
	public int addEmergencyIncident(EmergencyIncident emergencyIncident);
	/**
	 * 修改应急事件
	 * @param emergencyIncident 应急事件
	 * @return 
	 * @author zhouhongyong
	 */
	public int updateEmergencyIncident(EmergencyIncident emergencyIncident);
	/**
	 * 查询应急事件
	 * @param status 事件状态
	 * @return 应急事件列表
	 * @author zhouhongyong
	 */
	public List<EmergencyIncident> findEmergencyIncidentByStatus(@Param(value="currentPage")int currentPage,@Param(value="pageSize")int pageSize,@Param(value="status")int status);
	/**
	 * 查询事件数目
	 * @param 
	 * @return 事件数目
	 * @author zhouhongyong
	 */
	public int getAllPages(int status);
	/**
	 * 通过id获取事件信息
	 * @param id
	 * @return
	 */
	public EmergencyIncident getEmergencyIncidentById(@Param(value = "id")String id);
	/**
	 * 查询事件记录条数
	 * @return int 事件记录条数
	 */
	public int getAllPagesAllStatus();
	/**
	 * 分页查询所有事件记录
	 * return Pagenation对象
	 */
	public List<EmergencyIncident> findEmergencyIncidentByAllStatus(int currentpage,int pageSize);
	/**
	 * 获取最新插入数据
	 * @return 插入数据ID
	 */
	public int slectMaxId();

}
