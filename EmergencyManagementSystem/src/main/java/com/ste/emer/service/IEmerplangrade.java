package com.ste.emer.service;

import com.ste.emer.model.Emerplangrade;

import java.util.List;

/**
 * Created by st on 2014/12/30.
 */
public interface IEmerplangrade {
    public List<Emerplangrade> getEmerplangrade();
    public Emerplangrade findEmerplangradeById(String pgValue);
    public String deleteEmerplangrade(String pgValue);
    public String addEmerplangrade(Emerplangrade emerplangrade);
    public int updateEmerplangrade(Emerplangrade emerplangrade);
}
