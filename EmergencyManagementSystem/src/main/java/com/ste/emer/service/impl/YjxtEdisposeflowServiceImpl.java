package com.ste.emer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.YjxtEdisposeflowMapper;
import com.ste.emer.model.YjxtEdisposeflow;
import com.ste.emer.service.YjxtEdisposeflowService;

@Service
public class YjxtEdisposeflowServiceImpl implements YjxtEdisposeflowService {

	@Autowired
	private YjxtEdisposeflowMapper yjxtEdisposeflowMapper;
	
	@Override
	public String insertEdisposeflow(YjxtEdisposeflow yjxtEdisposeflow) {
		yjxtEdisposeflowMapper.insertEdisposeflow(yjxtEdisposeflow);
		return yjxtEdisposeflow.geteDisID();
	}

	@Override
	public List<YjxtEdisposeflow> getEdisposeflow() {
		return yjxtEdisposeflowMapper.getEdisposeflow();
	}

}
