package com.ste.emer.model;

public enum EmergencyIncidentTypeEnum {
	All(0),
	Accident_disaster (1),
	Natural_disasters (2),
	Public_health_event (3),
	Social_security_incident (4);
	public Integer value;
	private EmergencyIncidentTypeEnum(Integer value){
		this.value=value;
	}
}
