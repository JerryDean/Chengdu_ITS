package com.ste.emer.model;

public enum TaskForEmergencyIncidentStatusEnum {
	All(0),
	未执行(1),
	执行中(2),
	已完成(3),
	已取消(4);
	public Integer value;
	private TaskForEmergencyIncidentStatusEnum(Integer value){
		this.value=value;
	}
}
