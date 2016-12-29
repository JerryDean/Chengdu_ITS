package com.ste.emer.dao;

import com.ste.emer.model.YjxtPlanClassification;

import java.util.List;

/**
 * Created by st on 2015/1/15.
 */
public interface YjxtPlanClassificationMapper {
    public List<YjxtPlanClassification> getYjxtPlanClassificationByPlanId(String planID);
    public int deleteYjxtPlanClassificationByPlanId(String planID);
    public YjxtPlanClassification getYjxtPlanClassificationById(String pcID);
    public void insertYjxtPlanClassification(YjxtPlanClassification yjxtPlanClassification);
    public YjxtPlanClassification deleteYjxtPlanClassification(String pcID);
    public int updateYjxtPlanClassification(YjxtPlanClassification yjxtPlanClassification);

    public List<YjxtPlanClassification> getListYjxtPlanClassification();
}
