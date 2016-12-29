package com.ste.emer.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

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
 * <p>ClassName   : EmergencyIncidentProposal.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-28</p>
 *
 * @author chenshaoyin
 * Modify By DengBW
 * @version 1.0
 *
 */

@Alias("EmergencyIncidentProposal")
public class EmergencyIncidentProposal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6881059869381027751L;
	private String id;//编号 
	private String proposalId;//预案编号
	private String name;//名称
	private Integer type;//事件类型
	private Integer subType;//事件子类型
	private String description;//描述
	private Date createDate;//创建日期
	private String creator;//创建者
	private String updateRecord;//修订记录
	private String remark;//备注信息
	private Integer status;//预案状态
	private String customUnit;//定制单位
	private String orgnizationUnit;//所属单位
	private Integer incidentLevel;//预案等级

	public EmergencyIncidentProposal() {
	}

	public EmergencyIncidentProposal(String id, String proposalId, String name, Integer type, Integer subType, String description, Date createDate, String creator, String updateRecord, String remark, Integer status, String customUnit, String orgnizationUnit, Integer incidentLevel) {
		this.id = id;
		this.proposalId = proposalId;
		this.name = name;
		this.type = type;
		this.subType = subType;
		this.description = description;
		this.createDate = createDate;
		this.creator = creator;
		this.updateRecord = updateRecord;
		this.remark = remark;
		this.status = status;
		this.customUnit = customUnit;
		this.orgnizationUnit = orgnizationUnit;
		this.incidentLevel = incidentLevel;
	}

	public Integer getIncidentLevel() {
		return incidentLevel;
	}

	public void setIncidentLevel(Integer incidentLevel) {
		this.incidentLevel = incidentLevel;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getSubType() {
		return subType;
	}

	public void setSubType(Integer subType) {
		this.subType = subType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getUpdateRecord() {
		return updateRecord;
	}

	public void setUpdateRecord(String updateRecord) {
		this.updateRecord = updateRecord;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCustomUnit() {
		return customUnit;
	}

	public void setCustomUnit(String customUnit) {
		this.customUnit = customUnit;
	}

	public String getOrgnizationUnit() {
		return orgnizationUnit;
	}

	public void setOrgnizationUnit(String orgnizationUnit) {
		this.orgnizationUnit = orgnizationUnit;
	}

	@Override
	public String toString() {
		return "EmergencyIncidentProposal{" +
				"id='" + id + '\'' +
				", proposalId='" + proposalId + '\'' +
				", name='" + name + '\'' +
				", type=" + type +
				", subType=" + subType +
				", description='" + description + '\'' +
				", createDate=" + createDate +
				", creator='" + creator + '\'' +
				", updateRecord='" + updateRecord + '\'' +
				", remark='" + remark + '\'' +
				", status=" + status +
				", customUnit='" + customUnit + '\'' +
				", orgnizationUnit='" + orgnizationUnit + '\'' +
				", incidentLevel=" + incidentLevel +
				'}';
	}
}
