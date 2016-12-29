package com.ste.emer.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.VehicleInfoMapper;
import com.ste.emer.model.VehicleInfo;
import com.ste.emer.service.VehicleInfoService;

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
 * ClassName : VehicleInfoServiceImpl.java
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
public class VehicleInfoServiceImpl implements VehicleInfoService {

	private static final Logger logger = Logger
			.getLogger(VehicleInfoServiceImpl.class);

	@Autowired
	// 获取一个VehicleInfoMapper实例，用于实现CRUD方法
	private VehicleInfoMapper vehicleInfoMapper;

	@Override
	/**
	 * 此方法为数据库的查询方法
	 * 
	 * 方法首先判断传入plateNumber是否为空，如果为空，则返回null；
	 * 否则返回满足条件的VehicleInfo实例
	 */
	public VehicleInfo getVehicleInfoByPlateNumber(String plateNumber) {

		logger.info("getVehicleInfoByPlateNumber-->" + "plateNumber:"
				+ plateNumber);

		if (plateNumber != null && plateNumber != "") {

			// return
			// vehicleInfoMapper.getVehicleInfoByPlateNumber(plateNumber);
			return new VehicleInfoServiceImpl()
					.doGetVehicleInfoByPlateNumber(plateNumber);

		} else {
			return null;
		}

	}

	@Override
	/**
	 * 此方法为数据库的查询方法
	 * 
	 * 方法首先判断传入相关参数是否为空，如果为空，则返回null；
	 * 否则返回满足条件的VehicleInfo实例
	 */
	public List<VehicleInfo> getVehicleTrack(String plateNumber,
			Date startTime, Date endTime) {

		logger.info("getVehicleTrack-->" + "plateNumber:" + plateNumber + ", "
				+ "startTime:" + startTime + ", " + "endTime:" + endTime);

		if (plateNumber != null && plateNumber != "" && startTime != null
				&& endTime != null) {

			// return vehicleInfoMapper.getVehicleTrack(plateNumber, startTime,
			// endTime);
			return new VehicleInfoServiceImpl().doGetVehicleTrack(plateNumber,
					startTime, endTime);

		} else {
			return null;
		}

	}

	/**
	 * 方法模拟访问数据库，得到一条最新的数据
	 * 
	 * @param plateNumber
	 *            车牌号
	 * @return 最新的VehicleInfo实例
	 * @author DengBW
	 */
	private VehicleInfo doGetVehicleInfoByPlateNumber(String plateNumber) {

		Map<String, List<VehicleInfo>> map = getData();

		List<VehicleInfo> list = map.get(plateNumber);

		VehicleInfo vehicleInfo = list.get(0);

		for (VehicleInfo v : list) {
			// System.out.println(v.getDateTime());
			if (v.getDateTime().after(vehicleInfo.getDateTime())) {

				vehicleInfo = v;

			}

		}

		return vehicleInfo;
	}

	/**
	 * 方法模拟访问数据库，得到一组满足要求的数据
	 * 
	 * @param plateNumber
	 *            车牌号
	 * @param startTime
	 *            起始时间
	 * @param endTime
	 *            结束时间
	 * @return newList一组满足要求的数据
	 * @author DengBW
	 */
	private List<VehicleInfo> doGetVehicleTrack(String plateNumber,
			Date startTime, Date endTime) {

		Map<String, List<VehicleInfo>> map = getData();

		List<VehicleInfo> list = map.get(plateNumber);

		List<VehicleInfo> newList = new ArrayList<VehicleInfo>();

		for (VehicleInfo v : list) {
			// System.out.println(v.getDateTime());
			// System.out.println(v.getDateTime().after(startTime));
			// System.out.println(v.getDateTime().before(endTime));
			if (v.getDateTime().after(startTime)
					&& v.getDateTime().before(endTime)) {

				newList.add(v);

			}

		}

		return newList;

	}

	/**
	 * 静态方法用于模拟数据库中的数据
	 * 
	 * @return 模拟数据库中的数据
	 */
	private static Map<String, List<VehicleInfo>> getData() {

		Map<String, List<VehicleInfo>> map = new HashMap<String, List<VehicleInfo>>();

		List<VehicleInfo> list1 = new ArrayList<VehicleInfo>();
		List<VehicleInfo> list2 = new ArrayList<VehicleInfo>();
		List<VehicleInfo> list3 = new ArrayList<VehicleInfo>();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");

		try {

			VehicleInfo v01 = new VehicleInfo("川A 88888", 104.047740613441,
					30.6245531139352, sdf.parse("2015-11-10 13.58.10"));
			VehicleInfo v02 = new VehicleInfo("川A 88888", 104.050154543451,
					30.6232311998823, sdf.parse("2015-11-10 13.58.50"));
			VehicleInfo v03 = new VehicleInfo("川A 88888", 104.054350183706,
					30.6212770660649, sdf.parse("2015-11-10 14.30.20"));
			VehicleInfo v04 = new VehicleInfo("川A 88888", 104.057281384432,
					30.6200126265361, sdf.parse("2015-11-10 14.58.30"));
			VehicleInfo v05 = new VehicleInfo("川A 88888", 104.059178043725,
					30.619840202964, sdf.parse("2015-11-10 16.30.25"));
			VehicleInfo v06 = new VehicleInfo("川A 88888", 104.06124712659,
					30.619840202964, sdf.parse("2015-11-10 17.22.12"));
			VehicleInfo v07 = new VehicleInfo("川A 88888", 104.064120852792,
					30.619897677488, sdf.parse("2015-11-10 18.31.13"));
			VehicleInfo v08 = new VehicleInfo("川A 88888", 104.066822155422,
					30.6200126265361, sdf.parse("2015-11-10 19.41.01"));
			VehicleInfo v09 = new VehicleInfo("川A 88888", 104.069810830672,
					30.6201275755841, sdf.parse("2015-11-10 21.54.23"));
			VehicleInfo v10 = new VehicleInfo("川A 88888", 104.072282235206,
					30.6202425246322, sdf.parse("2015-11-10 22.39.10"));
			VehicleInfo v11 = new VehicleInfo("川A 88888", 104.07504101236,
					30.6202999991563, sdf.parse("2015-11-10 23.43.23"));
			VehicleInfo v12 = new VehicleInfo("川A 88888", 104.082570175009,
					30.6204724227284, sdf.parse("2015-11-10 23.53.23"));
			VehicleInfo v13 = new VehicleInfo("川A 12345", 104.124767993874,
					30.7492907946231, sdf.parse("2015-11-10 13.22.12"));
			VehicleInfo v14 = new VehicleInfo("川A 12310", 104.144767993874,
					30.7492907946231, sdf.parse("2015-11-10 12.21.10"));

			list1.add(v01);
			list1.add(v02);
			list1.add(v03);
			list1.add(v04);
			list1.add(v05);
			list1.add(v06);
			list1.add(v07);
			list1.add(v08);
			list1.add(v09);
			list1.add(v10);
			list1.add(v11);
			list1.add(v12);
			list2.add(v13);
			list3.add(v14);

			map.put("川A 88888", list1);
			map.put("川A 12345", list2);
			map.put("川A 12310", list3);

		} catch (Exception e) {
			logger.error(e);
		}

		return map;

	}

}
