package com.ste.emer.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.ste.emer.dao.TaxiGpsMapper;
import com.ste.emer.model.TaxiGps;
import com.ste.emer.service.TaxiGpsService;

/**
 * Created by hc on 2015/3/4.
 */

@Service
public class TaxiGpsServiceImpl implements TaxiGpsService {

	private TaxiGpsMapper taxiGpsMapper;	
	
    @Override
    public List<TaxiGps> getTaxiGps() {
        return taxiGpsMapper.getTaxiGps();
    }

}
