package com.ste.emer.service.impl;

import com.ste.emer.dao.EmergencyIncidentLogMapper;
import com.ste.emer.dao.EmergencyIncidentMapper;
import com.ste.emer.dao.EmergencyIncidentResourceDetailMapper;
import com.ste.emer.dao.TaskForEmergencyIncidentMapper;
import com.ste.emer.model.*;
import com.ste.emer.service.EmergencyIncidentService;
import com.ste.emer.util.WordGenerator;
import com.stee.dsms.model.PageInfo;
import com.stee.dsms.model.PageResult;
import com.stee.dsms.model.Result;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

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
 * ClassName : EmergencyIncidentServiceImpl.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-10-29
 * </p>
 *
 * @author DengBW
 * @version 1.0
 *
 */
@Service
public class EmergencyIncidentServiceImpl implements EmergencyIncidentService {

	private static final String SUCCESS = "000000";
	private static final String FAILED = "900102";

	@Autowired
	private EmergencyIncidentMapper emergencyIncidentMapper;

	@Autowired
	private EmergencyIncidentResourceDetailMapper emergencyIncidentResourceMapper;

	@Autowired
	private TaskForEmergencyIncidentMapper taskForEmergencyIncidentMapper;

	@Autowired
	private EmergencyIncidentLogMapper emergencyIncidentLogMapper;

	private static final Logger logger = Logger
			.getLogger(EmergencyIncidentServiceImpl.class);

	@Override
	public Result addEmergencyIncident(EmergencyIncident emergencyIncident) {

		logger.info("addEmergencyIncident-->" + emergencyIncident);

		Result result = new Result();

		Integer number = -1;

		if (isNull(emergencyIncident)) {

			number = emergencyIncidentMapper
					.addEmergencyIncident(emergencyIncident);

		}

		if (number == 1) {

			String id = String.valueOf(emergencyIncidentMapper.slectMaxId());
			result.setId(id);
			result.setStatusCode(SUCCESS);
			return result;
		} else {

			result.setStatusCode(FAILED);
			return result;
		}

	}

