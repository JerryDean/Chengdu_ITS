package com.ste.emer.model;

import java.io.Serializable;

/**
 * Created by st on 2014/12/30.
 */
public class Emeraccidentgrade implements Serializable{
    @Override
    public String toString() {
        return "Emeraccidentgrade{" +
                "dagID='" + dagID + '\'' +
                ", dagValue='" + dagValue + '\'' +
                '}';
    }

    public Emeraccidentgrade(String dagID, String dagValue) {
        this.dagID = dagID;
        this.dagValue = dagValue;
    }

    private String dagID;
    private String dagValue;

    public String getDagID() {
        return dagID;
    }

    public void setDagID(String dagID) {
        this.dagID = dagID;
    }

    public Emeraccidentgrade() {
    }

    public String getDagValue() {
        return dagValue;
    }

    public void setDagValue(String dagValue) {
        this.dagValue = dagValue;
    }
}
