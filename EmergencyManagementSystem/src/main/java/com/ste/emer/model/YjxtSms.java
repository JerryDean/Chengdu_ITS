package com.ste.emer.model;

import org.apache.ibatis.type.Alias;

import oracle.sql.DATE;

/**
 * Created by st on 2015/1/8.
 */
@Alias("Sms")
public class YjxtSms {
    Integer smsID;
    String smsText;
    String sendUser;
    String recivedUser;
    String sendTime;

    public YjxtSms(Integer smsID, String smsText, String sendUser, String recivedUser, String sendTime) {
        this.smsID = smsID;
        this.smsText = smsText;
        this.sendUser = sendUser;
        this.recivedUser = recivedUser;
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "YjxtSms{" +
                "smsID=" + smsID +
                ", smsText='" + smsText + '\'' +
                ", sendUser='" + sendUser + '\'' +
                ", recivedUser='" + recivedUser + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }

    public Integer getSmsID() {
        return smsID;
    }

    public void setSmsID(Integer smsID) {
        this.smsID = smsID;
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    public String getSendUser() {
        return sendUser;
    }

    public void setSendUser(String sendUser) {
        this.sendUser = sendUser;
    }

    public String getRecivedUser() {
        return recivedUser;
    }

    public void setRecivedUser(String recivedUser) {
        this.recivedUser = recivedUser;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public YjxtSms() {

    }
}
