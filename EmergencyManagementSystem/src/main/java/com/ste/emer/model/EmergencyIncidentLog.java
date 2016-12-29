package com.ste.emer.model;

import java.io.Serializable;
import java.util.Date;

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
 * <p>ClassName   :  EmergencyIncidentLog.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-28</p>
 *
 * @author zhouhongyong
 * Modify By DengBW
 * @version 1.0
 *
 */
@Alias("EmergencyIncidentLog")
public class EmergencyIncidentLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5560570831983447942L;
	String id;
	String emergencyIncidentId;//事件ID
	String taskName;//任务编号;
	String describe;//事件描述
	Date dateTime;
	
	public EmergencyIncidentLog() {}
	
	public EmergencyIncidentLog(String id, String emergencyIncidentId,
			String taskName, String describe, Date dateTime) {
		super();
		this.id = id;
		this.emergencyIncidentId = emergencyIncidentId;
		this.taskName = taskName;
		this.describe = describe;
		this.dateTime = dateTime;
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
	public String getDescribe(){
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe =describe;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "EmergencyIncidentLog [id=" + id + ", emergencyIncidentId="
				+ emergencyIncidentId + ", taskName=" + taskName
				+ ", describe=" + describe + ", dateTime=" + dateTime + "]";
	}
	
	
}
