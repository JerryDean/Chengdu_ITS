package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.YjxtPlanClassification;

public interface YjxtPlanClassificationService {

    public List<YjxtPlanClassification> getYjxtPlanClassificationByPlanId(String planID);
    public int deleteYjxtPlanClassificationByPlanId(String planID);
    public YjxtPlanClassification getYjxtPlanClassificationById(String pcID);
    public void insertYjxtPlanClassification(YjxtPlanClassification yjxtPlanClassification);
    public YjxtPlanClassification deleteYjxtPlanClassification(String pcID);
    public int updateYjxtPlanClassification(YjxtPlanClassification yjxtPlanClassification);
    public List<YjxtPlanClassification> getListYjxtPlanClassification();


}
