package com.ste.emer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.YjxtIncidentFlowMapper;
import com.ste.emer.model.YjxtIncidentflow;
import com.ste.emer.service.YjxtIncidentFlowService;

@Service
public class YjxtIncidentFlowServiceImpl implements YjxtIncidentFlowService {

	@Autowired
	private YjxtIncidentFlowMapper yjxtIncidentFlowMapper;
	
	@Override
	public List<YjxtIncidentflow> getIncidentFlow() {
		return yjxtIncidentFlowMapper.getIncidentFlow();
	}

	@Override
	public String insertIncidentFlow(YjxtIncidentflow incidentFlow) {
		 yjxtIncidentFlowMapper.insertIncidentFlow(incidentFlow);
		 return incidentFlow.getIncidentFlowID();
	}

	@Override
	public int updateIncidentFlow(YjxtIncidentflow incidentFlow) {
		return yjxtIncidentFlowMapper.updateIncidentFlow(incidentFlow);
	}

}
