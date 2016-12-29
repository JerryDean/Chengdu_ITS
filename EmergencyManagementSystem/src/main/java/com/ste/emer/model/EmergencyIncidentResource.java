package com.ste.emer.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

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
 * <p>ClassName   : EmergencyIncidentResource.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-29</p>
 *
 * @author dengbowen
 * @version 1.0
 *
 */

@Alias("EmergencyIncidentResource")
public class EmergencyIncidentResource implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2693609259751388265L;

	//Id
	private String id;
	
	//应急资源类型
	private Integer resourceType;


	//管理单位
	private String organizationUnit;
	
	//资源名称
	private Integer subType;
	
	//位置
	private String location;
	
	//数量
	private Integer count;
	
	//联系人
	private String contactPerson;
	
	//联系电话
	private String phoneNumber;

	//业务范围
	private String businessScope;
	
	//备注
	private String remark;


    public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public EmergencyIncidentResource() {
	}

	public EmergencyIncidentResource(String id, Integer resourceType, String organizationUnit, Integer subType, String location, Integer count, String contactPerson, String phoneNumber, String businessScope, String remark) {
		this.id = id;
		this.resourceType = resourceType;
		this.organizationUnit = organizationUnit;
		this.subType = subType;
		this.location = location;
		this.count = count;
		this.contactPerson = contactPerson;
		this.phoneNumber = phoneNumber;
		this.businessScope = businessScope;
		this.remark = remark;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getResourceType() {
		return resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
	}

	public String getOrgnizationUnit() {
		return organizationUnit;
	}

	public void setOrgnizationUnit(String organizationUnit) {
		this.organizationUnit = organizationUnit;
	}

	public Integer getSubType() {
		return subType;
	}

	public void setSubType(Integer subType) {
		this.subType = subType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "EmergencyIncidentResource{" +
				"id='" + id + '\'' +
				", resourceType=" + resourceType +
				", organizationUnit='" + organizationUnit + '\'' +
				", subType=" + subType +
				", location='" + location + '\'' +
				", count=" + count +
				", contactPerson='" + contactPerson + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", businessScope='" + businessScope + '\'' +
				", remark='" + remark + '\'' +
				'}';
	}
}
