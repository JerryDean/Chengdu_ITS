package com.ste.emer.model;

public enum EmergencyIncidentGradeEnum {
	All(0),
	一般(1),
	较大(2),
	重大(3),
	特别重大(4);
	public Integer value;
	private EmergencyIncidentGradeEnum(Integer value){
		this.value=value;
	}
}