	@Override
	public Result updateEmergencyIncident(EmergencyIncident emergencyIncident) {

		logger.info("updateEmergencyIncident-->" + emergencyIncident);

		Integer number = -1;
		Result result = new Result();

		if (emergencyIncident.getId() != null
				&& emergencyIncident.getId() != "") {

			if (isNull(emergencyIncident)) {

				number = emergencyIncidentMapper
						.updateEmergencyIncident(emergencyIncident);

			}

			if (number == 1) {

				logger.info("----EmergencyIncidentServiceImpl:updateEmergencyIncident-->"
						+ "success");

				result.setId(emergencyIncident.getId());
				result.setStatusCode(SUCCESS);
				return result;

			} else {

				logger.info("----EmergencyIncidentServiceImpl:updateEmergencyIncident-->"
						+ "faild");

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
	public PageResult findEmergencyIncidentByStatus(PageInfo pageInfo,
			EmergencyIncidentStatusEnum style) {

		logger.info("findEmergencyIncidentByStatus-->currentPage:"
				+ pageInfo.getCurrentPageNumber() + ",pageSize:"
				+ pageInfo.getPageSize() + ",style:" + style);

		if (pageInfo.getCurrentPageNumber() > 0 && pageInfo.getPageSize() > 0
				&& style != null) {

			int status = style.value;

			if (status != 0) {

				int totalCount = 0;
				PageResult pageResult = new PageResult();
				totalCount = emergencyIncidentMapper.getAllPages(status);
				pageResult.setTotalCount(totalCount);
				pageResult.setList(emergencyIncidentMapper
						.findEmergencyIncidentByStatus(
								pageInfo.getCurrentPageNumber(),
								pageInfo.getPageSize(), status));
				pageResult
						.setCurrentPageNumber(pageInfo.getCurrentPageNumber());
				pageResult.setPageSize(pageInfo.getPageSize());
				int flagTotalPage = totalCount % pageInfo.getPageSize();

				if (flagTotalPage > 0) {

					pageResult.setPageCount(totalCount / pageInfo.getPageSize()
							+ 1);

				} else {
					pageResult
							.setPageCount(totalCount / pageInfo.getPageSize());
				}

				pageResult.setStatusCode(SUCCESS);
				return pageResult;
			} else {

				int totalCount = 0;
				PageResult pageResult = new PageResult();
				totalCount = emergencyIncidentMapper.getAllPagesAllStatus();
				pageResult.setTotalCount(totalCount);
				pageResult.setList(emergencyIncidentMapper
						.findEmergencyIncidentByAllStatus(
								pageInfo.getCurrentPageNumber(),
								pageInfo.getPageSize()));
				pageResult
						.setCurrentPageNumber(pageInfo.getCurrentPageNumber());
				pageResult.setPageSize(pageInfo.getPageSize());
				int flagTotalPage = totalCount % pageInfo.getPageSize();

				if (flagTotalPage > 0) {

					pageResult.setPageCount(totalCount / pageInfo.getPageSize()
							+ 1);

				} else {

					pageResult
							.setPageCount(totalCount / pageInfo.getPageSize());

				}

				pageResult.setStatusCode(SUCCESS);
				return pageResult;
			}
		} else {
			PageResult pageResult = new PageResult();
			pageResult.setStatusCode(FAILED);
			return pageResult;
		}

	}

	@Override
	public int getAllPages(int status) {

		return emergencyIncidentMapper.getAllPages(status);

	}

	@Override
	public EmergencyIncident getEmergencyIncidentById(String id) {

		logger.info("getEmergencyIncidentById-->id:" + id);

		if (id != null && id != "") {

			return emergencyIncidentMapper.getEmergencyIncidentById(id);

		} else {

			return null;

		}

	}

	@Override
	public String exportIncident(String incidentId) {
		// TODO: 2016/12/23 Export incident as word.
        Map<String, String> map = new HashMap<String, String>();
        String result = "";
        EmergencyIncident incident = emergencyIncidentMapper.getEmergencyIncidentById(incidentId);
        if (null != incident) {
            String emergencyIncidentId = incident.getEmergencyIncidentId();
            if (null != emergencyIncidentId && !emergencyIncidentId.equals("")) {
                map.put("name", emergencyIncidentId);
            } else {
                map.put("name", "");
            }
            Integer incidentType = incident.getIncidentType();
            if (null != incidentType) {
                String type = "";
                switch (incidentType) {
                    case 1:
                        type = "交通事故";
                        break;
                    case 2:
                        type = "自然灾害";
                        break;
                    case 3:
                        type = "公共安全事件";
                        break;
                    case 4:
                        type = "社会安全事故";
                        break;
                }
                map.put("type", type);
            } else {
                map.put("type", "");
            }
            Integer incidentType_sub = incident.getIncidentType_sub();
            if (null != incidentType_sub) {
                String subType = "";
                for (int i = 0; i < EmergencyIncidentTypeSubEnum.values().length; i++) {
                    if (incidentType_sub == i) {
                        EmergencyIncidentTypeSubEnum emergencyIncidentTypeSubEnum = EmergencyIncidentTypeSubEnum.values()[i];
                        subType = emergencyIncidentTypeSubEnum.name();
                    }
                }
                map.put("subtype", subType);
            } else {
                map.put("subtype", "");
            }
            Integer incidentGrade = incident.getIncidentGrade();
            if (null != incidentGrade) {
                map.put("level", String.valueOf(incidentGrade));
            } else {
                map.put("level", "");
            }
            String location = incident.getRoadName() + incident.getStreetName();
            if (null != location && !location.equals("")) {
                map.put("location", location);
            } else {
                map.put("location", "");
            }
            Double x = incident.getX();
            if (null != x && x != 0) {
                map.put("longitude", String.valueOf(x));
            } else {
                map.put("longitude", "");
            }
            Double y = incident.getY();
            if (null != y && y != 0) {
                map.put("latitude", String.valueOf(y));
            } else {
                map.put("latitude", "");
            }
            Integer status = incident.getStatus();
            if (null != status) {
                String state = "";
                switch (status) {
                    case 1:
                        state = "处理中";
                        break;
                    case 2:
                        state="完成";
                        break;
                    case 3:
                        state = "取消";
                        break;
                }
                map.put("status", state);
            } else {
                map.put("status", "");
            }
            String describe = incident.getDescribe();
            if (null != describe && !describe.equals("")) {
                map.put("description", describe);
            } else {
                map.put("description", "");
            }
            String incidentRemark = incident.getIncidentRemark();
            if (null != incidentRemark && !incidentRemark.equals("")) {
                map.put("remark", incidentRemark);
            } else {
                map.put("remark", "");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date createTime = incident.getIncidentCreateTime();
            if (null != createTime) {
                map.put("start", sdf.format(createTime));
            } else {
                map.put("start", "");
            }
            Date stopTime = incident.getIncidentStopTime();
            if (null != stopTime) {
                map.put("end", sdf.format(stopTime));
            } else {
                map.put("end", "");
            }
            StringBuilder stringBuilder = new StringBuilder();
            List<TaskForEmergencyIncident> taskForEmergencyIncidents = taskForEmergencyIncidentMapper.findTaskByEmergencyIncidentId(incidentId);
            if (null != taskForEmergencyIncidents && !taskForEmergencyIncidents.isEmpty()) {
                for (int i = 0; i < taskForEmergencyIncidents.size(); i++) {
                    stringBuilder.append((i+1) + taskForEmergencyIncidents.get(i).getDescribe());
                    stringBuilder.append("</w:t></w:r></w:p><w:p><w:pPr></w:pPr>");
                    stringBuilder.append("<w:r><w:rPr>");
                    stringBuilder.append("</w:rPr><w:t>");
                }
                if (stringBuilder.length() != 0) {
                    map.put("approach", stringBuilder.toString());
                } else {
                    map.put("approach", "");
                }
            } else {
                map.put("approach", "");
            }
            List<EmergencyIncidentResourceDetail> resourceDetails = emergencyIncidentResourceMapper.findResourceDetailByEmergencyIncidentId(incidentId);
            if (null != resourceDetails && !resourceDetails.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < resourceDetails.size(); i++) {
                    sb.append((i + 1) + resourceDetails.get(i).getName());
                    sb.append("</w:t></w:r></w:p><w:p><w:pPr></w:pPr>");
                    sb.append("<w:r><w:rPr>");
                    sb.append("</w:rPr><w:t>");
                }
                if (sb.length() != 0) {
                    map.put("resource", sb.toString());
                } else {
                    map.put("resource", "");
                }
            }else {
                map.put("resource", "");
            }
            File file = WordGenerator.createDoc(map, "model");
            byte[] bytes = WordGenerator.getBytes(file);
            result = WordGenerator.encode(bytes);
//            file.delete();
        }
        return result;
	}

    @Override
    public List<EmergencyIncident> getCurrentIncident() {
        List<EmergencyIncident> list = new ArrayList<EmergencyIncident>();
        try {
            list =  emergencyIncidentMapper.findEmergencyIncidentByStatus(1, 9999, 1);
        } catch (Exception e) {
            logger.error(e);
        }

        return list;
    }

    @Override
    public DetailIncident findDetailIncidentById(String id) {
        EmergencyIncident incident = emergencyIncidentMapper.getEmergencyIncidentById(id);
        List<EmergencyIncidentResourceDetail> resourceDetailByEmergencyIncidentId = emergencyIncidentResourceMapper.findResourceDetailByEmergencyIncidentId(id);
        List<TaskForEmergencyIncident> taskByEmergencyIncidentId = taskForEmergencyIncidentMapper.findTaskByEmergencyIncidentId(id);
        List<EmergencyIncidentLog> logByEmergencyIncidentId = emergencyIncidentLogMapper.findLogByEmergencyIncidentId(id);
        DetailIncident detailIncident = new DetailIncident();
        detailIncident.setIncident(incident);
        detailIncident.setLogs(logByEmergencyIncidentId);
        detailIncident.setResources(resourceDetailByEmergencyIncidentId);
        detailIncident.setTasks(taskByEmergencyIncidentId);
        return detailIncident;
    }

    /**
     * 拼接FreeMaker字段。
     *
     * @param incidentId
     * @return
     */
	private Map<String, String> initMap (String incidentId) {
        Map<String, String> map = new HashMap<String, String>();
        return null;
    }

	/**
	 * 方法用于判断EmergencyIncident实例中相关属性是否为null
	 * 
	 * @param e
	 *            一个EmergencyIncident实例
	 * @return 若满足条件，则返回true，若不满足条件，则返回false
	 * @author DengBW
	 */
	private boolean isNull(EmergencyIncident e) {

		List<Object> list = new ArrayList<Object>();

		list.add(e.getIncidentSource());
		list.add(e.getIncidentType());
		list.add(e.getIncidentType_sub());
		list.add(e.getDescribe());
		list.add(e.getX());
		list.add(e.getY());
		list.add(e.getRoadName());
		list.add(e.getAdminName());
		list.add(e.getStreetName());
		list.add(e.getIncidentCreateTime());
		list.add(e.getIncidentGrade());
		list.add(e.getCreatePerson());
		list.add(e.getStatus());

		for (Object o : list) {
			if (o == null || "".equals(o)) {
				return false;
			}
		}

		return true;
	}
}
