package com.ste.emer.model;

public enum EmergencyIncidentResourceSubTypeEnum {
	All(0),
	Ambulance(1),//救护车
	FireEngine(2),//消防车
	Tow(3);//拖车
	public Integer value;
	private EmergencyIncidentResourceSubTypeEnum(Integer value){
		this.value=value;
	}
}
