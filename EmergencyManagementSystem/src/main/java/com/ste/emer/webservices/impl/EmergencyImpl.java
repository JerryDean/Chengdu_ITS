package com.ste.emer.webservices.impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ste.emer.model.YjxtDictionary;
import com.ste.emer.model.YjxtDictionaryType;
import com.ste.emer.model.YjxtEdisposeflow;
import com.ste.emer.model.YjxtEmergencydispose;
import com.ste.emer.model.YjxtIncident;
import com.ste.emer.model.YjxtIncidentflow;
import com.ste.emer.model.YjxtPlan;
import com.ste.emer.model.YjxtPlanClassification;
import com.ste.emer.model.YjxtReport;
import com.ste.emer.model.YjxtViewdictionary;
import com.ste.emer.model.YjxtViewreport;
import com.ste.emer.service.YjxtDictionaryService;
import com.ste.emer.service.YjxtDictionaryTypeService;
import com.ste.emer.service.YjxtEdisposeflowService;
import com.ste.emer.service.YjxtEmergencydisposeService;
import com.ste.emer.service.YjxtIncidentFlowService;
import com.ste.emer.service.YjxtIncidentService;
import com.ste.emer.service.YjxtPlanClassificationService;
import com.ste.emer.service.YjxtPlanService;
import com.ste.emer.service.YjxtReportService;
import com.ste.emer.webservices.IEmergency;

/**
 * Created by neo on 2014/12/16.
 * Modify by lion on 2015/08/19
 */
@WebService(endpointInterface = "com.ste.emer.webservices.IEmergency")
@Component("EmergencyService")
public class EmergencyImpl implements IEmergency{
	
	
	@Autowired
	private YjxtDictionaryService yjxtDictionaryService;
	
	@Autowired
	private YjxtPlanService yjxtPlanService;
	
	@Autowired
	private YjxtIncidentService yjxtIncidentService;
	
	@Autowired
	private YjxtEmergencydisposeService  yjxtEmergencydisposeService;
	
	@Autowired
	private YjxtEdisposeflowService yjxtEdisposeflowService;
	
	@Autowired
	private YjxtIncidentFlowService yjxtIncidentFlowService;
	
	@Autowired
	private YjxtReportService yjxtReportService;
	
	@Autowired
	private YjxtDictionaryTypeService yjxtDictionaryTypeService;
	
	@Autowired
	private YjxtPlanClassificationService yjxtPlanClassificationService;
	
    @Override
    public YjxtDictionary deleteDictionary(String dicID) {
        return yjxtDictionaryService.deleteDictionary(dicID);
    }

    @Override
    public List<YjxtViewdictionary> getViewDictionary() {
        return yjxtDictionaryService.getViewDictionary();
    }

    @Override
    public List<YjxtDictionary> getDictionary() {
        return yjxtDictionaryService.getDictionary();
    }

    @Override
    public String insertDictionary(YjxtDictionary yjxtDictionary) {
        return yjxtDictionaryService.insertDictionary(yjxtDictionary);
    }

    @Override
    public int updateDictionary(YjxtDictionary yjxtDictionary) {
        return yjxtDictionaryService.updateDictionary(yjxtDictionary);
    }

    @Override
    public YjxtDictionary getDictionaryById(String dicID) {
        return yjxtDictionaryService.getDictionaryById(dicID);
    }

    @Override
    public List<YjxtPlan> getListPlan() {
        return yjxtPlanService.getPlan();
    }

    @Override
    public YjxtPlan findYjxtPlanById(String planId) {
        return yjxtPlanService.findYjxtPlanById(planId);
    }

    @Override
    public String insertPlan(YjxtPlan yjxtPlan) {
        return yjxtPlanService.insertPlan(yjxtPlan);
    }

    @Override
    public int updatePlan(YjxtPlan yjxtPlan) {
        return yjxtPlanService.updatePlan(yjxtPlan);
    }

    @Override
    public List<YjxtIncident> getIncident() {
        return yjxtIncidentService.getIncident();
    }

    @Override
    public YjxtIncident findYjxtIncidentById(String incidentID) {
        return yjxtIncidentService.findYjxtIncidentById(incidentID);
    }

