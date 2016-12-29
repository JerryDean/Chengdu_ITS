package com.ste.emer.dao;

import java.util.List;

import com.ste.emer.model.YjxtReport;
import com.ste.emer.model.YjxtViewreport;

/**
 * Created by st on 2014/12/30.
 */
public interface YjxtReportMapper {
    public void insertReport(YjxtReport yjxtReport);
    public List<YjxtViewreport> getViewReport();
    public List<YjxtReport>  getReport();
    public int deleteReportByPlanID(String planID);

    public int deleteReportByIncidentID(String incidentID);
}
