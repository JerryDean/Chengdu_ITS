package com.ste.emer.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

/**
 * Created by st on 2014/12/30.
 */
@Alias("Emerplangrade")
public class Emerplangrade implements Serializable {
    private String pgID;
    private String pgValue;

    public String getPgID() {
        return pgID;
    }

    public void setPgID(String pgID) {
        this.pgID = pgID;
    }

    public String getPgValue() {
        return pgValue;
    }

    public void setPgValue(String pgValue) {
        this.pgValue = pgValue;
    }
}
