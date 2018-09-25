package com.guigu.pojo;

import java.util.Date;

public class CommunicateInfo {
    private Integer communicateId;

    private Integer studentId;

    private Integer staffId;

    private Date communicateTime;

    private String communicateContent;

    public Integer getCommunicateId() {
        return communicateId;
    }

    public void setCommunicateId(Integer communicateId) {
        this.communicateId = communicateId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Date getCommunicateTime() {
        return communicateTime;
    }

    public void setCommunicateTime(Date communicateTime) {
        this.communicateTime = communicateTime;
    }

    public String getCommunicateContent() {
        return communicateContent;
    }

    public void setCommunicateContent(String communicateContent) {
        this.communicateContent = communicateContent == null ? null : communicateContent.trim();
    }
}