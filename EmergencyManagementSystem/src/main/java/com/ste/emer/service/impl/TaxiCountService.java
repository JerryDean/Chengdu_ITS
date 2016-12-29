package com.ste.emer.service.impl;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ste.emer.model.GatherTaxi;
import com.ste.emer.model.TaxiGps;
import com.ste.emer.service.TaxiGpsService;
import com.ste.emer.util.DistanceUtil;
import com.ste.emer.util.NumberRangeUtil;
import com.ste.emer.util.PropertiesUtil;

/**
 * Created by hc on 2015/3/6.
 */
public class TaxiCountService {
    List<TaxiGps> list = new ArrayList<TaxiGps>();

//    List<TaxiGps> list1 = new ArrayList<TaxiGps>(); //发生聚集的出租车集合

    List<GatherTaxi> list2 = new ArrayList<GatherTaxi>(); //GatherTaxi实体里面全部存放发生聚集的出租车信息

    @Autowired
    private TaxiGpsService taxiGpsService;
    
    int sum = 0;

    public List<GatherTaxi> gather(){
        double x = Double.parseDouble(PropertiesUtil.x);
        double y = Double.parseDouble(PropertiesUtil.y);
        int r = Integer.parseInt(PropertiesUtil.r);
        int max = NumberRangeUtil.getNumber(r);
        list =  taxiGpsService.getTaxiGps();//获取taxiGPS的

        /*
        遍历查找到的出租车集合。
         */
        for (TaxiGps t : list){
         double x1 = t.getTaxiX();
         double y1 = t.getTaxiY();
         double z = DistanceUtil.GetDistance(x,y,x1,y1);
            if (r>=z) {
                sum = ++sum;

                if (sum >= max) {
//                System.out.println("发生出租车聚集了");
//                TaxiGpsService ts = new TaxiGpsService();
//                TaxiGps taxiGps = new TaxiGps();
//                taxiGps.setTaxiId(t.getTaxiId());
//                taxiGps.setTaxiX(t.getTaxiX());
//                taxiGps.setTaxiY(t.getTaxiY());

                    GatherTaxi gatherTaxi = new GatherTaxi();
                    gatherTaxi.setGtaxiId(t.getTaxiId());
                    gatherTaxi.setTaxiX(t.getTaxiX());
                    gatherTaxi.setTaxiY(t.getTaxiY());
                    list2.add(gatherTaxi);
//                for (TaxiGps tt : list1){
//                    GatherTaxi gatherTaxi = new GatherTaxi();
//                    String gID = tt.getTaxiId();
//                    String gx = tt.getTaxiX();
//                    String gy = tt.getTaxiY();
//
//                    gatherTaxi.setGtaxiId(gID);
//                    gatherTaxi.setTaxiX(gx);
//                    gatherTaxi.setTaxiY(gy);
//
//                    list2.add(gatherTaxi);
//                }
                }
            }

        }
        return list2;
    }

}
