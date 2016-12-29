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
 * <p>ClassName   :  EmergencyIncidentGISStatus.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-28</p>
 *
 * @author zhouhongyong
 * Modify By dengbowen 
 * @version 1.0
 *
 */

@Alias("EmergencyIncidentGISStatus")
public class EmergencyIncidentGISStatus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5509366201459059719L;
	String id;
	String emergencyIncidentId;
	Integer statusType;
	String value;
	
	public EmergencyIncidentGISStatus() {}
	
	
	
	public EmergencyIncidentGISStatus(String id, String emergencyIncidentId,
			Integer statusType, String value) {
		super();
		this.id = id;
		this.emergencyIncidentId = emergencyIncidentId;
		this.statusType = statusType;
		this.value = value;
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
	public Integer getStatusType() {
		return statusType;
	}
	public void setStatusType(Integer statusType) {
		this.statusType = statusType;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "EmergencyIncidentGISStatus [id=" + id
				+ ", emergencyIncidentId=" + emergencyIncidentId
				+ ", statusType=" + statusType + ", value=" + value + "]";
	}
	
}
