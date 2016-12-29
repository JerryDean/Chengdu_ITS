package com.ste.emer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.EmergencyIncidentGISStatusMapper;
import com.ste.emer.model.EmergencyIncidentGISStatus;
import com.ste.emer.service.EmergencyIncidentGISStatusService;
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
 * ClassName : EmergencyIncidentGISStatusServiceImpl.java
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
public class EmergencyIncidentGISStatusServiceImpl implements
		EmergencyIncidentGISStatusService {

	private static final String SUCCESS = "000000";
	private static final String FAILED = "900102";

	private static final Logger logger = Logger
			.getLogger(EmergencyIncidentGISStatusServiceImpl.class);

	@Autowired
	// 获取一个EmergencyIncidentGISStatusMapper实例，用于实现CRUD方法
	private EmergencyIncidentGISStatusMapper emergencyIncidentGISStatusMapper;

	@Override
	/**
	 * 此方法为数据库的添加方法
	 * 
	 * 方法首先判断传入对象中相关属性是否为空，如果为空，则返回操作代码“900102”；
	 * 如果不为空，再判断是否进行了EmergencyIncidentResourceMapper的CRUD方法，如果进行了，则返回“000000”，
	 * 如果没有进行，则返回“900102”
	 * 
	 * **在添加之前需要先删除emergencyIncidentId相同的数据
	 */
	public List<Result> addEmergencyIncidentGISStatus(
			List<EmergencyIncidentGISStatus> statusList) {

		logger.info("addEmergencyIncidentGISStatus-->status:" + statusList);

		List<Result> resultList = new ArrayList<Result>();
		Result result = new Result();

		// 添加之前需要先删除emergencyIncidentId相同的数据
		String deleEIId = statusList.get(0).getEmergencyIncidentId();

		if (deleEIId != null && !"".equals(deleEIId)) {

			// 删除数据
			emergencyIncidentGISStatusMapper
					.deleteEmergencyIncidentGISStatus(deleEIId);

		} else {

			// 返回错误码
			result.setId(null);
			result.setStatusCode(FAILED);
			resultList.add(result);
			return resultList;

		}

		for (EmergencyIncidentGISStatus status : statusList) {

			Integer number = -1;

			if (isNull(status)) {

				number = emergencyIncidentGISStatusMapper
						.addEmergencyIncidentGISStatus(status);

			}

			if (number == 1) {

				EmergencyIncidentGISStatus e = emergencyIncidentGISStatusMapper
						.findGISStatus();
				result.setId(String.valueOf(e.getId()));
				result.setStatusCode(SUCCESS);
				resultList.add(result);

			} else {

				result.setStatusCode(FAILED);
				resultList.add(result);
			}

		}

		return resultList;

	}

	@Override
	/**
	 * 此方法为数据库的查询方法
	 * 
	 * 方法首先判断传入emergencyIncidentId是否为空，如果为空，则返回null；
	 * 否则返回EmergencyIncidentGISStatus实例
	 */
	public List<EmergencyIncidentGISStatus> getEmergencyIncidentGISStatus(
			String emergencyIncidentId) {

		logger.info("getEmergencyIncidentGISStatus-->emergencyIncidentId:"
				+ emergencyIncidentId);

		if (emergencyIncidentId != null && emergencyIncidentId != "") {

			return emergencyIncidentGISStatusMapper
					.getEmergencyIncidentGISStatus(emergencyIncidentId);

		} else {
			return null;
		}

	}

	/**
	 * 方法用于判断EmergencyIncidentGISStatus实例中相关属性是否为null
	 * 
	 * @param e
	 *            一个EmergencyIncidentGISStatus实例
	 * @return 若满足条件，则返回true，若不满足条件，则返回false
	 * @author DengBW
	 */
	private boolean isNull(EmergencyIncidentGISStatus e) {

		List<Object> list = new ArrayList<Object>();

		list.add(e.getEmergencyIncidentId());
		list.add(e.getStatusType());
		list.add(e.getValue());

		for (Object o : list) {
			if (o == null || "".equals(o)) {
				return false;
			}
		}

		return true;
	}

}
