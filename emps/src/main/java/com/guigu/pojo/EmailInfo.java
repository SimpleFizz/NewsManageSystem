package com.guigu.pojo;

import java.util.Date;

public class EmailInfo {
    private Integer emailId;

    private Integer staffId;

    private String emailTitle;

    private String emailContent;

    private Date emailTime;

    private String emailMan;

    private String emailAddr;

    private String emailState;

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle == null ? null : emailTitle.trim();
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }

    public Date getEmailTime() {
        return emailTime;
    }

    public void setEmailTime(Date emailTime) {
        this.emailTime = emailTime;
    }

    public String getEmailMan() {
        return emailMan;
    }

    public void setEmailMan(String emailMan) {
        this.emailMan = emailMan == null ? null : emailMan.trim();
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr == null ? null : emailAddr.trim();
    }

    public String getEmailState() {
        return emailState;
    }

    public void setEmailState(String emailState) {
        this.emailState = emailState == null ? null : emailState.trim();
    }
}