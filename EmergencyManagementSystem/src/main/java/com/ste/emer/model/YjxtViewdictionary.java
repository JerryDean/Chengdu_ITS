package com.ste.emer.model;

import org.apache.ibatis.type.Alias;

/**
 * Created by neo on 2014/12/16.
 */
@Alias("ViewDictionary")
public class YjxtViewdictionary implements java.io.Serializable{
    private String dicID;
    private int dicTypeID;
    private String dicValue;
    private int dicCode;
    private String dicNote;
    private String dicCategoryID;
    private String dicTypeName;
    private String dicTypeDefine;
    private String dicTypeCode;
    private int dicTypeIsCategory;

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

    public String getDicTypeName() {
        return dicTypeName;
    }

    public void setDicTypeName(String dicTypeName) {
        this.dicTypeName = dicTypeName;
    }

    public String getDicTypeDefine() {
        return dicTypeDefine;
    }

    public void setDicTypeDefine(String dicTypeDefine) {
        this.dicTypeDefine = dicTypeDefine;
    }

    public String getDicTypeCode() {
        return dicTypeCode;
    }

    public void setDicTypeCode(String dicTypeCode) {
        this.dicTypeCode = dicTypeCode;
    }

    public int getDicTypeIsCategory() {
        return dicTypeIsCategory;
    }

    public void setDicTypeIsCategory(int dicTypeIsCategory) {
        this.dicTypeIsCategory = dicTypeIsCategory;
    }
}
