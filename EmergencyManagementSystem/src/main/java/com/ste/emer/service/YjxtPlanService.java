package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.YjxtPlan;

public interface YjxtPlanService {
	
	public String insertPlan(YjxtPlan yjxtPlan);
    public List<YjxtPlan> getPlan();
    public YjxtPlan findYjxtPlanById(String planId);
    public int updatePlan(YjxtPlan yjxtPlan);

}
