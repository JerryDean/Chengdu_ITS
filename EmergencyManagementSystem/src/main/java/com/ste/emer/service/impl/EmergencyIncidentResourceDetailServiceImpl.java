package com.ste.emer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.EmergencyIncidentResourceDetailMapper;
import com.ste.emer.model.EmergencyIncidentResourceDetail;
import com.ste.emer.service.EmergencyIncidentResourceDetailService;
import com.stee.dsms.model.Result;

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
 * ClassName : EmergencyIncidentResourceDetailServiceImpl.java
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
public class EmergencyIncidentResourceDetailServiceImpl implements
		EmergencyIncidentResourceDetailService {

	private static final String SUCCESS = "000000";
	private static final String FAILED = "900102";

	@Autowired
	private EmergencyIncidentResourceDetailMapper emergencyIncidentResourceDetailMapper;

	private static final Logger logger = Logger
			.getLogger(EmergencyIncidentResourceDetailServiceImpl.class);

	@Override
	public Result addEmergencyIncidentResourceDetail(
			EmergencyIncidentResourceDetail resource) {

		logger.info("addEmergencyIncidentResourceDetail-->" + resource);

		Integer number = -1;

		Result result = new Result();

		if (isNull(resource)) {

			number = emergencyIncidentResourceDetailMapper
					.addEmergencyIncidentResourceDetail(resource);

		}

		if (number == 1) {

			String id = String.valueOf(emergencyIncidentResourceDetailMapper
					.slectMaxId());
			result.setId(id);
			result.setStatusCode(SUCCESS);
			return result;

		} else {

			result.setStatusCode(FAILED);
			return result;

		}

	}

	@Override
	public Result updateEmergencyIncidentResourceDetail(
			EmergencyIncidentResourceDetail resource) {

		logger.info("updateEmergencyIncidentResourceDetail-->" + resource);

		Integer number = -1;
		Result result = new Result();

		if (resource.getId() != null && resource.getId() != "") {

			if (isNull(resource)) {

				number = emergencyIncidentResourceDetailMapper
						.updateEmergencyIncidentResourceDetail(resource);

			}

			if (number == 1) {

				logger.info("----EmergencyIncidentResourceDetailServiceImpl:updateEmergencyIncidentResourceDetail-->"
						+ " success");

				result.setId(resource.getId());
				result.setStatusCode(SUCCESS);
				return result;

			} else {

				logger.info("----EmergencyIncidentResourceDetailServiceImpl:updateEmergencyIncidentResourceDetail-->"
						+ "  faild");

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
	public Result deleteEmergencyIncidentResourceDetail(String resourceId) {

		logger.info("deleteEmergencyIncidentResourceDetail-->resoureId:"
				+ resourceId);

		Integer number = -1;
		Result result = new Result();

		if (resourceId != null && resourceId != "") {

			number = emergencyIncidentResourceDetailMapper
					.deleteEmergencyIncidentResourceDetail(resourceId);

			if (number == 1) {

				logger.info("----EmergencyIncidentResourceDetailServiceImpl:deleteEmergencyIncidentResourceDetail-->"
						+ " success");

				result.setId(resourceId);
				result.setStatusCode(SUCCESS);
				return result;

			} else {

				logger.info("----EmergencyIncidentResourceDetailServiceImpl:deleteEmergencyIncidentResourceDetail-->"
						+ " faild");

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
	public List<EmergencyIncidentResourceDetail> findResourceDetailByEmergencyIncidentId(
			String emergencyIncidentId) {

		logger.info("findResourceDetailByEmergencyIncidentId-->emergencyIncidentId:"
				+ emergencyIncidentId);

		if (emergencyIncidentId != null && emergencyIncidentId != "") {

			return emergencyIncidentResourceDetailMapper
					.findResourceDetailByEmergencyIncidentId(emergencyIncidentId);

		} else {

			return null;

		}

	}

	/**
	 * 方法用于判断EmergencyIncidentResourceDetail实例中相关属性是否为null
	 * 
	 * @param e
	 *            一个EmergencyIncidentResourceDetail实例
	 * @return 若满足条件，则返回true，若不满足条件，则返回false
	 * @author DengBW
	 */
	private boolean isNull(EmergencyIncidentResourceDetail e) {

		List<Object> list = new ArrayList<Object>();

		list.add(e.getEmergencyIncidentId());
		list.add(e.getType());
		list.add(e.getPlateNumber());
		list.add(e.getName());
		list.add(e.getPhoneNumber());
		list.add(e.getOrgnizationUnit());
		list.add(e.getX());
		list.add(e.getY());

		for (Object o : list) {
			if (o == null || "".equals(o)) {
				return false;
			}
		}

		return true;
	}

}
