package com.guigu.pojo;

import java.util.Date;

public class ClassTransactionInfo {
    private Integer classTransactionId;

    private Integer classId;

    private String classTransactionTitle;

    private String classTransactionContent;

    private String classTransactionPerson;

    private Date classTransactionTime;

    private String classTransactionRemark;

    public Integer getClassTransactionId() {
        return classTransactionId;
    }

    public void setClassTransactionId(Integer classTransactionId) {
        this.classTransactionId = classTransactionId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassTransactionTitle() {
        return classTransactionTitle;
    }

    public void setClassTransactionTitle(String classTransactionTitle) {
        this.classTransactionTitle = classTransactionTitle == null ? null : classTransactionTitle.trim();
    }

    public String getClassTransactionContent() {
        return classTransactionContent;
    }

    public void setClassTransactionContent(String classTransactionContent) {
        this.classTransactionContent = classTransactionContent == null ? null : classTransactionContent.trim();
    }

    public String getClassTransactionPerson() {
        return classTransactionPerson;
    }

    public void setClassTransactionPerson(String classTransactionPerson) {
        this.classTransactionPerson = classTransactionPerson == null ? null : classTransactionPerson.trim();
    }

    public Date getClassTransactionTime() {
        return classTransactionTime;
    }

    public void setClassTransactionTime(Date classTransactionTime) {
        this.classTransactionTime = classTransactionTime;
    }

    public String getClassTransactionRemark() {
        return classTransactionRemark;
    }

    public void setClassTransactionRemark(String classTransactionRemark) {
        this.classTransactionRemark = classTransactionRemark == null ? null : classTransactionRemark.trim();
    }
}