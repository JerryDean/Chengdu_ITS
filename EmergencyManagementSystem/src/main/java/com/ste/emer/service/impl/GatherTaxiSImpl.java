package com.ste.emer.service.impl;


import com.ste.emer.dao.GatherTaxiMapper;
import com.ste.emer.model.GatherTaxi;
import com.ste.emer.service.GatherTaxiS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hc on 2015/3/25.
 */
@Service
public class GatherTaxiSImpl implements GatherTaxiS {

	@Autowired
	private GatherTaxiMapper gatherTaxiMapper;
	
    @Override
    public void insertGatherTaxi(GatherTaxi gatherTaxi) {
    	gatherTaxiMapper.insertGatherTaxi(gatherTaxi);
    }

    @Override
    public List<GatherTaxi> getGatherTaxi() {
        return gatherTaxiMapper.getGatherTaxi();
    }

    @Override
    public void deleteGatherTaxi() {
    	gatherTaxiMapper.deleteGatherTaxi();
    }
}
