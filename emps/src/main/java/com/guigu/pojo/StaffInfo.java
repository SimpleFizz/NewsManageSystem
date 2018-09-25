package com.guigu.pojo;

import java.util.Date;

public class StaffInfo {
    private Integer staffId;

    private Integer roleId;
    
    private RoleInfo  roleInfo;
    
    private String staffName;

    private String staffSex;

    private Integer staffAge;

    private String staffNativePlace;

    private String staffIdcard;

    private String staffBrithday;

    private String staffOfficePhone;

    private String staffMobilePhone;

    private String staffEamil;

    private String staffAddr;

    private String staffQq;

    private String staffEntryTime;

    private String staffEductionLevel;

    private String staffRemark;

    private String staffState;

    private String userNumber;

    private String userPassowrd;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getStaffName() {
        return staffName;
    }
    

    public RoleInfo getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

	@Override
	public String toString() {
		return "StaffInfo [staffId=" + staffId + ", roleId=" + roleId + ", staffName=" + staffName + ", staffSex="
				+ staffSex + ", staffAge=" + staffAge + ", staffNativePlace=" + staffNativePlace + ", staffIdcard="
				+ staffIdcard + ", staffBrithday=" + staffBrithday + ", staffOfficePhone=" + staffOfficePhone
				+ ", staffMobilePhone=" + staffMobilePhone + ", staffEamil=" + staffEamil + ", staffAddr=" + staffAddr
				+ ", staffQq=" + staffQq + ", staffEntryTime=" + staffEntryTime + ", staffEductionLevel="
				+ staffEductionLevel + ", staffRemark=" + staffRemark + ", staffState=" + staffState + ", userNumber="
				+ userNumber + ", userPassowrd=" + userPassowrd + ", getStaffId()=" + getStaffId() + ", getRoleId()="
				+ getRoleId() + ", getStaffName()=" + getStaffName() + ", getStaffSex()=" + getStaffSex()
				+ ", getStaffAge()=" + getStaffAge() + ", getStaffNativePlace()=" + getStaffNativePlace()
				+ ", getStaffIdcard()=" + getStaffIdcard() + ", getStaffBrithday()=" + getStaffBrithday()
				+ ", getStaffOfficePhone()=" + getStaffOfficePhone() + ", getStaffMobilePhone()="
				+ getStaffMobilePhone() + ", getStaffEamil()=" + getStaffEamil() + ", getStaffAddr()=" + getStaffAddr()
				+ ", getStaffQq()=" + getStaffQq() + ", getStaffEntryTime()=" + getStaffEntryTime()
				+ ", getStaffEductionLevel()=" + getStaffEductionLevel() + ", getStaffRemark()=" + getStaffRemark()
				+ ", getStaffState()=" + getStaffState() + ", getUserNumber()=" + getUserNumber()
				+ ", getUserPassowrd()=" + getUserPassowrd() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getStaffNativePlace() {
        return staffNativePlace;
    }

    public void setStaffNativePlace(String staffNativePlace) {
        this.staffNativePlace = staffNativePlace == null ? null : staffNativePlace.trim();
    }

    public String getStaffIdcard() {
        return staffIdcard;
    }

    public void setStaffIdcard(String staffIdcard) {
        this.staffIdcard = staffIdcard == null ? null : staffIdcard.trim();
    }

    public String getStaffBrithday() {
        return staffBrithday;
    }

    public void setStaffBrithday(String staffBrithday) {
        this.staffBrithday = staffBrithday;
    }

    public String getStaffOfficePhone() {
        return staffOfficePhone;
    }

    public void setStaffOfficePhone(String staffOfficePhone) {
        this.staffOfficePhone = staffOfficePhone == null ? null : staffOfficePhone.trim();
    }

    public String getStaffMobilePhone() {
        return staffMobilePhone;
    }

    public void setStaffMobilePhone(String staffMobilePhone) {
        this.staffMobilePhone = staffMobilePhone == null ? null : staffMobilePhone.trim();
    }

    public String getStaffEamil() {
        return staffEamil;
    }

    public void setStaffEamil(String staffEamil) {
        this.staffEamil = staffEamil == null ? null : staffEamil.trim();
    }

    public String getStaffAddr() {
        return staffAddr;
    }

    public void setStaffAddr(String staffAddr) {
        this.staffAddr = staffAddr == null ? null : staffAddr.trim();
    }

    public String getStaffQq() {
        return staffQq;
    }

    public void setStaffQq(String staffQq) {
        this.staffQq = staffQq == null ? null : staffQq.trim();
    }

    public String getStaffEntryTime() {
        return staffEntryTime;
    }

    public void setStaffEntryTime(String staffEntryTime) {
        this.staffEntryTime = staffEntryTime;
    }

    public String getStaffEductionLevel() {
        return staffEductionLevel;
    }

    public void setStaffEductionLevel(String staffEductionLevel) {
        this.staffEductionLevel = staffEductionLevel == null ? null : staffEductionLevel.trim();
    }

    public String getStaffRemark() {
        return staffRemark;
    }

    public void setStaffRemark(String staffRemark) {
        this.staffRemark = staffRemark == null ? null : staffRemark.trim();
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState == null ? null : staffState.trim();
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String getUserPassowrd() {
        return userPassowrd;
    }

    public void setUserPassowrd(String userPassowrd) {
        this.userPassowrd = userPassowrd == null ? null : userPassowrd.trim();
    }
}