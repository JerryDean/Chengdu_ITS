package com.ste.emer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.YjxtPlanMapper;
import com.ste.emer.model.YjxtPlan;
import com.ste.emer.service.YjxtPlanService;


@Service
public class YjxtPlanServiceImpl implements YjxtPlanService {
	
	@Autowired
	private YjxtPlanMapper yjxtPlanMapper;
	
    public String insertPlan(YjxtPlan yjxtPlan){
    	
    	yjxtPlanMapper.insertPlan(yjxtPlan);
        
    	return yjxtPlan.getPlanId();
    }

    public List<YjxtPlan> getPlan(){
        return yjxtPlanMapper.getPlan();
    }

    @Override
    public YjxtPlan findYjxtPlanById(String planId) {
    	
        return yjxtPlanMapper.findYjxtPlanById(planId);
    }

    @Override
    public int updatePlan(YjxtPlan yjxtPlan) {
    	
    	return yjxtPlanMapper.updatePlan(yjxtPlan);
    }
}
