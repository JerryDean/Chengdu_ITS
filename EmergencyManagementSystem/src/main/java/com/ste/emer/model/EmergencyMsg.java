package com.ste.emer.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

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
 * PackageName : com.ste.emer.model
 * </p>
 * <p>
 * ClassName : EmergencyMsg.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-11-30
 * </p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

@Alias("EmergencyMsg")
public class EmergencyMsg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6583911523187731534L;

	// 消息Id
	private String msgId;

	// 消息内容
	private String content;

	// 应急事件Id
	private String emergencyId;

//	// 消息状态
//	private String state;
//
//	// 目的电话号码
//	private List<String> phoneNumbers;
	
	private List<PhoneState> phoneStates;

	public EmergencyMsg() {
	}

	public EmergencyMsg(String msgId, String content, String emergencyId,
			List<PhoneState> phoneStates) {
		super();
		this.msgId = msgId;
		this.content = content;
		this.emergencyId = emergencyId;
		this.phoneStates = phoneStates;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEmergencyId() {
		return emergencyId;
	}

	public void setEmergencyId(String emergencyId) {
		this.emergencyId = emergencyId;
	}

	public List<PhoneState> getPhoneStates() {
		return phoneStates;
	}

	public void setPhoneStates(List<PhoneState> phoneStates) {
		this.phoneStates = phoneStates;
	}

	@Override
	public String toString() {
		return "EmergencyMsg [msgId=" + msgId + ", content=" + content
				+ ", emergencyId=" + emergencyId + ", phoneStates="
				+ phoneStates + "]";
	}
	
	



}
