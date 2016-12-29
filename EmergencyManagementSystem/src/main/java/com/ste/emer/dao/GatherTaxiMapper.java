package com.ste.emer.dao;



import java.util.List;

import com.ste.emer.model.GatherTaxi;

/**
 * Created by hc on 2015/3/10.
 */
public interface GatherTaxiMapper {
    public void insertGatherTaxi(GatherTaxi gatherTaxi);
    public List<GatherTaxi> getGatherTaxi();
    public void deleteGatherTaxi();
}
