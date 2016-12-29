package com.ste.emer.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

/**
 * Created by st on 2015/1/7.
 */

@Alias("DictionaryType")
public class YjxtDictionaryType implements Serializable {
    Integer dicTypeID;
    String dicTypeName;
    String dicTypeDefine;
    String dicTypeCode;
    Integer dicTypeIsCategory;

    public YjxtDictionaryType() {
    }

    public YjxtDictionaryType(Integer dicTypeID, String dicTypeName, String dicTypeDefine, String dicTypeCode, Integer dicTypeIsCategory) {
        this.dicTypeID = dicTypeID;
        this.dicTypeName = dicTypeName;
        this.dicTypeDefine = dicTypeDefine;
        this.dicTypeCode = dicTypeCode;
        this.dicTypeIsCategory = dicTypeIsCategory;

    }

    @Override
    public String toString() {
        return "YjxtDictionaryType{" +
                "dicTypeID=" + dicTypeID +
                ", dicTypeName='" + dicTypeName + '\'' +
                ", dicTypeDefine='" + dicTypeDefine + '\'' +
                ", dicTypeCode='" + dicTypeCode + '\'' +
                ", dicTypeIsCategory=" + dicTypeIsCategory +
                '}';
    }

    public Integer getDicTypeID() {
        return dicTypeID;
    }

    public void setDicTypeID(Integer dicTypeID) {
        this.dicTypeID = dicTypeID;
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

    public Integer getDicTypeIsCategory() {
        return dicTypeIsCategory;
    }

    public void setDicTypeIsCategory(Integer dicTypeIsCategory) {
        this.dicTypeIsCategory = dicTypeIsCategory;
    }
}
