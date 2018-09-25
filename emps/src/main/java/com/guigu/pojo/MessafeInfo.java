package com.guigu.pojo;

import java.util.Date;

public class MessafeInfo {
    private Integer messafeId;

    private Integer staffId;

    private String messafeContent;

    private String messafeMan;

    private String messafePhone;

    private Date messafeTime;

    private String messafeState;

    public Integer getMessafeId() {
        return messafeId;
    }

    public void setMessafeId(Integer messafeId) {
        this.messafeId = messafeId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getMessafeContent() {
        return messafeContent;
    }

    public void setMessafeContent(String messafeContent) {
        this.messafeContent = messafeContent == null ? null : messafeContent.trim();
    }

    public String getMessafeMan() {
        return messafeMan;
    }

    public void setMessafeMan(String messafeMan) {
        this.messafeMan = messafeMan == null ? null : messafeMan.trim();
    }

    public String getMessafePhone() {
        return messafePhone;
    }

    public void setMessafePhone(String messafePhone) {
        this.messafePhone = messafePhone == null ? null : messafePhone.trim();
    }

    public Date getMessafeTime() {
        return messafeTime;
    }

    public void setMessafeTime(Date messafeTime) {
        this.messafeTime = messafeTime;
    }

    public String getMessafeState() {
        return messafeState;
    }

    public void setMessafeState(String messafeState) {
        this.messafeState = messafeState == null ? null : messafeState.trim();
    }
}