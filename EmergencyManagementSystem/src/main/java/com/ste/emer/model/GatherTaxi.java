package com.ste.emer.model;

import org.apache.ibatis.type.Alias;

/**
 * Created by hc on 2015/3/10.
 */

@Alias("GatherTaxi")
public class GatherTaxi {
    String gtaxiId;
    double taxiX;
    double taxiY;

    public String getGtaxiId() {
        return gtaxiId;
    }

    public void setGtaxiId(String gtaxiId) {
        this.gtaxiId = gtaxiId;
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
