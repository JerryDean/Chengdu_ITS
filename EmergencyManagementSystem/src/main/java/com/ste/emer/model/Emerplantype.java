package com.ste.emer.model;

import java.io.Serializable;

/**
 * Created by st on 2014/12/30.
 */
public class Emerplantype implements Serializable{
    private String pyID;
    private String pyValue;

    public String getPyValue() {
        return pyValue;
    }

    public void setPyValue(String pyValue) {
        this.pyValue = pyValue;
    }

    public String getPyID() {
        return pyID;

    }

    public void setPyID(String pyID) {
        this.pyID = pyID;
    }
}
