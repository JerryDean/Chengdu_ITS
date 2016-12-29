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
 * <p>ClassName   : EmergencyIncident.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-28</p>
 *
 * @author zhouhongyong
 * Modify By DengBW
 * @version 1.0
 *
 */
@Alias("EmergencyIncident")
public class EmergencyIncident implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7989395156486606733L;
	
	String id;
	String emergencyIncidentId;//事件编号
	String incidentSource;//事件来源;
	Integer incidentType;//事件类型;
	Integer incidentType_sub;//事件子类型;
	String describe;//事件描述;
	String incidentRemark;//事件备注;
	Double X;//事件地点X;
	Double Y;//事件地点Y;
	String roadName;//事件所在路段，道路名(gis);
	String adminName;//事件所在区域，行政区划名(gis);
	String streetName;//事件所在街道，街道名(gis);
	Date incidentCreateTime;//事件创建时间;
	Date  incidentStopTime;//事件结束时间;
	Integer incidentGrade;//事件等级;
	String createPerson;//事件创建人;
	Integer Status;//事件状态;
	
	public EmergencyIncident() {}
	
	
	public EmergencyIncident(String id, String emergencyIncidentId,
			String incidentSource, Integer incidentType,
			Integer incidentType_sub, String describe, String incidentRemark,
			Double x, Double y, String roadName, String adminName,
			String streetName, Date incidentCreateTime, Date incidentStopTime,
			Integer incidentGrade, String createPerson, Integer status) {
		super();
		this.id = id;
		this.emergencyIncidentId = emergencyIncidentId;
		this.incidentSource = incidentSource;
		this.incidentType = incidentType;
		this.incidentType_sub = incidentType_sub;
		this.describe = describe;
		this.incidentRemark = incidentRemark;
		X = x;
		Y = y;
		this.roadName = roadName;
		this.adminName = adminName;
		this.streetName = streetName;
		this.incidentCreateTime = incidentCreateTime;
		this.incidentStopTime = incidentStopTime;
		this.incidentGrade = incidentGrade;
		this.createPerson = createPerson;
		Status = status;
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

	public String getIncidentSource() {
		return incidentSource;
	}

	public void setIncidentSource(String incidentSource) {
		this.incidentSource = incidentSource;
	}

	public Integer getIncidentType() {
		return incidentType;
	}

	public void setIncidentType(Integer incidentType) {
		this.incidentType = incidentType;
	}

	public Integer getIncidentType_sub() {
		return incidentType_sub;
	}

	public void setIncidentType_sub(Integer incidentType_sub) {
		this.incidentType_sub = incidentType_sub;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getIncidentRemark() {
		return incidentRemark;
	}

	public void setIncidentRemark(String incidentRemark) {
		this.incidentRemark = incidentRemark;
	}

	public Double getX() {
		return X;
	}

	public void setX(Double x) {
		X = x;
	}

	public Double getY() {
		return Y;
	}

	public void setY(Double y) {
		Y = y;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Date getIncidentCreateTime() {
		return incidentCreateTime;
	}

	public void setIncidentCreateTime(Date incidentCreateTime) {
		this.incidentCreateTime = incidentCreateTime;
	}

	public Date getIncidentStopTime() {
		return incidentStopTime;
	}

	public void setIncidentStopTime(Date incidentStopTime) {
		this.incidentStopTime = incidentStopTime;
	}

	public Integer getIncidentGrade() {
		return incidentGrade;
	}

	public void setIncidentGrade(Integer incidentGrade) {
		this.incidentGrade = incidentGrade;
	}

	public String getCreatePerson() {
		return createPerson;
	}

	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "EmergencyIncident [id=" + id + ", emergencyIncidentId="
				+ emergencyIncidentId + ", incidentSource=" + incidentSource
				+ ", incidentType=" + incidentType + ", incidentType_sub="
				+ incidentType_sub + ", describe=" + describe
				+ ", incidentRemark=" + incidentRemark + ", X=" + X + ", Y="
				+ Y + ", roadName=" + roadName + ", adminName=" + adminName
				+ ", streetName=" + streetName + ", incidentCreateTime="
				+ incidentCreateTime + ", incidentStopTime=" + incidentStopTime
				+ ", incidentGrade=" + incidentGrade + ", createPerson="
				+ createPerson + ", Status=" + Status + "]";
	}
	
	
}
