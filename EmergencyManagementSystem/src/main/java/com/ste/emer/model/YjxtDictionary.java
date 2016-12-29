package com.ste.emer.model;

import org.apache.ibatis.type.Alias;

/**
 * Created by neo on 2014/12/16.
 */
@Alias("Dictionary")
public class YjxtDictionary implements java.io.Serializable {
    private String dicID;
    private int dicTypeID;
    private String dicValue;
    private int dicCode;
    private String dicNote;
    private String dicCategoryID;

    public String getDicID() {
        return dicID;
    }

    public void setDicID(String dicID) {
        this.dicID = dicID;
    }

    public int getDicTypeID() {
        return dicTypeID;
    }

    public void setDicTypeID(int dicTypeID) {
        this.dicTypeID = dicTypeID;
    }

    public String getDicValue() {
        return dicValue;
    }

    public void setDicValue(String dicValue) {
        this.dicValue = dicValue;
    }

    public int getDicCode() {
        return dicCode;
    }

    public void setDicCode(int dicCode) {
        this.dicCode = dicCode;
    }

    public String getDicNote() {
        return dicNote;
    }

    public void setDicNote(String dicNote) {
        this.dicNote = dicNote;
    }

    public String getDicCategoryID() {
        return dicCategoryID;
    }

    public void setDicCategoryID(String dicCategoryID) {
        this.dicCategoryID = dicCategoryID;
    }
}
