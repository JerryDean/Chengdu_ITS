package com.ste.emer.webservices;

import com.ste.emer.model.*;
import com.stee.dsms.model.PageInfo;
import com.stee.dsms.model.PageResult;
import com.stee.dsms.model.Result;

import javax.jws.WebService;
import java.util.Date;
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
 * PackageName : com.ste.emer.webservices
 * </p>
 * <p>
 * ClassName : IEmergencySys.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-10-28
 * </p>
 *
 * @author dengbowen
 * @version 1.0
 *
 */

@WebService
public interface IEmergencySys {

	/**
	 * 根据车辆的车牌，获得车辆的位置
	 * 
	 * @param plateNumber
	 *            车辆的车牌
	 * @return 一条车辆信息的实例
	 * @author DengBW
	 */
	VehicleInfo getVehicleInfoByPlateNumber(String plateNumber);

	/**
	 * 根据车牌号，以及数据的采集时间startTime和数据采集时间endTime，获取车辆的轨迹
	 * 
	 * @param plateNumber
	 *            车辆的车牌
	 * @param startTime
	 *            数据采集时间（开始时间）
	 * @param endTime
	 *            数据采集时间（结束时间）
	 * @return 以车牌号为ID的车辆全部位置信息
	 * @author DengBW
	 */
	List<VehicleInfo> getVehicleTrack(String plateNumber, Date startTime,
			Date endTime);

	/**
	 * 录入一条应急资源信息
	 * 
	 * @param resource
	 *            一个应急资源信息的实例
	 * @return 操作结果（状态）实例
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
	 * @param e_resourceType
	 *            应急资源类型
	 * @param location
	 *            应急资源的存放位置
	 * @return 返回相关类型和地点的全部应急资源
	 * @author DengBW
	 */
	List<EmergencyIncidentResource> getEmergencyIncidentResource(
			EmergencyIncidentResourceTypeEnum e_resourceType, String location);

	/**
	 * 创建一个GIS状态信息
	 * 
	 * @param statusList
	 *            一条应急事件GIS状态信息实例
	 * @return 操作结果（状态）实例
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

	/**
	 * 创建应急事件
	 * 
	 * @param emergencyIncident
	 *            应急事件
	 * @return 操作结果（状态）实例
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
	 * @param pageInfo
	 *            事件状态
	 * @return 应急事件列表
	 * @author zhouhongyong
	 */
	PageResult findEmergencyIncidentByStatus(PageInfo pageInfo,
			EmergencyIncidentStatusEnum style);

	/**
	 * 
	 * @param id
	 * @return
	 * @author zhouhongyong
	 */
	EmergencyIncident getEmergencyIncidentById(String id);

	/**
	 * 给事件添加任务
	 * 
	 * @param tasks
	 * @return 任务列表
	 * @author zhouhongyong
	 */
	List<Result> addTaskForEmergencyIncident(
			List<TaskForEmergencyIncident> tasks);

	/**
	 * 跟新事件任务
	 * 
	 * @param task
	 *            事件任务
	 * @return 操作状态
	 * @author zhouhongyong
	 */
	Result updateTaskForEmergencyIncident(TaskForEmergencyIncident task);

	/**
	 * 删除事件任务
	 * 
	 * @param taskId
	 *            任务ID
	 * @return 操作状态信息
	 * @author zhouhongyong
	 */
	Result deleteTaskForEmergencyIncident(String taskId);

	/**
	 * 获取事件任务列表
	 * 
	 * @param emergencyIncidentId
	 *            事件ID
	 * @return 事件任务列表
	 * @author zhouhongyong
	 */
	List<TaskForEmergencyIncident> findTaskByEmergencyIncidentId(
			String emergencyIncidentId);

	/**
	 * 创建应急事件执行记录
	 * 
	 * @param emergencyIncidentLog
	 *            事件执行记录
	 * @return 操作结果（状态）实例
	 * @author zhouhongyong
	 */
	Result addEmergencyIncidentLog(EmergencyIncidentLog emergencyIncidentLog);

    /**
     * 更新应急事件执行记录
     *
     * @param emergencyIncidentLog
     * @return
     */
	Result updateEmergencyIncidentLog(EmergencyIncidentLog emergencyIncidentLog);

