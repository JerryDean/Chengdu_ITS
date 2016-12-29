package com.ste.emer.service.impl;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.GatherTaxiMapper;
import com.ste.emer.dao.YjxtIncidentFlowMapper;
import com.ste.emer.dao.YjxtIncidentMapper;
import com.ste.emer.model.GatherTaxi;
import com.ste.emer.model.YjxtIncident;
import com.ste.emer.model.YjxtIncidentflow;
import com.ste.emer.service.GatherTaxiService;
import com.ste.emer.util.PropertiesUtil;

/**
 * Created by hc on 2015/3/10.
 */
@Service
public class GatherTaxiServiceImpl implements GatherTaxiService {

	@Autowired
	private GatherTaxiMapper gatherTaxiMapper;
	
	@Autowired
	private YjxtIncidentFlowMapper yjxtIncidentFlowMapper;
	
	@Autowired
	private YjxtIncidentMapper yjxtIncidentMapper;
	
//    public void insertGatherTaxi(GatherTaxi gatherTaxi) {
//            GatherTaxiDao gatherTaxiDao = new GatherTaxiDao();
//        TaxiCountService t = new TaxiCountService();
//        List<GatherTaxi> list = new ArrayList<GatherTaxi>();
//        list = t.gather();
//        for (GatherTaxi gt : list){
//            gatherTaxiDao.insertGatherTaxi(gt);
//        }
//             gatherTaxiDao.insertGatherTaxi(gatherTaxi);
//    }
    @Override
    public YjxtIncidentflow addListTaxi(){

        TaxiCountService t = new TaxiCountService();
        List<GatherTaxi> list = new ArrayList<GatherTaxi>();
        list = t.gather();
        YjxtIncident yj = new YjxtIncident();
        YjxtIncidentflow yy = new YjxtIncidentflow();
        if (list != null) {
            yj.setIncidentName("出租车聚集");
            yj.setPlanID("5");
            yj.setIncidentState(1);
            yj.setIncidentX(PropertiesUtil.x);
            yj.setIncidentY(PropertiesUtil.y);
            yj.setIncidentType(4);
            yj.setIncidentSubType(5);
            yj.setCreateDate(new Date());
            yj.setIsEnd(1);
            yj.setStartTime(new Date());
            yj.setOrganID(161);
            yjxtIncidentMapper.insertIncident(yj);  //获取事件表主键
//            System.out.print(yy.getIncidentName());

            yy.setIncidentID(yj.getIncidentID());
            yy.setPlanID(yj.getPlanID());
            yy.setIncidentState(yj.getIncidentState());
            yy.setIncidentName(yj.getIncidentName());
            yy.setIncidentX(yj.getIncidentX());
            yy.setIncidentY(yj.getIncidentY());
            yy.setIncidentType(yj.getIncidentType());
            yy.setIncidentSubType(yj.getIncidentSubType());
            yy.setCreateDate(yj.getCreateDate());
            yy.setIsEnd(yj.getIsEnd());
            yy.setStartTime(yj.getStartTime());
            yy.setOrganID(yj.getOrganID());

            yjxtIncidentFlowMapper.insertIncidentFlow(yy);

        }
        for (GatherTaxi gt : list){
        	gatherTaxiMapper.insertGatherTaxi(gt);
        }
        return yy;
    }

    @Override
    public void restore() {
        YjxtIncidentflow yy = new YjxtIncidentflow();
        yy.setIncidentName("出租车聚集");
        yjxtIncidentFlowMapper.deleteIncidentByName(yy);
        YjxtIncident yjxtIncident = new YjxtIncident();
        yjxtIncident.setIncidentName("出租车聚集");
        yjxtIncidentMapper.deleteIncident(yjxtIncident);


        gatherTaxiMapper.deleteGatherTaxi();
    }

}
