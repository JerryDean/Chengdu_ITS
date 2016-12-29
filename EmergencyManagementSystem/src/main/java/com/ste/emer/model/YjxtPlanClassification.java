package com.ste.emer.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

/**
 * Created by st on 2015/1/15.
 */

@Alias("PlanClass")
public class YjxtPlanClassification implements Serializable {
    String pcID;
    String incidentLevel;
    String describ;
    String planID;

    public YjxtPlanClassification() {
    }

    public YjxtPlanClassification(String pcID, String incidentLevel, String describ, String planID) {
        this.pcID = pcID;
        this.incidentLevel = incidentLevel;
        this.describ = describ;
        this.planID = planID;
    }


    public String getPcID() {
        return pcID;
    }

    public void setPcID(String pcID) {
        this.pcID = pcID;
    }

    public String getIncidentLevel() {
        return incidentLevel;
    }

    public void setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    @Override
    public String toString() {
        return "YjxtPlanClassification{" +
                "pcID='" + pcID + '\'' +
                ", incidentLevel='" + incidentLevel + '\'' +
                ", describ='" + describ + '\'' +
                ", planID='" + planID + '\'' +
                '}';
    }
}
