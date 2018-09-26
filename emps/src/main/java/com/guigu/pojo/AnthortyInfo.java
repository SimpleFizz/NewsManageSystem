package com.guigu.pojo;

public class AnthortyInfo {
    private Integer anthortyId;

    private Integer anthortyPid;

    private String anthortyName;

    private String anthortyUrl;

    public Integer getAnthortyId() {
        return anthortyId;
    }

    public void setAnthortyId(Integer anthortyId) {
        this.anthortyId = anthortyId;
    }

    public Integer getAnthortyPid() {
        return anthortyPid;
    }

    public void setAnthortyPid(Integer anthortyPid) {
        this.anthortyPid = anthortyPid;
    }

    public String getAnthortyName() {
        return anthortyName;
    }

    public void setAnthortyName(String anthortyName) {
        this.anthortyName = anthortyName == null ? null : anthortyName.trim();
    }

    public String getAnthortyUrl() {
        return anthortyUrl;
    }

    public void setAnthortyUrl(String anthortyUrl) {
        this.anthortyUrl = anthortyUrl == null ? null : anthortyUrl.trim();
    }
}