    /**
     * 删除应急事件执行记录
     *
     * @param id 执行记录的唯一编号
     * @return
     */
	Result deleteEmergencyIncidentLog(String id);

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
	 * 创建应急事件资源详细信息
	 * 
	 * @param resource
	 *            事件资源详细信息
	 * @return 操作结果（状态）实例
	 * @author zhouhongyong
	 */
	Result addEmergencyIncidentResourceDetail(
			EmergencyIncidentResourceDetail resource);

	/**
	 * 更新应急事件资源详细信息
	 * 
	 * @param resource
	 *            事件资源详细信息
	 * @return 操作状态信息
	 * @author zhouhongyong
	 */
	Result updateEmergencyIncidentResourceDetail(
			EmergencyIncidentResourceDetail resource);

	/**
	 * 删除应急事件资源详细信息
	 * 
	 * @param resourceId
	 *            事件资源详细信息ID
	 * @return 操作状态信息
	 * @author zhouhongyong
	 */
	Result deleteEmergencyIncidentResourceDetail(String resourceId);

	/**
	 * 通过事件ID查找应急事件资源详细信息
	 * 
	 * @param emergencyIncidentId
	 *            事件ID
	 * @return 返回事件资源详细信息列表
	 * @author zhouhongyong
	 */
	List<EmergencyIncidentResourceDetail> findResourceDetailByEmergencyIncidentId(
			String emergencyIncidentId);

	/**
	 * 创建应急预案
	 * 
	 * @param proposal
	 * @return 操作结果（状态）实例
	 * @author chenshaoyin
	 */
	Result addEmergencyIncidentProposal(EmergencyIncidentProposal proposal);


	/**
	 * 修改应急预案
	 * 
	 * @param proposal
	 * @return
	 * @author chenshaoyin
	 */
	Result updateEmergencyIncidentProposal(EmergencyIncidentProposal proposal);

	/**
	 * 删除应急预案
	 * 
	 * @param proposalId
	 * @return
	 * @author chenshaoyin
	 */
	Result deleteEmergencyIncidentProposal(String proposalId);

	/**
	 * 分页模糊查询应急预案
	 * 
	 * @param type
	 * @param subType
	 * @param name
	 * @return
	 * @author chenshaoyin
	 */
	PageResult findEmergencyIncidentProposal(EmergencyIncidentTypeEnum type,
			EmergencyIncidentTypeSubEnum subType, String name, PageInfo pageInfo);// name模糊查询，为empty/null时，返回全部

	/**
	 * 通过编号查询应急预案
	 * 
	 * @param proposalId
	 * @return
	 * @author chenshaoyin
	 */
	EmergencyIncidentProposal getEmergencyIncidentProposalById(String proposalId);

	/**
	 * 为应急预案创建任务
	 * 
	 * @param task
	 * @return 操作结果（状态）实例
	 * @author chenshaoyin
	 */
	Result addTaskForEmergencyIncidentProposal(TaskForProposal task);

	/**
	 * 修改应急预案的任务
	 * 
	 * @param task
	 * @return
	 * @author chenshaoyin
	 */
	Result updateTaskForEmergencyIncidentProposal(TaskForProposal task); // 返回状态码

	/**
	 * 删除应急预案的任务
	 * 
	 * @param taskId
	 * @return
	 * @author chenshaoyin
	 */
	Result deleteTaskForEmergencyIncidentProposal(String taskId); // 返回状态码

	/**
	 * 查询应急预案的任务
	 * 
	 * @param proposalId
	 * @return
	 * @author chenshaoyin
	 */
	List<TaskForProposal> getTaskByEmergencyIncidentProposalId(String proposalId);
	
	
	/* ****************************应急系统短信模块************************************* */

		/**
		 * 
		 * @param emergencyMsg
		 *            应急事件消息实体
		 * @return Result 包含消息的Id以及操作码
		 * @author DengBW
		 */
		Result sendEmergencyMessage(EmergencyMsg emergencyMsg);

		/**
		 * 
		 * @param emergencyId
		 *            应急事件Id
		 * @return emergencyMsg 应急事件消息实体
		 * @author DengBW
		 */
		List<EmergencyMsg> getEmerMsgByEmergencyId(String emergencyId);

    /**
     * 导出指定应急事件的处置过程。
     *
     * @param incidentId
     * @return
     */
		String exportIncident(String incidentId);

    /**
     * 获取当前处理中的事件基础信息和状态。
     *
     * @return
     */
		List<EmergencyIncident> getCurrentIncident();

    /**
     * 通过id获取事件详细信息
     *
     * @param id
     * @return
     */
		DetailIncident findDetailIncidentById(String id);
		
}


