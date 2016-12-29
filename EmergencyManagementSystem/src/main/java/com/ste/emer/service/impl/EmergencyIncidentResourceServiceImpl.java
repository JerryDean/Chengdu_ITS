package com.ste.emer.service.impl;

import com.ste.emer.dao.EmergencyIncidentResourceMapper;
import com.ste.emer.model.EmergencyIncidentResource;
import com.ste.emer.model.EmergencyIncidentResourceTypeEnum;
import com.ste.emer.service.EmergencyIncidentResourceService;
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
 * ClassName : EmergencyIncidentResourceServiceImpl.java
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
public class EmergencyIncidentResourceServiceImpl implements
		EmergencyIncidentResourceService {

	private static final String SUCCESS = "000000";
	private static final String FAILED = "900102";

	private static final Logger logger = Logger
			.getLogger(EmergencyIncidentResourceServiceImpl.class);

	@Autowired
	// 获取一个EmergencyIncidentResourceMapper实例，用于实现CRUD方法
	private EmergencyIncidentResourceMapper emergencyIncidentResourceMapper;

	@Override
	/**
	 * 此方法为数据库的添加方法
	 * 
	 * 方法首先判断传入对象中相关属性是否为空，如果为空，则返回操作代码“900102”；
	 * 如果不为空，再判断是否进行了EmergencyIncidentResourceMapper的CRUD方法，如果进行了，则返回“000000”，
	 * 如果没有进行，则返回“900102”
	 */
	public Result addEmergencyIncidentResource(
			EmergencyIncidentResource resource) {
		System.out.println("resource = [" + resource + "]");

		Result result = new Result();
		Integer number = -1;

		if (isNull(resource)) {
			number = emergencyIncidentResourceMapper
					.addEmergencyIncidentResource(resource);
		}

		if (number == 1) {
			System.out.println("Save success...");
			EmergencyIncidentResource e = emergencyIncidentResourceMapper
					.findEmergencyIncidentResource();
			System.out.println(e);
			result.setId(e.getId());
			result.setStatusCode(SUCCESS);
			return result;
		} else {
			System.out.println("Save failed...");
			result.setStatusCode(FAILED);
			return result;
		}

	}

	@Override
	/**
	 * 此方法为数据库的修改方法
	 * 
	 * 方法首先判断传入对象中相关属性是否为空，如果为空，则返回操作代码“900102”；
	 * 如果不为空，再判断是否进行了EmergencyIncidentResourceMapper的CRUD方法，如果成功进行了，则返回“000000”，
	 * 如果没有进行，则返回“900102”
	 */
	public Result updateEmergencyIncidentResource(
			EmergencyIncidentResource resource) {
		logger.info("updateEmergencyIncidentResource-->" + resource);

		Integer num = -1;
		Result result = new Result();

		if (resource.getId() != null && resource.getId() != "") {
			if (isNull(resource)) {
				num = emergencyIncidentResourceMapper
						.updateEmergencyIncidentResource(resource);
			}

			if (num == 1) {

				result.setId(resource.getId());
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
	/**
	 * 此方法为数据库的删除方法
	 * 
	 * 方法首先判断传入resourceId是否为空，如果为空，则返回操作代码“900102”；
	 * 如果不为空，再判断是否进行了EmergencyIncidentResourceMapper的CRUD方法，如果进行了，则返回“000000”，
	 * 如果没有进行，则返回“900102”
	 */
	public Result deleteEmergencyIncidentResource(String resourceId) {
		logger.info("deleteEmergencyIncidentResource-->resourceId:"
				+ resourceId);

		Result result = new Result();

		if (resourceId != null && resourceId != "") {

			int num = emergencyIncidentResourceMapper
					.deleteEmergencyIncidentResource(resourceId);

			if (num == 1) {

				result.setId(resourceId);
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
	/**
	 * 此方法为数据库的查询方法
	 * 
	 * 方法首先判断传入e_resourceType是否为空，如果为空，则返回null；
	 * 否则返回List<EmergencyIncidentResource>
	 */
	public List<EmergencyIncidentResource> getEmergencyIncidentResource(
			EmergencyIncidentResourceTypeEnum e_resourceType, String location) {

		logger.info("getEmergencyIncidentResource-->e_resourceType:"
				+ e_resourceType + ", location:" + location);

		if (e_resourceType != null) {

			int resourceType = e_resourceType.value;
			return emergencyIncidentResourceMapper
					.getEmergencyIncidentResource(resourceType, location);

		} else {
			return null;
		}

	}

	/**
	 * 方法用于判断EmergencyIncidentResource实例中相关属性是否为null
	 * 
	 * @param r
	 *            一个EmergencyIncidentResource实例
	 * @return 若满足条件，则返回true，若不满足条件，则返回false
	 * @author DengBW
	 */
	private boolean isNull(EmergencyIncidentResource r) {

		List<Object> list = new ArrayList<Object>();

		list.add(r.getResourceType());
		list.add(r.getOrgnizationUnit());
		list.add(r.getSubType());
		list.add(r.getLocation());
		list.add(r.getCount());
		list.add(r.getContactPerson());
		list.add(r.getPhoneNumber());

		for (Object o : list) {
			if (o == null || "".equals(o)) {
				return false;
			}
		}

		return true;

	}

}
