package com.ste.emer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.YjxtEmergencydisposeMapper;
import com.ste.emer.model.YjxtEmergencydispose;
import com.ste.emer.service.YjxtEmergencydisposeService;


@Service
public class YjxtEmergencydisposeServiceImpl implements
		YjxtEmergencydisposeService {

	@Autowired
	private YjxtEmergencydisposeMapper yjxtEmergencydisposeMapper;
	
	@Override
	public String insertEmergencydispose(
			YjxtEmergencydispose yjxtEmergencydispose) {
		 yjxtEmergencydisposeMapper.insertEmergencydispose(yjxtEmergencydispose);
		 return yjxtEmergencydispose.getEmergencyId();
	}

	@Override
	public List<YjxtEmergencydispose> getEmergencydispose() {
		return yjxtEmergencydisposeMapper.getEmergencydispose();
	}

	@Override
	public List<YjxtEmergencydispose> getListEmergencydisposeByPlanID(
			String planID) {
		return yjxtEmergencydisposeMapper.getListEmergencydisposeByPlanID(planID);
	}

	@Override
	public YjxtEmergencydispose getEmergencydisposeById(String emergencyId) {
		return yjxtEmergencydisposeMapper.getEmergencydisposeById(emergencyId);
	}

	@Override
	public int updateEmergencydispose(YjxtEmergencydispose yjxtEmergencydispose) {
		return yjxtEmergencydisposeMapper.updateEmergencydispose(yjxtEmergencydispose);
	}

	@Override
	public int deleteYjxtEmergencydisposeByID2(
			YjxtEmergencydispose yjxtEmergencydispose) {
		return yjxtEmergencydisposeMapper.deleteYjxtEmergencydisposeByID2(yjxtEmergencydispose);
	}

}