    @Override
    public String insertIncident(YjxtIncident yjxtIncident) {
     //   YjxtIncidentFlowDao yjxtIncidentFlowDao = new YjxtIncidentFlowDao();
        String s = null;
        s = yjxtIncidentService.insertIncident(yjxtIncident);
//        if(s != null){
//            YjxtIncidentflow yjxtIncidentflow =
//                    new YjxtIncidentflow();
//            yjxtIncidentflow.setIncidentName(yjxtIncident.getIncidentName());
//            this.insertIncidentFlow(yjxtIncidentflow);
//        }
        return s;
    }

    @Override
    public int updateIncident(YjxtIncident yjxtIncident) {
   //     YjxtIncidentFlowDao yjxtIncidentFlowDao = new YjxtIncidentFlowDao();
        int i = 0;
        i = yjxtIncidentService.updateIncident(yjxtIncident);
//        if( i != 0){
//            YjxtIncidentflow yjxtIncidentflow =
//                    new YjxtIncidentflow();
//            yjxtIncidentflow.setIncidentName(yjxtIncident.getIncidentName());
//            this.insertIncidentFlow(yjxtIncidentflow);
//        }
        return i;
    }

    @Override
    public List<YjxtEmergencydispose> getListEmergencydispose() {
        return yjxtEmergencydisposeService.getEmergencydispose();
    }

    @Override
    public YjxtEmergencydispose getEmergencydisposeById(String emergencyId) {
        return yjxtEmergencydisposeService.getEmergencydisposeById(emergencyId);
    }

//    @Override
//    public String insertEmergencydispose(YjxtEmergencydispose yjxtEmergencydispose) {
//        return null;
//    }

//    @Override
//    public String insertEmergencydispose(YjxtEmergencydispose yjxtEmergencydispose) {
//        YjxtEmergencydisposeDao yjxtEmergencydisposeDao = new YjxtEmergencydisposeDao();
//        String p = yjxtEmergencydispose.getPlanId();
//        int i = yjxtEmergencydispose.getIncidentLevel();
//        List<YjxtEmergencydispose> list = yjxtEmergencydisposeDao.getEmergencydispose();
//        for (YjxtEmergencydispose l : list){
//            if (p != null){
//                if (p.equals(l.getPlanId()) && i == l.getIncidentLevel()){
//                    this.deleteYjxtEmergencydisposeByID2(l);
//                }
//            }
//        }
//
//        return yjxtEmergencydisposeDao.insertEmergencydispose(yjxtEmergencydispose);
//    }

    public String insertEmergencydispose1(List<YjxtEmergencydispose> list) {
        								   
        List<YjxtEmergencydispose> list1 = yjxtEmergencydisposeService.getEmergencydispose();
        if (list.size()>0) {
            String p = list.get(0).getPlanId();
            int i = list.get(0).getIncidentLevel();
            for (YjxtEmergencydispose l : list1) {
                if (p != null) {
                    if (p.equals(l.getPlanId()) && i == l.getIncidentLevel()) {
                        this.deleteYjxtEmergencydisposeByID2(l);
                    }
                }
            }
        }
        for (YjxtEmergencydispose ed : list){
           String st = yjxtEmergencydisposeService.insertEmergencydispose(ed);
        }
        return "000000";
    }



    @Override
    public int updateEmergencydispose(YjxtEmergencydispose yjxtEmergencydispose) {
        return yjxtEmergencydisposeService.updateEmergencydispose(yjxtEmergencydispose);
    }

    @Override
    public List<YjxtIncidentflow> getListIncidentFlow() {
        return yjxtIncidentFlowService.getIncidentFlow();
    }

    @Override
    public String insertIncidentFlow(YjxtIncidentflow yjxtIncidentFlow) {
        return yjxtIncidentFlowService.insertIncidentFlow(yjxtIncidentFlow);
    }

    @Override
    public int updateIncidentFlow(YjxtIncidentflow incidentFlow) {
        return yjxtIncidentFlowService.updateIncidentFlow(incidentFlow);
    }

    @Override
    public List<YjxtViewreport> getListViewreport() {
        return yjxtReportService.getViewReport();
    }

