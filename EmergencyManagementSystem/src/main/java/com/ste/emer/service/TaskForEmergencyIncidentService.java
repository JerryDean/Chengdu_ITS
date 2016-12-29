package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.TaskForEmergencyIncident;
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
 * ClassName : TaskForEmergencyIncidentService.java
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

public interface TaskForEmergencyIncidentService {
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
}
