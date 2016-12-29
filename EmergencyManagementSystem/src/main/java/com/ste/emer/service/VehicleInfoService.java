package com.ste.emer.service;

import java.util.Date;
import java.util.List;

import com.ste.emer.model.VehicleInfo;

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
 * PackageName : com.ste.emer.service
 * </p>
 * <p>
 * ClassName : VehicleInfoService.java
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

public interface VehicleInfoService {

	/**
	 * 根据车辆的车牌，获得车辆的位置
	 * 
	 * @param plateNumber
	 *            车辆的车牌
	 * @return 一条车辆信息的实例
	 * @author DengBW
	 */
	VehicleInfo getVehicleInfoByPlateNumber(String plateNumber);

	/**
	 * 根据车牌号，以及数据的采集时间startTime和数据采集时间endTime，获取车辆的轨迹
	 * 
	 * @param plateNumber
	 *            车辆的车牌
	 * @param startTime
	 *            数据采集时间（开始时间）
	 * @param endTime
	 *            数据采集时间（结束时间）
	 * @return 以车牌号为ID的车辆全部位置信息
	 * @author DengBW
	 */
	List<VehicleInfo> getVehicleTrack(String plateNumber, Date startTime,
			Date endTime);
}
