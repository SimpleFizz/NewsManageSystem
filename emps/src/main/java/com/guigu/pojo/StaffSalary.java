package com.guigu.pojo;


public class StaffSalary {
    private Integer staffSalaryId;

    private Integer staffId;

    private Integer staStaffId;

    private Double totalSalary;

    private Double deductSalary;

    private Double realSalary;

    private String isUesd;

    private String staffSalaryTime;

    private String staffRemark;

    public Integer getStaffSalaryId() {
        return staffSalaryId;
    }

    public void setStaffSalaryId(Integer staffSalaryId) {
        this.staffSalaryId = staffSalaryId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getStaStaffId() {
        return staStaffId;
    }

    public void setStaStaffId(Integer staStaffId) {
        this.staStaffId = staStaffId;
    }

    public Double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(Double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Double getDeductSalary() {
        return deductSalary;
    }

    public void setDeductSalary(Double deductSalary) {
        this.deductSalary = deductSalary;
    }

    public Double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(Double realSalary) {
        this.realSalary = realSalary;
    }

    public String getIsUesd() {
        return isUesd;
    }

    public void setIsUesd(String isUesd) {
        this.isUesd = isUesd == null ? null : isUesd.trim();
    }

    public String getStaffSalaryTime() {
        return staffSalaryTime;
    }

    public void setStaffSalaryTime(String staffSalaryTime) {
        this.staffSalaryTime = staffSalaryTime;
    }

    public String getStaffRemark() {
        return staffRemark;
    }

    public void setStaffRemark(String staffRemark) {
        this.staffRemark = staffRemark == null ? null : staffRemark.trim();
    }

	@Override
	public String toString() {
		return "StaffSalary [staffSalaryId=" + staffSalaryId + ", staffId=" + staffId + ", staStaffId=" + staStaffId
				+ ", totalSalary=" + totalSalary + ", deductSalary=" + deductSalary + ", realSalary=" + realSalary
				+ ", isUesd=" + isUesd + ", staffSalaryTime=" + staffSalaryTime + ", staffRemark=" + staffRemark + "]";
	}
    
    
}