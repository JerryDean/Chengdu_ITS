package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.YjxtIncidentflow;

public interface YjxtIncidentFlowService {

    public List<YjxtIncidentflow> getIncidentFlow();
    public String insertIncidentFlow(YjxtIncidentflow incidentFlow);
    public int updateIncidentFlow(YjxtIncidentflow incidentFlow);


}
