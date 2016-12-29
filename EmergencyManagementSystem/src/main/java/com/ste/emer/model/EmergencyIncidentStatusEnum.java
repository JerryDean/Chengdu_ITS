package com.ste.emer.model;

public enum EmergencyIncidentStatusEnum {
	All(0),
	Disposal(1),
	Complete(2),
	Cancelled(3);
	public Integer value;
	private EmergencyIncidentStatusEnum(Integer value){
		this.value=value;
	}
}
