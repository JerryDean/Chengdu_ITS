package com.ste.emer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.YjxtPlanClassificationMapper;
import com.ste.emer.model.YjxtPlanClassification;
import com.ste.emer.service.YjxtPlanClassificationService;

@Service
public class YjxtPlanClassificationServiceImpl implements
		YjxtPlanClassificationService {
	
	@Autowired
	private YjxtPlanClassificationMapper yjxtPlanClassificationMapper;	

	@Override
	public List<YjxtPlanClassification> getYjxtPlanClassificationByPlanId(
			String planID) {
		return yjxtPlanClassificationMapper.getYjxtPlanClassificationByPlanId(planID);
	}

	@Override
	public int deleteYjxtPlanClassificationByPlanId(String planID) {
		return yjxtPlanClassificationMapper.deleteYjxtPlanClassificationByPlanId(planID);
	}

	@Override
	public YjxtPlanClassification getYjxtPlanClassificationById(String pcID) {
		return yjxtPlanClassificationMapper.getYjxtPlanClassificationById(pcID);
	}

	@Override
	public void insertYjxtPlanClassification(
			YjxtPlanClassification yjxtPlanClassification) {
		yjxtPlanClassificationMapper.insertYjxtPlanClassification(yjxtPlanClassification);
	}

	@Override
	public YjxtPlanClassification deleteYjxtPlanClassification(String pcID) {
		return yjxtPlanClassificationMapper.deleteYjxtPlanClassification(pcID);
	}

	@Override
	public int updateYjxtPlanClassification(
			YjxtPlanClassification yjxtPlanClassification) {
		return yjxtPlanClassificationMapper.updateYjxtPlanClassification(yjxtPlanClassification);
	}

	@Override
	public List<YjxtPlanClassification> getListYjxtPlanClassification() {
		return yjxtPlanClassificationMapper.getListYjxtPlanClassification();
	}

	
	
}
