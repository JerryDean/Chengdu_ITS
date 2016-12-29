package com.ste.emer.service;



import java.util.List;

import com.ste.emer.model.GatherTaxi;

/**
 * Created by hc on 2015/3/25.
 */
public interface GatherTaxiS {
    public void insertGatherTaxi(GatherTaxi gatherTaxi);
    public List<GatherTaxi> getGatherTaxi();

    public void deleteGatherTaxi();
}
