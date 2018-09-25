package com.guigu.pojo;

public class AnthortyInfo {
    private Integer anthortyId;

    private Integer anthortyPid;
    
    private AnthortyInfo  parentAnthorty;
    

    public AnthortyInfo getParentAnthorty() {
		return parentAnthorty;
	}

	public void setParentAnthorty(AnthortyInfo parentAnthorty) {
		this.parentAnthorty = parentAnthorty;
	}

	private String anthortyName;

    private String anthortyDesc;

    private String anthortyUrl;
    
    private boolean checked;
    

    
    public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

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

    public String getAnthortyDesc() {
        return anthortyDesc;
    }

    public void setAnthortyDesc(String anthortyDesc) {
        this.anthortyDesc = anthortyDesc == null ? null : anthortyDesc.trim();
    }

    public String getAnthortyUrl() {
        return anthortyUrl;
    }

    public void setAnthortyUrl(String anthortyUrl) {
        this.anthortyUrl = anthortyUrl == null ? null : anthortyUrl.trim();
    }
}