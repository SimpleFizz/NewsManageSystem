package com.guigu.pojo;

import java.util.Date;

public class AuditionInfo {
    private Integer auditionId;

    private Integer studentId;

    private Date auditionTime;

    private String auditionAddr;

    private String auditionCourse;

    private String auditionDesc;

    public Integer getAuditionId() {
        return auditionId;
    }

    public void setAuditionId(Integer auditionId) {
        this.auditionId = auditionId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getAuditionTime() {
        return auditionTime;
    }

    public void setAuditionTime(Date auditionTime) {
        this.auditionTime = auditionTime;
    }

    public String getAuditionAddr() {
        return auditionAddr;
    }

    public void setAuditionAddr(String auditionAddr) {
        this.auditionAddr = auditionAddr == null ? null : auditionAddr.trim();
    }

    public String getAuditionCourse() {
        return auditionCourse;
    }

    public void setAuditionCourse(String auditionCourse) {
        this.auditionCourse = auditionCourse == null ? null : auditionCourse.trim();
    }

    public String getAuditionDesc() {
        return auditionDesc;
    }

    public void setAuditionDesc(String auditionDesc) {
        this.auditionDesc = auditionDesc == null ? null : auditionDesc.trim();
    }
}