package com.ste.emer.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

/**
 * Created by neo on 2014/12/16.
 */

@Alias("ViewReport")
public class YjxtViewreport implements java.io.Serializable{
    private String reportId;
    private String reportName;
    private String incidentId;
    private String planId;
    private String incidentName;
    private Integer incidentType;
    private Integer incidentState;
    private Date createDate;
    private Integer incidentOrigin;
    private Date startTime;
    private Date endTime;
    private Integer incidentLevel;
    private String incidentAddress;
    private String incidentDescription;
    private Integer placeType;
    private String incidentOther;
    private String incidentX;
    private String incidentY;
    private Integer isWatchCctv;
    private Integer organId;
    private Integer isEnd;
    private Integer isGive;
    private String emergencyId;
    private String emerPlanId;
    private String questName;
    private String questDefine;
    private Integer emerOrganId;
    private Integer importance;
    private Integer gradeOfAccidents;
    private String sortValue;

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getIncidentName() {
        return incidentName;
    }

    public void setIncidentName(String incidentName) {
        this.incidentName = incidentName;
    }

    public Integer getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(Integer incidentType) {
        this.incidentType = incidentType;
    }

    public Integer getIncidentState() {
        return incidentState;
    }

    public void setIncidentState(Integer incidentState) {
        this.incidentState = incidentState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getIncidentOrigin() {
        return incidentOrigin;
    }

    public void setIncidentOrigin(Integer incidentOrigin) {
        this.incidentOrigin = incidentOrigin;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIncidentLevel() {
        return incidentLevel;
    }

    public void setIncidentLevel(Integer incidentLevel) {
        this.incidentLevel = incidentLevel;
    }

    public String getIncidentAddress() {
        return incidentAddress;
    }

    public void setIncidentAddress(String incidentAddress) {
        this.incidentAddress = incidentAddress;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public Integer getPlaceType() {
        return placeType;
    }

    public void setPlaceType(Integer placeType) {
        this.placeType = placeType;
    }

    public String getIncidentOther() {
        return incidentOther;
    }

    public void setIncidentOther(String incidentOther) {
        this.incidentOther = incidentOther;
    }

    public String getIncidentX() {
        return incidentX;
    }

    public void setIncidentX(String incidentX) {
        this.incidentX = incidentX;
    }

    public String getIncidentY() {
        return incidentY;
    }

    public void setIncidentY(String incidentY) {
        this.incidentY = incidentY;
    }

    public Integer getIsWatchCctv() {
        return isWatchCctv;
    }

    public void setIsWatchCctv(Integer isWatchCctv) {
        this.isWatchCctv = isWatchCctv;
    }

    public Integer getOrganId() {
        return organId;
    }

    public void setOrganId(Integer organId) {
        this.organId = organId;
    }

    public Integer getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Integer isEnd) {
        this.isEnd = isEnd;
    }

    public Integer getIsGive() {
        return isGive;
    }

    public void setIsGive(Integer isGive) {
        this.isGive = isGive;
    }

    public String getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(String emergencyId) {
        this.emergencyId = emergencyId;
    }

    public String getEmerPlanId() {
        return emerPlanId;
    }

    public void setEmerPlanId(String emerPlanId) {
        this.emerPlanId = emerPlanId;
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

    public Integer getEmerOrganId() {
        return emerOrganId;
    }

    public void setEmerOrganId(Integer emerOrganId) {
        this.emerOrganId = emerOrganId;
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
}
