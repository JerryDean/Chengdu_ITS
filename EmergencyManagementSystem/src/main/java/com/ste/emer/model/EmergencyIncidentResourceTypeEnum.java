package com.ste.emer.model;

public enum EmergencyIncidentResourceTypeEnum
{
All(0),
Vehicle(1),//车辆
Person(2);//人员
public Integer value;
private EmergencyIncidentResourceTypeEnum(Integer value){
	this.value=value;
}
}