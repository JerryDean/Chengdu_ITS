package com.ste.emer.dao;

import com.ste.emer.model.YjxtPlan;

import java.util.List;

/**
 * Created by st on 2014/12/30.
 */
public interface YjxtPlanMapper {
    public void insertPlan(YjxtPlan yjxtPlan);
    public List<YjxtPlan> getPlan();
    public YjxtPlan findYjxtPlanById(String planId);
    public int updatePlan(YjxtPlan yjxtPlan);
}
