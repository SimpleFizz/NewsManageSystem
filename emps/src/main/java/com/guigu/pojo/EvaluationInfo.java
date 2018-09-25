package com.guigu.pojo;

import java.util.Date;

public class EvaluationInfo {
    private Integer evaluationId;

    private Integer studentId;

    private String evaluationTitle;

    private String evaluationContent;

    private String evaluationCourse;

    private String evaluationTeacher;

    private Date evaluationTime;

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getEvaluationTitle() {
        return evaluationTitle;
    }

    public void setEvaluationTitle(String evaluationTitle) {
        this.evaluationTitle = evaluationTitle == null ? null : evaluationTitle.trim();
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent == null ? null : evaluationContent.trim();
    }

    public String getEvaluationCourse() {
        return evaluationCourse;
    }

    public void setEvaluationCourse(String evaluationCourse) {
        this.evaluationCourse = evaluationCourse == null ? null : evaluationCourse.trim();
    }

    public String getEvaluationTeacher() {
        return evaluationTeacher;
    }

    public void setEvaluationTeacher(String evaluationTeacher) {
        this.evaluationTeacher = evaluationTeacher == null ? null : evaluationTeacher.trim();
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }
}