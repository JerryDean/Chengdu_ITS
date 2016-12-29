package com.ste.emer.model;

import java.io.Serializable;

/**
 * Created by st on 2014/12/30.
 */
public class Emerplanstate implements Serializable{
    private String psID;
    private String psValue;

    public String getPsID() {
        return psID;
    }

    public void setPsID(String psID) {
        this.psID = psID;
    }

    public String getPsValue() {
        return psValue;
    }

    public void setPsValue(String psValue) {
        this.psValue = psValue;
    }
}
