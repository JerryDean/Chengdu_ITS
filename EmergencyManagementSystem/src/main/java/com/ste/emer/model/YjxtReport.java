package com.ste.emer.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

/**
 * Created by neo on 2014/12/16.
 */
@Alias("Report")
public class YjxtReport implements java.io.Serializable{
    private String reportId;
    private String reportName;
    private String incidentId;
    private String planId;
    private Date reportCreateDate;

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

    public Date getReportCreateDate() {
        return reportCreateDate;
    }

    public void setReportCreateDate(Date reportCreateDate) {
        this.reportCreateDate = reportCreateDate;
    }
}
