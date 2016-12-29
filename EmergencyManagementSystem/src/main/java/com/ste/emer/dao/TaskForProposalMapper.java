package com.ste.emer.dao;

import java.util.List;

import com.ste.emer.model.TaskForProposal;

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
 * <p>ClassName   : TaskForProposalMapper.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-29</p>
 *
 * @author chenshaoyin
 * @version 1.0
 *
 */

public interface TaskForProposalMapper {
	
	/**
	 * 为应急预案创建任务
	 * @param task
	 * @return
	 * @author chenshaoyin
	 */
	public int addTaskForEmergencyIncidentProposal(TaskForProposal task);
	/**
	 * 修改应急预案的任务
	 * @param task
	 * @return
	 * @author chenshaoyin
	 */
	public int updateTaskForEmergencyIncidentProposal(TaskForProposal task); //返回状态码
	/**
	 * 删除应急预案的任务
	 * @param taskId
	 * @return
	 * @author chenshaoyin
	 */
	public int deleteTaskForEmergencyIncidentProposal(String taskId); //返回状态码
	/**
	 * 查询应急预案的任务
	 * @param proposalId
	 * @return
	 * @author chenshaoyin
	 */
	public List<TaskForProposal> getTaskByEmergencyIncidentProposalId(int proposalId);
	
	/**
	 * 删除应急预案时同时删除内部的任务
	 * @param proposalIdNum
	 * @return
	 * @author chenshaoyin
	 */
	public int deleteTaskByProposalId(int proposalIdNum);
	
	/**
	 * 获得最近插入的数据
	 * @param proposalIdNum
	 * @return
	 * @author chenshaoyin
	 */
	public int getMaxId();

}
