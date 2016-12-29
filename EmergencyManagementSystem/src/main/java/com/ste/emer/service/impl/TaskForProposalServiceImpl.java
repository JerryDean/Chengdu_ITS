package com.ste.emer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.TaskForProposalMapper;
import com.ste.emer.model.TaskForProposal;
import com.ste.emer.service.TaskForProposalService;
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
 * ClassName : TaskForProposalServiceImpl.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-10-28
 * </p>
 *
 * @author chenshaoyin Modify By DengBW
 * @version 1.0
 *
 */

@Service
public class TaskForProposalServiceImpl implements TaskForProposalService {

	private static final String SUCCESS = "000000";
	private static final String FAILED = "900102";

	private static final Logger logger = Logger
			.getLogger(TaskForProposalServiceImpl.class);

	@Autowired
	private TaskForProposalMapper taskForProposalMapper;

	@Override
	public Result addTaskForEmergencyIncidentProposal(TaskForProposal task) {

		logger.info("addTaskForEmergencyIncidentProposal-->" + task);

		Integer number = -1;
		Result result = new Result();

		if (isNull(task)) {

			number = taskForProposalMapper
					.addTaskForEmergencyIncidentProposal(task);

		}

		if (number == 1) {

			String id = String.valueOf(taskForProposalMapper.getMaxId());
			result.setId(id);
			result.setStatusCode(SUCCESS);
			return result;

		} else {

			result.setStatusCode(FAILED);
			return result;

		}

	}

	@Override
	public Result updateTaskForEmergencyIncidentProposal(TaskForProposal task) {

		logger.info("updateTaskForEmergencyIncidentProposal-->" + task);

		Integer number = -1;
		Result result = new Result();

		if (task.getId() != null && task.getId() != "") {

			if (isNull(task)) {

				number = taskForProposalMapper
						.updateTaskForEmergencyIncidentProposal(task);

			}

			if (number == 1) {

				result.setId(task.getId());
				result.setStatusCode(SUCCESS);
				return result;

			} else {

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
	public Result deleteTaskForEmergencyIncidentProposal(String taskId) {

		logger.info("deleteTaskForEmergencyIncidentProposal--> taskId:"
				+ taskId);

		Integer number = -1;
		Result result = new Result();

		if (taskId != null && taskId != "") {

			number = taskForProposalMapper
					.deleteTaskForEmergencyIncidentProposal(taskId);
			if (number >= 1) {

				result.setId(taskId);
				result.setStatusCode(SUCCESS);
				return result;

			} else {

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
	public List<TaskForProposal> getTaskByEmergencyIncidentProposalId(
			String proposalId) {

		logger.info("getTaskByEmergencyIncidentProposalId-->proposalId:"
				+ proposalId);

		if (proposalId != null && proposalId != "") {

			int proposalIdNum = Integer.parseInt(proposalId);
			return taskForProposalMapper
					.getTaskByEmergencyIncidentProposalId(proposalIdNum);

		} else {

			return null;

		}

	}

	/**
	 * 方法用于判断TaskForProposal实例中相关属性是否为null
	 * 
	 * @param t
	 *            一个TaskForProposal实例
	 * @return 若满足条件，则返回true，若不满足条件，则返回false
	 * @author DengBW
	 */
	private boolean isNull(TaskForProposal t) {

		List<Object> list = new ArrayList<Object>();

		list.add(t.getProposalId());
		list.add(t.getTaskId());
		list.add(t.getDescription());
		// list.add(t.getExecutedBy());
		// list.add(t.getPhone());
		list.add(t.getIncidentClass());

		for (Object o : list) {
			if (o == null || "".equals(o)) {
				return false;
			}
		}

		return true;
	}

}
