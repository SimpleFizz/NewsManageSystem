package com.guigu.pojo;

public class ClassroomInfo {
    private Integer classroomId;

    private String classroomName;

    private Integer classroomMax;

    private String classroomInfo;

    private String classroomRemark;

    private String classroomMark;

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    public Integer getClassroomMax() {
        return classroomMax;
    }

    public void setClassroomMax(Integer classroomMax) {
        this.classroomMax = classroomMax;
    }

    public String getClassroomInfo() {
        return classroomInfo;
    }

    public void setClassroomInfo(String classroomInfo) {
        this.classroomInfo = classroomInfo == null ? null : classroomInfo.trim();
    }

    public String getClassroomRemark() {
        return classroomRemark;
    }

    public void setClassroomRemark(String classroomRemark) {
        this.classroomRemark = classroomRemark == null ? null : classroomRemark.trim();
    }

    public String getClassroomMark() {
        return classroomMark;
    }

    public void setClassroomMark(String classroomMark) {
        this.classroomMark = classroomMark == null ? null : classroomMark.trim();
    }

	@Override
	public String toString() {
		return "ClassroomInfo [classroomId=" + classroomId + ", classroomName=" + classroomName + ", classroomMax="
				+ classroomMax + ", classroomInfo=" + classroomInfo + ", classroomRemark=" + classroomRemark
				+ ", classroomMark=" + classroomMark + "]";
	}
    
    
}