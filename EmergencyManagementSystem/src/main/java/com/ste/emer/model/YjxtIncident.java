package com.ste.emer.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

/**
 * Created by neo on 2014/12/7.
 */
@Alias("Incident")
public class YjxtIncident implements java.io.Serializable {
    private String incidentID;
    private String planID;
    private String incidentName;
    private int incidentType;
    private int incidentState;
    private Date createDate;
    private int incidentOrigin;
    private Date startTime;
    private Date endTime;
    private int incidentLevel;
    private String incidentAddress;
    private String incidentDescription;
    private int placeType;
    private String incidentOther;
    private String incidentX;
    private String incidentY;
    private int isWatchCCTV;
    private int organID;
    private int isEnd;
    private int isGive;
    private int incidentSubType;

    public String getIncidentID() {
        return incidentID;
    }

    public void setIncidentID(String incidentID) {
        this.incidentID = incidentID;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getIncidentName() {
        return incidentName;
    }

    public void setIncidentName(String incidentName) {
        this.incidentName = incidentName;
    }

    public int getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(int incidentType) {
        this.incidentType = incidentType;
    }

    public int getIncidentState() {
        return incidentState;
    }

    public void setIncidentState(int incidentState) {
        this.incidentState = incidentState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getIncidentOrigin() {
        return incidentOrigin;
    }

    public void setIncidentOrigin(int incidentOrigin) {
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

    public int getIncidentLevel() {
        return incidentLevel;
    }

    public void setIncidentLevel(int incidentLevel) {
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

    public int getPlaceType() {
        return placeType;
    }

    public void setPlaceType(int placeType) {
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

    public int getIsWatchCCTV() {
        return isWatchCCTV;
    }

    public void setIsWatchCCTV(int isWatchCCTV) {
        this.isWatchCCTV = isWatchCCTV;
    }

    public int getOrganID() {
        return organID;
    }

    public void setOrganID(int organID) {
        this.organID = organID;
    }

    public int getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(int isEnd) {
        this.isEnd = isEnd;
    }

    public int getIsGive() {
        return isGive;
    }

    public void setIsGive(int isGive) {
        this.isGive = isGive;
    }

    public int getIncidentSubType() {
        return incidentSubType;
    }

    public void setIncidentSubType(int incidentSubType) {
        this.incidentSubType = incidentSubType;
    }
}
