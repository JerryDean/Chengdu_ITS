package com.ste.emer.dao;

import com.ste.emer.model.YjxtIncidentflow;

import java.util.List;

/**
 * Created by st on 2014/12/30.
 */
public interface YjxtIncidentFlowMapper {
    public List<YjxtIncidentflow> getIncidentFlow();
    public void insertIncidentFlow(YjxtIncidentflow incidentFlow);
    public int updateIncidentFlow(YjxtIncidentflow incidentFlow);
    public String deleteIncidentByName(YjxtIncidentflow incident);

}
