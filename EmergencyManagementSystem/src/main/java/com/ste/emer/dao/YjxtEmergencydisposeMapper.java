package com.ste.emer.dao;

import com.ste.emer.model.YjxtEmergencydispose;

import java.util.List;

/**
 * Created by st on 2014/12/30.
 */
public interface YjxtEmergencydisposeMapper {
    public void insertEmergencydispose(YjxtEmergencydispose yjxtEmergencydispose);

    public List<YjxtEmergencydispose> getEmergencydispose();

    public List<YjxtEmergencydispose> getListEmergencydisposeByPlanID(String planID);

    public YjxtEmergencydispose getEmergencydisposeById(String emergencyId);

    public int updateEmergencydispose(YjxtEmergencydispose yjxtEmergencydispose);

    public int deleteYjxtEmergencydisposeByID2(YjxtEmergencydispose yjxtEmergencydispose);
}