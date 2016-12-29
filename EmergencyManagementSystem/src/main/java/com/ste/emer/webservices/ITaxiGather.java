package com.ste.emer.webservices;



import javax.jws.WebService;


import com.ste.emer.model.GatherTaxi;
import com.ste.emer.model.TaxiGps;
import com.ste.emer.model.YjxtIncidentflow;

import java.util.List;

/**
 * Created by hc on 2015/3/11.
 */
@WebService
public interface ITaxiGather {

    public YjxtIncidentflow addListGatherTaxi();
    public void restore();

    public List<GatherTaxi> getGatherTaxi();
    public List<TaxiGps> getTaxiGps();

    public void deleteGatherTaxi();
}
