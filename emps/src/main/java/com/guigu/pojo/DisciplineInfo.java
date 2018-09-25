package com.guigu.pojo;

public class DisciplineInfo {
    private Integer disciplineId;

    private String disciplineName;

    private Integer disciplineTuition;

    private Integer disciplineBring;

    private String disciplineDesc;

    private String disciplineIsuesd;

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName == null ? null : disciplineName.trim();
    }

    public Integer getDisciplineTuition() {
        return disciplineTuition;
    }

    public void setDisciplineTuition(Integer disciplineTuition) {
        this.disciplineTuition = disciplineTuition;
    }

    public Integer getDisciplineBring() {
        return disciplineBring;
    }

    public void setDisciplineBring(Integer disciplineBring) {
        this.disciplineBring = disciplineBring;
    }

    public String getDisciplineDesc() {
        return disciplineDesc;
    }

    public void setDisciplineDesc(String disciplineDesc) {
        this.disciplineDesc = disciplineDesc == null ? null : disciplineDesc.trim();
    }

    public String getDisciplineIsuesd() {
        return disciplineIsuesd;
    }

    public void setDisciplineIsuesd(String disciplineIsuesd) {
        this.disciplineIsuesd = disciplineIsuesd == null ? null : disciplineIsuesd.trim();
    }
}