    @Override
    public String insertReport(YjxtReport yr) {
        String p = yr.getIncidentId();
        List<YjxtReport> list = yjxtReportService.getReport();
        for (YjxtReport l : list){
            if (p != null) {
                if (p.equals(l.getIncidentId())) {
                    this.deleteReportByIncidentID(p);
                }
            }
        }
        return yjxtReportService.insertReport(yr);
    }

    @Override
    public int deleteReportByPlanID(String planID) {
        return yjxtReportService.deleteReportByPlanID(planID);
    }

    @Override
    public int deleteReportByIncidentID(String incidentID) {
        return yjxtReportService.deleteReportByIncidentID(incidentID);
    }

    @Override
    public List<YjxtEdisposeflow> getListEdisposeflow() {
        return yjxtEdisposeflowService.getEdisposeflow();
    }

    @Override
    public String insertEdisposeflow(YjxtEdisposeflow ye) {
        return yjxtEdisposeflowService.insertEdisposeflow(ye);
    }

    @Override
    public List<YjxtReport> getListReport() {
        return yjxtReportService.getReport();
    }

    @Override
    public List<YjxtEmergencydispose> getListEmergencydisposeByPlanID(String planID) {
        return yjxtEmergencydisposeService.getListEmergencydisposeByPlanID(planID);
    }

    @Override
    public int deleteYjxtEmergencydisposeByID2(YjxtEmergencydispose yjxtEmergencydispose) {
        return yjxtEmergencydisposeService.deleteYjxtEmergencydisposeByID2(yjxtEmergencydispose);
    }

    @Override
    public List<YjxtDictionaryType> getDictionaryType() {
        return yjxtDictionaryTypeService.getDictionaryType();
    }

    @Override
    public YjxtPlanClassification getYjxtPlanClassificationById(String pcID) {
        return yjxtPlanClassificationService.getYjxtPlanClassificationById(pcID);
    }

    @Override
    public List<YjxtPlanClassification> getYjxtPlanClassificationByPlanId(String planID) {
        return yjxtPlanClassificationService.getYjxtPlanClassificationByPlanId(planID);
    }

//    @Override
//    public String insertYjxtPlanClassification(YjxtPlanClassification yjxtPlanClassification) {
//        YjxtPlanClassificationDao yjxtPlanClassificationDao = new YjxtPlanClassificationDao();
//        String p = yjxtPlanClassification.getPlanID();
//        List<YjxtPlanClassification> list = this.getListYjxtPlanClassification();
//        for (YjxtPlanClassification l : list){
//            String p1 = l.getPlanID();
//            if (p != null) {
//                if (p.equals(p1)) {
//                    this.deleteYjxtPlanClassificationByPlanId(p);
//                }
//            }
//        }
//        return yjxtPlanClassificationDao.insertYjxtPlanClassification(yjxtPlanClassification);
//    }

    @Override
    public YjxtPlanClassification deleteYjxtPlanClassification(String pcID) {
        return yjxtPlanClassificationService.deleteYjxtPlanClassification(pcID);
    }

    @Override
    public int updateYjxtPlanClassification(YjxtPlanClassification yjxtPlanClassification) {
        return yjxtPlanClassificationService.updateYjxtPlanClassification(yjxtPlanClassification);
    }

    @Override
    public int deleteYjxtPlanClassificationByPlanId(String planID) {
        return yjxtPlanClassificationService.deleteYjxtPlanClassificationByPlanId(planID);
    }

    @Override
    public List<YjxtPlanClassification> getListYjxtPlanClassification() {
        return yjxtPlanClassificationService.getListYjxtPlanClassification();
    }

    @Override
    public String insertYjxtPlanClassification11(List<YjxtPlanClassification> list) {
        if (list.size()>0) {
            String p = list.get(0).getPlanID();
            List<YjxtPlanClassification> list1 = this.getListYjxtPlanClassification();
            for (YjxtPlanClassification l : list1) {
                if (p != null) {
                    if (p.equals(l.getPlanID())) {
                        this.deleteYjxtPlanClassificationByPlanId(p);
                    }
                }
            }
        }
        for (YjxtPlanClassification pc : list){
        	yjxtPlanClassificationService.insertYjxtPlanClassification(pc);
        }
        return "000000";
    }

}
