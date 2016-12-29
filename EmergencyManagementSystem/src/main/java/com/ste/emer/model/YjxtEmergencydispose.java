package com.ste.emer.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

/**
 * Created by neo on 2014/12/16.
 */
@Alias("Emergencydispose")
public class YjxtEmergencydispose implements java.io.Serializable{
    private String emergencyId;
    private String planId;
    private String questName;
    private String questDefine;
    private Integer organId;
    private Integer importance;
    private Integer gradeOfAccidents;
    private String sortValue;
    private Integer incidentLevel;
    private Date createDate;

    public String getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(String emergencyId) {
        this.emergencyId = emergencyId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public String getQuestDefine() {
        return questDefine;
    }

    public void setQuestDefine(String questDefine) {
        this.questDefine = questDefine;
    }

    public Integer getOrganId() {
        return organId;
    }

    public void setOrganId(Integer organId) {
        this.organId = organId;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public Integer getGradeOfAccidents() {
        return gradeOfAccidents;
    }

    public void setGradeOfAccidents(Integer gradeOfAccidents) {
        this.gradeOfAccidents = gradeOfAccidents;
    }

    public String getSortValue() {
        return sortValue;
    }

    public void setSortValue(String sortValue) {
        this.sortValue = sortValue;
    }

    public Integer getIncidentLevel() {
        return incidentLevel;
    }

    public void setIncidentLevel(Integer incidentLevel) {
        this.incidentLevel = incidentLevel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
