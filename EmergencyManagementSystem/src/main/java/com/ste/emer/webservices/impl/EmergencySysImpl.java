package com.ste.emer.webservices.impl;

import com.ste.emer.model.*;
import com.ste.emer.service.*;
import com.ste.emer.webservices.IEmergencySys;
import com.stee.dsms.model.PageInfo;
import com.stee.dsms.model.PageResult;
import com.stee.dsms.model.Result;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * Copyright @ 2007, ST Electronics Info-comm Systems PTE. LTD All rights
 * reserved.
 *
 * This software is confidential and proprietary property of ST Electronics
 * Info-comm Systems PTE. LTD. The user shall not disclose the contents of this
 * software and shall only use it in accordance with the terms and conditions
 * stated in the contract or licence agreement with ST Electronics Info-comm
 * Systems PTE. LTD.
 *
 * Project Name : emergency
 * <p>
 * PackageName : com.ste.emer.webservices.impl
 * </p>
 * <p>
 * ClassName : EmergencySysImpl.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-10-28
 * </p>
 *
 * @author dengbowen
 * @version 1.0
 *
 */

@WebService(endpointInterface = "com.ste.emer.webservices.IEmergencySys")
@Component("EmergencySysService")
public class EmergencySysImpl implements IEmergencySys {

	private static final Logger logger = Logger
			.getLogger(EmergencySysImpl.class);

	@Autowired
	private EmergencyIncidentService emergencyIncidentService;

	@Autowired
	private EmergencyIncidentLogService emergencyIncidentLogService;

	@Autowired
	private EmergencyIncidentResourceDetailService emergencyIncidentResourceDetailService;

	@Autowired
	private VehicleInfoService vehicleInfoService;

	@Autowired
	private TaskForEmergencyIncidentService taskForEmergencyIncidentService;

	@Autowired
	private EmergencyIncidentResourceService emergencyIncidentResourceService;

	@Autowired
	private EmergencyIncidentGISStatusService emergencyIncidentGISStatusService;

	@Autowired
	private EmergencyIncidentProposalService emergencyIncidentProposalService;

	@Autowired
	private TaskForProposalService taskForProposalService;

	@Autowired
	private EmergencySMSServive emergencySMSServive;

	/* ***********************接口方法实现************************** */
	@Override
	public VehicleInfo getVehicleInfoByPlateNumber(String plateNumber) {
		VehicleInfo vehicleInfo = null;
		try {
			vehicleInfo = vehicleInfoService
					.getVehicleInfoByPlateNumber(plateNumber);
		} catch (Exception e) {
			logger.error(e);
		}
		return vehicleInfo;
	}

	@Override
	public List<VehicleInfo> getVehicleTrack(String plateNumber,
			Date startTime, Date endTime) {
		List<VehicleInfo> list = null;
		try {
			list = vehicleInfoService.getVehicleTrack(plateNumber, startTime,
					endTime);
		} catch (Exception e) {
			logger.error(e);
		}
		return list;
	}

