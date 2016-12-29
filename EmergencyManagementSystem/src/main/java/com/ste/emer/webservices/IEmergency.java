package com.ste.emer.webservices;

import java.util.List;

import javax.jws.WebService;

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

/**
 * Created by neo on 2014/12/16.
 */
@WebService
public interface IEmergency {
	/**
	 * 字典
	 * 
	 */
	// 字典表查询
	@Deprecated
	List<YjxtViewdictionary> getViewDictionary();

	List<YjxtDictionary> getDictionary();

	// 添加字典
	String insertDictionary(YjxtDictionary yjxtDictionary);

	// 修改字典
	int updateDictionary(YjxtDictionary yjxtDictionary);

	YjxtDictionary getDictionaryById(String dicID);

	YjxtDictionary deleteDictionary(String dicID);

	/**
	 * 计划
	 * 
	 */
	// 查询计划
	List<YjxtPlan> getListPlan();

	YjxtPlan findYjxtPlanById(String planId);

	String insertPlan(YjxtPlan yjxtPlan);

	int updatePlan(YjxtPlan yjxtPlan);

	/**
	 * 事件
	 * 
	 */
	// 事件查询
	List<YjxtIncident> getIncident();

	YjxtIncident findYjxtIncidentById(String incidentID);

	// 添加事件
	String insertIncident(YjxtIncident yjxtIncident);

	// 修改事件
	int updateIncident(YjxtIncident yjxtIncident);

	/**
	 * 处理流程
	 */

	// 应急事件处理查询
	List<YjxtEmergencydispose> getListEmergencydispose();

	YjxtEmergencydispose getEmergencydisposeById(String emergencyId);

	// 添加应急
	String insertEmergencydispose1(List<YjxtEmergencydispose> list);

	int updateEmergencydispose(YjxtEmergencydispose yjxtEmergencydispose);

	List<YjxtEmergencydispose> getListEmergencydisposeByPlanID(String planID);

	public int deleteYjxtEmergencydisposeByID2(YjxtEmergencydispose yjxtEmergencydispose);

	/**
	 * 事件流程
	 * 
	 */

	// 事件流程查询
	List<YjxtIncidentflow> getListIncidentFlow();

	// 事件流程添加或修改
	String insertIncidentFlow(YjxtIncidentflow yjxtIncidentFlow);

	int updateIncidentFlow(YjxtIncidentflow incidentFlow);

	// 报告表查询
	@Deprecated
	List<YjxtViewreport> getListViewreport();

	/**
	 * 报告
	 * 
	 *
	 */

	// 报告表添加或修改
	String insertReport(YjxtReport yr);

	int deleteReportByPlanID(String planID);

	int deleteReportByIncidentID(String incidentID);

	List<YjxtReport> getListReport();

	/**
	 * 应急流程
	 * 
	 */

	// 应急事件流程查询
	List<YjxtEdisposeflow> getListEdisposeflow();

	// 应急事件流程添加或修改
	String insertEdisposeflow(YjxtEdisposeflow ye);

	@Deprecated
	List<YjxtDictionaryType> getDictionaryType();

	/**
	 * 预案分级
	 */

	// 分级标准表
	YjxtPlanClassification getYjxtPlanClassificationById(String pcID);

	List<YjxtPlanClassification> getYjxtPlanClassificationByPlanId(String planID);

	// String insertYjxtPlanClassification(YjxtPlanClassification
	// yjxtPlanClassification);

	YjxtPlanClassification deleteYjxtPlanClassification(String pcID);

	int updateYjxtPlanClassification(YjxtPlanClassification yjxtPlanClassification);

	int deleteYjxtPlanClassificationByPlanId(String planID);

	List<YjxtPlanClassification> getListYjxtPlanClassification();

	String insertYjxtPlanClassification11(List<YjxtPlanClassification> list);
}
