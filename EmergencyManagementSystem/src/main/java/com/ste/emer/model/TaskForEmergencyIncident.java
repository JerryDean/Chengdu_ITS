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
 * <p>ClassName   :  TaskForEmergencyIncident.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-28</p>
 *
 * @author zhouhongyong
 * Modify By DengBW
 * @version 1.0
 *
 */
@Alias("TaskForEmergencyIncident")
public class TaskForEmergencyIncident implements Serializable {
	String id;
	String emergencyIncidentId;	//所属事件id
	String taskName;			//任务编号
	String describe;				//任务描述
	String executedBy;		//执行人
	Integer status;		//任务状态
	String ProposalName;		//所属预案名称
	
	public TaskForEmergencyIncident() {}

	public TaskForEmergencyIncident(String id, String emergencyIncidentId,
			String taskName, String describe, String executedBy,
			Integer status, String proposalName) {
		super();
		this.id = id;
		this.emergencyIncidentId = emergencyIncidentId;
		this.taskName = taskName;
		this.describe = describe;
		this.executedBy = executedBy;
		this.status = status;
		ProposalName = proposalName;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmergencyIncidentId() {
		return emergencyIncidentId;
	}
	public void setEmergencyIncidentId(String emergencyIncidentId) {
		this.emergencyIncidentId = emergencyIncidentId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getExecutedBy() {
		return executedBy;
	}
	public void setExecutedBy(String executedBy) {
		this.executedBy = executedBy;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getProposalName() {
		return ProposalName;
	}
	public void setProposalName(String proposalName) {
		ProposalName = proposalName;
	}

	@Override
	public String toString() {
		return "TaskForEmergencyIncident [id=" + id + ", emergencyIncidentId="
				+ emergencyIncidentId + ", taskName=" + taskName
				+ ", describe=" + describe + ", executedBy=" + executedBy
				+ ", status=" + status + ", ProposalName=" + ProposalName + "]";
	}
	
	
	
}
