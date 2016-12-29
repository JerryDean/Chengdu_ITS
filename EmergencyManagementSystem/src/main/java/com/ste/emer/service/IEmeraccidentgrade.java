package com.ste.emer.service;

import com.ste.emer.model.Emeraccidentgrade;

import java.util.List;

/**
 * Created by st on 2014/12/30.
 */
public interface IEmeraccidentgrade {
    public Emeraccidentgrade findEmeraccidentgradeById(String dagID);
//    public List<Emeraccidentgrade> getEmeraccidentgrade();
//
    public String addEmeraccidentgrade(Emeraccidentgrade emeraccidentgrade);
//    public Emeraccidentgrade deleteEmeraccidentgrade(String dagID);
    public int updateEmeraccidentgrade(Emeraccidentgrade emeraccidentgrade);
}
