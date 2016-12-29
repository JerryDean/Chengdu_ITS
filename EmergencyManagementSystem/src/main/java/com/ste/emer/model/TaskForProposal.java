package com.ste.emer.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

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
 * <p>PackageName : com.ste.emer.model </p>
 * <p>ClassName   : TaskForProposal.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-28</p>
 *
 * @author chenshaoyin
 * Modify By DengBW
 * @version 1.0
 *
 */

@Alias("TaskForProposal")
public class TaskForProposal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2793581377668186308L;
	
	private String id;//id	
	private String proposalId;//预案编号
	private String taskId;//任务编号
	private String description;//描述
	private String executedBy;//执行人
	private String phone;//电话
	private Integer incidentClass;//事件等级
	
	public TaskForProposal() {}

	public TaskForProposal(String id, String proposalId, String taskId,
			String description, String executedBy, String phone,
			Integer incidentClass) {
		super();
		this.id = id;
		this.proposalId = proposalId;
		this.taskId = taskId;
		this.description = description;
		this.executedBy = executedBy;
		this.phone = phone;
		this.incidentClass = incidentClass;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProposalId() {
		return proposalId;
	}
	public void setProposalId(String proposalId) {
		this.proposalId = proposalId;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExecutedBy() {
		return executedBy;
	}
	public void setExecutedBy(String executedBy) {
		this.executedBy = executedBy;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getIncidentClass() {
		return incidentClass;
	}
	public void setIncidentClass(Integer incidentClass) {
		this.incidentClass = incidentClass;
	}

	@Override
	public String toString() {
		return "TaskForProposal [id=" + id + ", proposalId=" + proposalId
				+ ", taskId=" + taskId + ", description=" + description
				+ ", executedBy=" + executedBy + ", phone=" + phone
				+ ", incidentClass=" + incidentClass + "]";
	}
	
	
	

}
