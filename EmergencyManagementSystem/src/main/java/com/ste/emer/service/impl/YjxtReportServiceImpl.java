package com.ste.emer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.YjxtReportMapper;
import com.ste.emer.model.YjxtReport;
import com.ste.emer.model.YjxtViewreport;
import com.ste.emer.service.YjxtReportService;

@Service
public class YjxtReportServiceImpl implements YjxtReportService {

	@Autowired
	private YjxtReportMapper yjxtReportMapper;
	
	@Override
	public String insertReport(YjxtReport yjxtReport) {
		yjxtReportMapper.insertReport(yjxtReport);
		return yjxtReport.getIncidentId();
	}

	@Override
	public List<YjxtViewreport> getViewReport() {
		return yjxtReportMapper.getViewReport();
	}

	@Override
	public List<YjxtReport> getReport() {
		return yjxtReportMapper.getReport();
	}

	@Override
	public int deleteReportByPlanID(String planID) {
		return yjxtReportMapper.deleteReportByPlanID(planID);
	}

	@Override
	public int deleteReportByIncidentID(String incidentID) {
		return yjxtReportMapper.deleteReportByIncidentID(incidentID);
	}

}
