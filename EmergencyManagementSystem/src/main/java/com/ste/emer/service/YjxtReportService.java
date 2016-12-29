package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.YjxtReport;
import com.ste.emer.model.YjxtViewreport;

public interface YjxtReportService {
    public String insertReport(YjxtReport yjxtReport);
    public List<YjxtViewreport> getViewReport();
    public List<YjxtReport> getReport();
    public int deleteReportByPlanID(String planID);
    public int deleteReportByIncidentID(String incidentID);
}
