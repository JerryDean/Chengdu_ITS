package com.ste.emer.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

/**
 * Created by neo on 2014/12/16.
 */
@Alias("Plan")
public class YjxtPlan implements java.io.Serializable{
    private String planId;
    private String planName;
    private String palnCode;
    private Integer planState;
    private Integer planType;
    private Integer planLevel;
    private Integer enactDepartment;
    private Date enactDate;
    private Integer affiliatedUnit;
    private Integer gradeOfAccidents;
    private String description;
    private Date createDate;
    private Date updateDate;
    private Integer createUser;
    private Integer updateUser;
    private Integer planParentType;
    private Integer planChildType;
    private Integer planGroupBz;

    @Override
    public String toString() {
        return "YjxtPlan{" +
                "planId='" + planId + '\'' +
                ", planName='" + planName + '\'' +
                ", palnCode='" + palnCode + '\'' +
                ", planState=" + planState +
                ", planType=" + planType +
                ", planLevel=" + planLevel +
                ", enactDepartment=" + enactDepartment +
                ", enactDate=" + enactDate +
                ", affiliatedUnit=" + affiliatedUnit +
                ", gradeOfAccidents=" + gradeOfAccidents +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", createUser=" + createUser +
                ", updateUser=" + updateUser +
                ", planParentType=" + planParentType +
                ", planChildType=" + planChildType +
                ", planGroupBz=" + planGroupBz +
                '}';
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPalnCode() {
        return palnCode;
    }

    public void setPalnCode(String palnCode) {
        this.palnCode = palnCode;
    }

    public Integer getPlanState() {
        return planState;
    }

    public void setPlanState(Integer planState) {
        this.planState = planState;
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public Integer getPlanLevel() {
        return planLevel;
    }

    public void setPlanLevel(Integer planLevel) {
        this.planLevel = planLevel;
    }

    public Integer getEnactDepartment() {
        return enactDepartment;
    }

    public void setEnactDepartment(Integer enactDepartment) {
        this.enactDepartment = enactDepartment;
    }

    public Date getEnactDate() {
        return enactDate;
    }

    public void setEnactDate(Date enactDate) {
        this.enactDate = enactDate;
    }

    public Integer getAffiliatedUnit() {
        return affiliatedUnit;
    }

    public void setAffiliatedUnit(Integer affiliatedUnit) {
        this.affiliatedUnit = affiliatedUnit;
    }

    public Integer getGradeOfAccidents() {
        return gradeOfAccidents;
    }

    public void setGradeOfAccidents(Integer gradeOfAccidents) {
        this.gradeOfAccidents = gradeOfAccidents;
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getPlanParentType() {
        return planParentType;
    }

    public void setPlanParentType(Integer planParentType) {
        this.planParentType = planParentType;
    }

    public Integer getPlanChildType() {
        return planChildType;
    }

    public void setPlanChildType(Integer planChildType) {
        this.planChildType = planChildType;
    }

    public Integer getPlanGroupBz() {
        return planGroupBz;
    }

    public void setPlanGroupBz(Integer planGroupBz) {
        this.planGroupBz = planGroupBz;
    }
}
