package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.YjxtIncident;

public interface YjxtIncidentService {
    public YjxtIncident findYjxtIncidentById(String incidentID);
    public List<YjxtIncident> getIncident();
    public String insertIncident(YjxtIncident incident);
    public int updateIncident(YjxtIncident incident);
}
