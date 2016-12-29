package com.ste.emer.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

/** Copyright @ 2007, ST Electronics Info-comm Systems PTE. LTD
 * All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics Info-comm Systems PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or licence agreement with ST Electronics Info-comm Systems PTE. LTD.
 *
 * Project Name : emergency
 * <p>PackageName : com.ste.emer.model </p>
 * <p>ClassName   : VehicleInfo.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-29</p>
 *
 * @author dengbowen
 * @version 1.0
 *
 */

@Alias("VehicleInfo")
public class VehicleInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5440613008438087433L;

	//车牌
	private String plateNumber;
	
	//车辆X坐标
	private double x;
	
	//车辆Y坐标
	private double y;
	
	//采集数据日期
	private Date dateTime;

	public VehicleInfo() {}

	public VehicleInfo(String plateNumber, double x, double y,
			Date dateTime) {
		super();
		this.plateNumber = plateNumber;
		this.x = x;
		this.y = y;
		this.dateTime = dateTime;
	}



	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}


	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "VehicleInfo [plateNumber=" + plateNumber + ", x=" + x + ", y="
				+ y + ", dateTime=" + dateTime + "]";
	}
	
	


}
