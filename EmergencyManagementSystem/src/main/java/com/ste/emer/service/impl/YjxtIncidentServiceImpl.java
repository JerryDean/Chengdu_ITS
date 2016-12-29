package com.ste.emer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.model.YjxtIncident;
import com.ste.emer.service.YjxtIncidentService;

@Service
public class YjxtIncidentServiceImpl implements YjxtIncidentService {

	@Autowired
	private com.ste.emer.dao.YjxtIncidentMapper yjxtIncidentMapper;
	
	@Override
	public YjxtIncident findYjxtIncidentById(String incidentID) {
		return yjxtIncidentMapper.findYjxtIncidentById(incidentID);
	}

	@Override
	public List<YjxtIncident> getIncident() {
		return yjxtIncidentMapper.getIncident();
	}

	@Override
	public String insertIncident(YjxtIncident incident) {
		yjxtIncidentMapper.insertIncident(incident);
		return incident.getIncidentID();
	}

	@Override
	public int updateIncident(YjxtIncident incident) {
		return yjxtIncidentMapper.updateIncident(incident);
	}

}
