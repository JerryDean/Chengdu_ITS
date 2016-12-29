package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.YjxtEmergencydispose;

public interface YjxtEmergencydisposeService {
	
    public String insertEmergencydispose(YjxtEmergencydispose yjxtEmergencydispose);

    public List<YjxtEmergencydispose> getEmergencydispose();

    public List<YjxtEmergencydispose> getListEmergencydisposeByPlanID(String planID);

    public YjxtEmergencydispose getEmergencydisposeById(String emergencyId);

    public int updateEmergencydispose(YjxtEmergencydispose yjxtEmergencydispose);

    public int deleteYjxtEmergencydisposeByID2(YjxtEmergencydispose yjxtEmergencydispose);

}
