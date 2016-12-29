package com.ste.emer.service.impl;

import com.ste.emer.dao.EmergencyIncidentProposalMapper;
import com.ste.emer.dao.TaskForEmergencyIncidentMapper;
import com.ste.emer.dao.TaskForProposalMapper;
import com.ste.emer.model.*;
import com.ste.emer.service.EmergencyIncidentProposalService;
import com.stee.dsms.model.PageInfo;
import com.stee.dsms.model.PageResult;
import com.stee.dsms.model.Result;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
 * PackageName : com.ste.emer.service.impl
 * </p>
 * <p>
 * ClassName : EmergencyIncidentProposalServiceImpl.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-10-28
 * </p>
 *
 * @author chenshaoyin Modify By DengBW
 * @version 1.0
 *
 */
@Service
public class EmergencyIncidentProposalServiceImpl implements
		EmergencyIncidentProposalService {

	private static final String SUCCESS = "000000";
	private static final String FAILED = "900102";

	private static final Logger logger = Logger
			.getLogger(EmergencyIncidentProposalServiceImpl.class);

	@Autowired
	private EmergencyIncidentProposalMapper emergencyIncidentProposalMapper;

	@Autowired
	private TaskForProposalMapper taskForProposalMapper;

	@Autowired
    private TaskForEmergencyIncidentMapper taskForEmergencyIncidentMapper;

	@Override
	public Result addEmergencyIncidentProposal(
			EmergencyIncidentProposal proposal) {

		logger.info("addEmergencyIncidentProposal-->" + proposal);

		Integer number = -1;
		Result result = new Result();

		if (isNull(proposal)) {
			String id = proposal.getId();
			// id -- 1、0 表示新建 2、0@{id} 表示另存为 3、0&{id} 表示从任务列表新增 4、{id} 更新
            if (id.equals("0")) {
                number = emergencyIncidentProposalMapper
                        .addEmergencyIncidentProposal(proposal);
            } else if (id.contains("@")) {
                number = emergencyIncidentProposalMapper
                        .addEmergencyIncidentProposal(proposal);
                String idStr = id.split("@")[1];
                Integer newId = emergencyIncidentProposalMapper.getMaxId();
                List<TaskForProposal> taskForProposals = taskForProposalMapper.getTaskByEmergencyIncidentProposalId(Integer.valueOf(idStr));
                for (TaskForProposal taskForProposal : taskForProposals) {
                    taskForProposal.setProposalId(String.valueOf(newId));
                    taskForProposalMapper.addTaskForEmergencyIncidentProposal(taskForProposal);
                }
            } else if (id.contains("$")){
				number = emergencyIncidentProposalMapper
						.addEmergencyIncidentProposal(proposal);
                Integer newId = emergencyIncidentProposalMapper.getMaxId();
                String incidentId = id.split("\\$")[1];
                if (null != incidentId && !incidentId.equals("")) {
                    List<TaskForEmergencyIncident> taskByEmergencyIncidentId = taskForEmergencyIncidentMapper.findTaskByEmergencyIncidentId(incidentId);
                    if (null != taskByEmergencyIncidentId && !taskByEmergencyIncidentId.isEmpty()) {
                        for (TaskForEmergencyIncident taskForEmergencyIncident : taskByEmergencyIncidentId) {
                            TaskForProposal taskForProposal = new TaskForProposal();
                            taskForProposal.setDescription(taskForEmergencyIncident.getDescribe());
                            taskForProposal.setExecutedBy(taskForEmergencyIncident.getExecutedBy());
                            taskForProposal.setIncidentClass(proposal.getIncidentLevel());
                            taskForProposal.setTaskId(taskForEmergencyIncident.getTaskName());
                            taskForProposal.setProposalId(String.valueOf(newId));
                            taskForProposalMapper.addTaskForEmergencyIncidentProposal(taskForProposal);
                        }
                    }
                }
            } else {
                number = emergencyIncidentProposalMapper
                        .updateEmergencyIncidentProposal(proposal);
            }
		}

		if (number == 1) {

			String id = String.valueOf(emergencyIncidentProposalMapper
					.getMaxId());
			result.setId(id);
			result.setStatusCode(SUCCESS);
			return result;

		} else {

			result.setStatusCode(FAILED);
			return result;

		}

	}

	@Override
	public Result updateEmergencyIncidentProposal(
			EmergencyIncidentProposal proposal) {

		logger.info("updateEmergencyIncidentProposal-->" + proposal);

		Integer number = -1;
		Result result = new Result();

		if (proposal.getId() != null && proposal.getId() != "") {

			number = emergencyIncidentProposalMapper
					.updateEmergencyIncidentProposal(proposal);

			if (number == 1) {

				result.setId(proposal.getId());
				result.setStatusCode(SUCCESS);
				return result;
			} else {

				result.setId(null);
				result.setStatusCode(FAILED);
				return result;

			}

		} else {

			result.setId(null);
			result.setStatusCode(FAILED);
			return result;

		}

	}

	@Override
	public Result deleteEmergencyIncidentProposal(String proposalId) {

		logger.info("deleteEmergencyIncidentProposal-->proposalId:"
				+ proposalId);

		Integer number = -1;
		Result result = new Result();

		if (proposalId != null && proposalId != "") {

			int proposalIdNum = Integer.parseInt(proposalId);
			number = emergencyIncidentProposalMapper
					.deleteEmergencyIncidentProposal(proposalIdNum);

			if (number == 1) {

				taskForProposalMapper.deleteTaskByProposalId(proposalIdNum);
				result.setId(proposalId);
				result.setStatusCode(SUCCESS);
				return result;

			} else {

				result.setId(null);
				result.setStatusCode(FAILED);
				return result;

			}

		} else {

			result.setId(null);
			result.setStatusCode(FAILED);
			return result;

		}

	}

	@Override
	public PageResult findEmergencyIncidentProposal(
			EmergencyIncidentTypeEnum type,
			EmergencyIncidentTypeSubEnum subType, String name, PageInfo pageInfo) {
		logger.info("deleteEmergencyIncidentProposal-->type:" + type
				+ ", subType:" + subType + ", name:" + name + ", currentPage:"
				+ pageInfo.getCurrentPageNumber() + ", pageSize:"
				+ pageInfo.getPageSize());

		PageResult pageResult = new PageResult();

		if (pageInfo.getCurrentPageNumber() > 0 && pageInfo.getPageSize() > 0) {

			int type_num = 0;
			int subType_num = 0;
			if (type != null) {
				type_num = type.value;
			}
			if (subType != null) {
				subType_num = subType.value;
			}
			if (type_num == 0 && subType_num == 0
					&& (name == null || "".equals(name))) {
				pageResult.setList(emergencyIncidentProposalMapper
						.findEmergencyIncidentProposalAll(
								pageInfo.getCurrentPageNumber(),
								pageInfo.getPageSize()));
				pageResult.setTotalCount(emergencyIncidentProposalMapper
						.getTotalCurrentAll());
			} else {
				pageResult.setList(emergencyIncidentProposalMapper
						.findEmergencyIncidentProposal(type_num, subType_num,
								name, pageInfo.getCurrentPageNumber(),
								pageInfo.getPageSize()));
				pageResult.setTotalCount(emergencyIncidentProposalMapper
						.getTotalCurrent(type_num, subType_num, name));
			}

			pageResult.setCurrentPageNumber(pageInfo.getCurrentPageNumber());
			pageResult.setPageSize(pageInfo.getPageSize());

			int totalPage = pageResult.getTotalCount() / pageInfo.getPageSize();
			if (pageResult.getTotalCount() % pageInfo.getPageSize() > 0) {
				totalPage += 1;
			}
			pageResult.setPageCount(totalPage);
			pageResult.setStatusCode(SUCCESS);
			return pageResult;

		} else {

			pageResult.setStatusCode(FAILED);
			return pageResult;

		}

	}

	@Override
	public EmergencyIncidentProposal getEmergencyIncidentProposalById(String id) {

		logger.info("getEmergencyIncidentProposalById-->id:" + id);

		if (id != null && id != "") {

			int idNum = Integer.parseInt(id);
			return emergencyIncidentProposalMapper
					.getEmergencyIncidentProposalById(idNum);

		} else {

			return null;

		}

	}

	/**
	 * 方法用于判断EmergencyIncidentProposal实例中相关属性是否为null
	 * 
	 * @param e
	 *            一个EmergencyIncidentProposal实例
	 * @return 若满足条件，则返回true，若不满足条件，则返回false
	 * @author DengBW
	 */
	private boolean isNull(EmergencyIncidentProposal e) {

		List<Object> list = new ArrayList<Object>();

		list.add(e.getProposalId());
		list.add(e.getName());
		list.add(e.getType());
		list.add(e.getSubType());
		list.add(e.getDescription());
		list.add(e.getCreateDate());
		list.add(e.getCreator());
		list.add(e.getStatus());
		list.add(e.getCustomUnit());
		list.add(e.getOrgnizationUnit());

		for (Object o : list) {
			if (o == null || "".equals(o)) {
				return false;
			}
		}

		return true;
	}

}
