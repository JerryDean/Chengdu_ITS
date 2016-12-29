package com.ste.emer.model;

import java.io.Serializable;

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
 * <p>ClassName   : PhoneState.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-12-01</p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

@Alias("PhoneState")
public class PhoneState implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3307451931637627788L;

	//目的电话号码
	private String phoneNumbers;
	
	//发送目的号码短信状态
	private String status;
	
	public PhoneState() {}

	public PhoneState(String phoneNumbers, String status) {
		super();
		this.phoneNumbers = phoneNumbers;
		this.status = status;
	}

	public String getPhoneNumber() {
		return phoneNumbers;
	}

	public void setPhoneNumber(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PhoneState [phoneNumber=" + phoneNumbers + ", status=" + status
				+ "]";
	}
	
	
}
