package com.ste.emer.model;
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
 * <p>ClassName   : Result.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-11-11</p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

public class Result {

	//状态,000000:success 999999:fail
	private String statusCode; 
	
	//相对应的id
	private String id;
	
	public Result() {}

	public Result(String statusCode, String id) {
		super();
		this.statusCode = statusCode;
		this.id = id;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Result [statusCode=" + statusCode + ", id=" + id + "]";
	}

	
	
	
	
	
}
