package com.ste.emer.model;

import org.apache.ibatis.type.Alias;

/**
 * Created by hc on 2015/3/4.
 */
@Alias("TaxiGps")
public class TaxiGps {
	String taxiId;
	double taxiX;
	double taxiY;

	public String getTaxiId() {
		return taxiId;
	}

	public void setTaxiId(String taxiId) {
		this.taxiId = taxiId;
	}

	public double getTaxiX() {
		return taxiX;
	}

	public void setTaxiX(double taxiX) {
		this.taxiX = taxiX;
	}

	public double getTaxiY() {
		return taxiY;
	}

	public void setTaxiY(double taxiY) {
		this.taxiY = taxiY;
	}
}