	@Override
	public Result addEmergencyIncidentResource(
			EmergencyIncidentResource resource) {
		Result result = null;
		try {
			result = emergencyIncidentResourceService
					.addEmergencyIncidentResource(resource);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result updateEmergencyIncidentResource(
			EmergencyIncidentResource resource) {
		Result result = null;
		try {
			result = emergencyIncidentResourceService
					.updateEmergencyIncidentResource(resource);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result deleteEmergencyIncidentResource(String resourceId) {
		Result result = null;
		try {
			result = emergencyIncidentResourceService
					.deleteEmergencyIncidentResource(resourceId);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public List<EmergencyIncidentResource> getEmergencyIncidentResource(
			EmergencyIncidentResourceTypeEnum e_resourceType, String location) {
		List<EmergencyIncidentResource> list = null;
		try {
			list = emergencyIncidentResourceService
					.getEmergencyIncidentResource(e_resourceType, location);
		} catch (Exception e) {
			logger.error(e);
		}
		return list;
	}

	@Override
	public List<Result> addEmergencyIncidentGISStatus(
			List<EmergencyIncidentGISStatus> statusList) {

		List<Result> resultList = null;

		try {
			resultList = emergencyIncidentGISStatusService
					.addEmergencyIncidentGISStatus(statusList);
		} catch (Exception e) {
			logger.error(e);
		}
		return resultList;
	}

	@Override
	public List<EmergencyIncidentGISStatus> getEmergencyIncidentGISStatus(
			String emergencyIncidentId) {

		List<EmergencyIncidentGISStatus> emergencyIncidentGISStatus = null;

		try {
			emergencyIncidentGISStatus = emergencyIncidentGISStatusService
					.getEmergencyIncidentGISStatus(emergencyIncidentId);
		} catch (Exception e) {
			logger.error(e);
		}
		return emergencyIncidentGISStatus;
	}

	@Override
	public Result addEmergencyIncident(EmergencyIncident emergencyIncident) {
		Result result = null;
		try {
			result = emergencyIncidentService
					.addEmergencyIncident(emergencyIncident);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result updateEmergencyIncident(EmergencyIncident emergencyIncident) {
		Result result = null;
		try {
			result = emergencyIncidentService
					.updateEmergencyIncident(emergencyIncident);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public List<Result> addTaskForEmergencyIncident(
			List<TaskForEmergencyIncident> tasks) {
		List<Result> list = null;
		try {
			list = taskForEmergencyIncidentService
					.addTaskForEmergencyIncident(tasks);

		} catch (Exception e) {
			logger.error(e);
		}
		return list;
	}

	@Override
	public Result updateTaskForEmergencyIncident(TaskForEmergencyIncident task) {
		Result result = null;
		try {
			result = taskForEmergencyIncidentService
					.updateTaskForEmergencyIncident(task);

		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result deleteTaskForEmergencyIncident(String taskId) {
		Result result = null;
		try {

			result = taskForEmergencyIncidentService
					.deleteTaskForEmergencyIncident(taskId);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public List<TaskForEmergencyIncident> findTaskByEmergencyIncidentId(
			String emergencyIncidentId) {
		List<TaskForEmergencyIncident> result = null;
		try {
			result = taskForEmergencyIncidentService
					.findTaskByEmergencyIncidentId(emergencyIncidentId);

		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result addEmergencyIncidentLog(
			EmergencyIncidentLog emergencyIncidentLog) {
		Result result = null;
		try {
			result = emergencyIncidentLogService
					.addEmergencyIncidentLog(emergencyIncidentLog);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

    @Override
    public Result updateEmergencyIncidentLog(EmergencyIncidentLog emergencyIncidentLog) {
		Result result = null;
        try {
            result = emergencyIncidentLogService.updateEmergencyIncidentLog(emergencyIncidentLog);
        } catch (Exception e) {
            logger.error(e);
        }
        return result;
    }

	@Override
	public Result deleteEmergencyIncidentLog(String id) {
	    Result result = null;
        try {
            result = emergencyIncidentLogService.deleteEmergencyIncidentLog(id);
        } catch (Exception e) {
            logger.error(e);
        }
		return result;
	}

	@Override
	public List<EmergencyIncidentLog> findLogByEmergencyIncidentId(
			String emergencyIncidentId) {
		List<EmergencyIncidentLog> result = null;
		try {
			result = emergencyIncidentLogService
					.findLogByEmergencyIncidentId(emergencyIncidentId);

		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result addEmergencyIncidentResourceDetail(
			EmergencyIncidentResourceDetail resource) {
		Result result = null;
		try {
			result = emergencyIncidentResourceDetailService
					.addEmergencyIncidentResourceDetail(resource);

		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result updateEmergencyIncidentResourceDetail(
			EmergencyIncidentResourceDetail resource) {
		Result result = null;
		try {
			result = emergencyIncidentResourceDetailService
					.updateEmergencyIncidentResourceDetail(resource);

		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result deleteEmergencyIncidentResourceDetail(String resourceId) {
		Result result = null;
		try {
			result = emergencyIncidentResourceDetailService
					.deleteEmergencyIncidentResourceDetail(resourceId);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public List<EmergencyIncidentResourceDetail> findResourceDetailByEmergencyIncidentId(
			String emergencyIncidentId) {
		List<EmergencyIncidentResourceDetail> result = null;
		try {
			result = emergencyIncidentResourceDetailService
					.findResourceDetailByEmergencyIncidentId(emergencyIncidentId);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result addEmergencyIncidentProposal(
			EmergencyIncidentProposal proposal) {
		Result result = null;
		try {
			result = emergencyIncidentProposalService
					.addEmergencyIncidentProposal(proposal);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;

	}

	@Override
	public Result updateEmergencyIncidentProposal(
			EmergencyIncidentProposal proposal) {
		Result result = null;
		try {
			result = emergencyIncidentProposalService
					.updateEmergencyIncidentProposal(proposal);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result deleteEmergencyIncidentProposal(String proposalId) {
		Result result = null;
		try {
			result = emergencyIncidentProposalService
					.deleteEmergencyIncidentProposal(proposalId);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public PageResult findEmergencyIncidentProposal(
			EmergencyIncidentTypeEnum type,
			EmergencyIncidentTypeSubEnum subType, String name, PageInfo pageInfo) {
		PageResult pageResult = null;
		try {
			pageResult = emergencyIncidentProposalService
					.findEmergencyIncidentProposal(type, subType, name,
							pageInfo);
		} catch (Exception e) {
			logger.error(e);
		}
		return pageResult;
	}

	@Override
	public EmergencyIncidentProposal getEmergencyIncidentProposalById(
			String proposalId) {
		EmergencyIncidentProposal emergencyIncidentProposal = null;
		try {
			emergencyIncidentProposal = emergencyIncidentProposalService
					.getEmergencyIncidentProposalById(proposalId);
		} catch (Exception e) {
			logger.error(e);
		}
		return emergencyIncidentProposal;
	}

	@Override
	public Result addTaskForEmergencyIncidentProposal(TaskForProposal task) {
		Result result = null;
		try {
			result = taskForProposalService
					.addTaskForEmergencyIncidentProposal(task);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result updateTaskForEmergencyIncidentProposal(TaskForProposal task) {
		Result result = null;
		try {
			result = taskForProposalService
					.updateTaskForEmergencyIncidentProposal(task);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public Result deleteTaskForEmergencyIncidentProposal(String taskId) {
		Result result = null;
		try {
			result = taskForProposalService
					.deleteTaskForEmergencyIncidentProposal(taskId);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	@Override
	public List<TaskForProposal> getTaskByEmergencyIncidentProposalId(
			String proposalId) {
		List<TaskForProposal> list = null;
		try {
			list = taskForProposalService
					.getTaskByEmergencyIncidentProposalId(proposalId);
		} catch (Exception e) {
			logger.error(e);
		}
		return list;
	}

	@Override
	public PageResult findEmergencyIncidentByStatus(PageInfo pageInfo,
			EmergencyIncidentStatusEnum style) {

		PageResult pageResult = null;
		try {
			pageResult = emergencyIncidentService
					.findEmergencyIncidentByStatus(pageInfo, style);
		} catch (Exception e) {
			logger.error(e);
		}
		return pageResult;
	}

	@Override
	public EmergencyIncident getEmergencyIncidentById(String id) {
		EmergencyIncident result = null;
		try {
			result = emergencyIncidentService.getEmergencyIncidentById(id);
		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

	/* *****************************应急系统短信模块********************************* */
	@Override
	public Result sendEmergencyMessage(EmergencyMsg emergencyMsg) {

		Result result = null;

		try {

			result = emergencySMSServive.sendEmergencyMessage(emergencyMsg);

		} catch (Exception e) {

			logger.error(e);

		}

		return result;
	}

	@Override
	public List<EmergencyMsg> getEmerMsgByEmergencyId(String emergencyId) {

		List<EmergencyMsg> emergencyMsgs = null;

		try {

			emergencyMsgs = emergencySMSServive
					.getEmerMsgByEmergencyId(emergencyId);

		} catch (Exception e) {

			logger.error(e);

		}

		return emergencyMsgs;
	}

	@Override
	public String exportIncident(String incidentId) {
		return emergencyIncidentService.exportIncident(incidentId);
	}

    @Override
    public List<EmergencyIncident> getCurrentIncident() {
        return emergencyIncidentService.getCurrentIncident();
    }

	@Override
	public DetailIncident findDetailIncidentById(String id) {
		return emergencyIncidentService.findDetailIncidentById(id);
	}
}
