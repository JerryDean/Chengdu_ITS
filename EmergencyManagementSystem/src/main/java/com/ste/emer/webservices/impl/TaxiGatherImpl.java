package com.ste.emer.webservices.impl;



import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ste.emer.model.GatherTaxi;
import com.ste.emer.model.TaxiGps;
import com.ste.emer.model.YjxtIncidentflow;
import com.ste.emer.service.GatherTaxiS;
import com.ste.emer.service.GatherTaxiService;
import com.ste.emer.service.TaxiGpsService;
import com.ste.emer.webservices.ITaxiGather;

import java.util.List;

/**
 * Created by hc on 2015/3/11.
 */
@WebService(endpointInterface = "com.ste.emer.webservices.ITaxiGather")
@Component("TaxiGatherService")
public class TaxiGatherImpl implements ITaxiGather{

	@Autowired
	private GatherTaxiService gatherTaxiService;
	
	@Autowired
	private GatherTaxiS gatherTaxiS;
	
	@Autowired
	private TaxiGpsService taxiGpsService;
	
    @Override
    public YjxtIncidentflow addListGatherTaxi() {
        return gatherTaxiService.addListTaxi();
    }

    @Override
    public void restore() {
    	gatherTaxiService.restore();
    }

    @Override
    public List<GatherTaxi> getGatherTaxi() {
        return gatherTaxiS.getGatherTaxi();
    }

    @Override
    public List<TaxiGps> getTaxiGps() {
        return taxiGpsService.getTaxiGps();
    }

    @Override
    public void deleteGatherTaxi() {
    	gatherTaxiS.deleteGatherTaxi();
    }
}
