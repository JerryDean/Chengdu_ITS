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
 * <p>ClassName   :  EmergencyIncidentResourceDetail.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-28</p>
 *
 * @author zhouhongyong
 * Modify By DengBW
 * @version 1.0
 *
 */
@Alias("EmergencyIncidentResourceDetail")
public final class EmergencyIncidentResourceDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4601683054211783486L;
	
	String id;
	String emergencyIncidentId;
	Integer type;//类型
	String plateNumber;//车牌号
	String name;//姓名，司机姓名
	String phoneNumber;//电话号码
	String orgnizationUnit;//单位
	Double x;
	Double y;
	
	public EmergencyIncidentResourceDetail() {}
	
	
	public EmergencyIncidentResourceDetail(String id,
			String emergencyIncidentId, Integer type, String plateNumber,
			String name, String phoneNumber, String orgnizationUnit, Double x,
			Double y) {
		super();
		this.id = id;
		this.emergencyIncidentId = emergencyIncidentId;
		this.type = type;
		this.plateNumber = plateNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.orgnizationUnit = orgnizationUnit;
		this.x = x;
		this.y = y;
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
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOrgnizationUnit() {
		return orgnizationUnit;
	}
	public void setOrgnizationUnit(String orgnizationUnit) {
		this.orgnizationUnit = orgnizationUnit;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "EmergencyIncidentResourceDetail [id=" + id
				+ ", emergencyIncidentId=" + emergencyIncidentId + ", type="
				+ type + ", plateNumber=" + plateNumber + ", name=" + name
				+ ", phoneNumber=" + phoneNumber + ", orgnizationUnit="
				+ orgnizationUnit + ", x=" + x + ", y=" + y + "]";
	}
	
	
}
