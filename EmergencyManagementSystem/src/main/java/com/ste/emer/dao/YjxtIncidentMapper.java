package com.ste.emer.dao;

import com.ste.emer.model.YjxtIncident;

import java.util.List;

/**
 * Created by st on 2014/12/30.
 */
public interface YjxtIncidentMapper {
    public YjxtIncident findYjxtIncidentById(String incidentID);
    public List<YjxtIncident> getIncident();
    public void insertIncident(YjxtIncident incident);
    public int updateIncident(YjxtIncident incident);
    public void deleteIncident(YjxtIncident yjxtIncident);
}
