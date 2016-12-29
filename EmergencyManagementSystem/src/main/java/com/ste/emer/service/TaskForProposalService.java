package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.TaskForProposal;
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
 * ClassName : TaskForProposalService.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-10-28
 * </p>
 *
 * @author chenshaoyin
 * @version 1.0
 *
 */

public interface TaskForProposalService {

	/**
	 * 为应急预案创建任务
	 * 
	 * @param task
	 * @return
	 * @author chenshaoyin
	 */
	public Result addTaskForEmergencyIncidentProposal(TaskForProposal task);

	/**
	 * 修改应急预案的任务
	 * 
	 * @param task
	 * @return
	 * @author chenshaoyin
	 */
	public Result updateTaskForEmergencyIncidentProposal(TaskForProposal task);

	/**
	 * 删除应急预案的任务
	 * 
	 * @param taskId
	 * @return
	 * @author chenshaoyin
	 */
	public Result deleteTaskForEmergencyIncidentProposal(String taskId);

	/**
	 * 查询应急预案的任务
	 * 
	 * @param proposalId
	 * @return
	 * @author chenshaoyin
	 */
	public List<TaskForProposal> getTaskByEmergencyIncidentProposalId(
			String proposalId);

}
