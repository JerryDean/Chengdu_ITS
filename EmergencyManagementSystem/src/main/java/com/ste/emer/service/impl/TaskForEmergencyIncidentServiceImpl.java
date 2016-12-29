package com.ste.emer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.TaskForEmergencyIncidentMapper;
import com.ste.emer.model.TaskForEmergencyIncident;
import com.ste.emer.service.TaskForEmergencyIncidentService;
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
 * ClassName : TaskForEmergencyIncidentServiceImpl.java
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

@Service
public class TaskForEmergencyIncidentServiceImpl implements TaskForEmergencyIncidentService {

	private static final String SUCCESS = "000000";
	private static final String FAILED = "900102";

	@Autowired
	private TaskForEmergencyIncidentMapper taskForEmergencyIncidentMapper;

	private static final Logger logger = Logger.getLogger(TaskForEmergencyIncidentServiceImpl.class);

	@Override
	public List<Result> addTaskForEmergencyIncident(List<TaskForEmergencyIncident> tasks) {

		logger.info("addTaskForEmergencyIncident-->" + tasks);

		List<Result> list = new ArrayList<Result>();

		for (TaskForEmergencyIncident task : tasks) {

			Result result = new Result();

			Integer number = -1;

			if (isNull(task)) {

				number = taskForEmergencyIncidentMapper.addTaskForEmergencyIncident(task);

			}

			if (number != -1) {

				String id = String.valueOf(taskForEmergencyIncidentMapper.slectMaxId());
				result.setId(id);
				result.setStatusCode(SUCCESS);

				list.add(result);
			} else {

				result.setStatusCode(FAILED);

				list.add(result);

			}

		}
		return list;
	}

	@Override
	public Result updateTaskForEmergencyIncident(TaskForEmergencyIncident task) {

		logger.info("updateTaskForEmergencyIncident-->" + task);

		Integer number = -1;
		Result result = new Result();

		if (task.getId() != null && task.getId() != "") {

			if (isNull(task)) {

				number = taskForEmergencyIncidentMapper.updateTaskForEmergencyIncident(task);

			}

			if (number == 1) {

				logger.info("----TaskForEmergencyIncidentServiceImpl:updateTaskForEmergencyIncident-->" + "success");

				result.setId(task.getId());
				result.setStatusCode(SUCCESS);
				return result;

			} else {

				logger.info("----TaskForEmergencyIncidentServiceImpl:updateTaskForEmergencyIncident-->" + "faild");

				result.setId(null);
				result.setStatusCode(FAILED);
				return result;

			}
		} else {

			result.setId(null);
			result.setStatusCode(FAILED);
			return result;

		}

	}

	@Override
	public Result deleteTaskForEmergencyIncident(String taskId) {

		logger.info("deleteTaskForEmergencyIncident-->taskId:" + taskId);

		Integer number = -1;
		Result result = new Result();

		if (taskId != null && taskId != "") {

			number = taskForEmergencyIncidentMapper.deleteTaskForEmergencyIncident(taskId);

			if (number == 1) {

				logger.info("----TaskForEmergencyIncidentServiceImpl:deleteTaskForEmergencyIncident-->" + "success");

				result.setId(taskId);
				result.setStatusCode(SUCCESS);
				return result;

			} else {

				logger.info("----TaskForEmergencyIncidentServiceImpl:deleteTaskForEmergencyIncident-->" + "faild");

				result.setId(null);
				result.setStatusCode(FAILED);
				return result;

			}
		} else {

			result.setId(null);
			result.setStatusCode(FAILED);
			return result;

		}

	}

	@Override
	public List<TaskForEmergencyIncident> findTaskByEmergencyIncidentId(String emergencyIncidentId) {

		logger.info("findTaskByEmergencyIncidentId-->emergencyIncidentId:" + emergencyIncidentId);

		if (emergencyIncidentId != null && emergencyIncidentId != "") {

			return taskForEmergencyIncidentMapper.findTaskByEmergencyIncidentId(emergencyIncidentId);

		} else {

			return null;

		}

	}

	/**
	 * 方法用于判断TaskForEmergencyIncident实例中相关属性是否为null
	 * 
	 * @param t
	 *            一个TaskForEmergencyIncident实例
	 * @return 若满足条件，则返回true，若不满足条件，则返回false
	 * @author DengBW
	 */
	private boolean isNull(TaskForEmergencyIncident t) {
		List<Object> list = new ArrayList<Object>();

		list.add(t.getEmergencyIncidentId());
		list.add(t.getTaskName());
		list.add(t.getDescribe());
		// list.add(t.getExecutedBy());
		list.add(t.getStatus());
		list.add(t.getProposalName());

		for (Object o : list) {
			if (o == null || "".equals(o)) {
				return false;
			}
		}

		return true;

	}

}
