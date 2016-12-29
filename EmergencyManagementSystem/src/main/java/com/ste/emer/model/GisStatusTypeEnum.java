package com.ste.emer.model;

public enum GisStatusTypeEnum {
	layerName(0),
	cctvId(1),
	lprId(2),
	centerX(3),
	centerY(4),
	Resolution(5);
	public Integer value;
	private GisStatusTypeEnum(Integer value){
		this.value=value;
	}
}
