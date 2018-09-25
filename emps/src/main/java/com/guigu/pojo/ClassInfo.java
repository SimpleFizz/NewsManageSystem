package com.guigu.pojo;

import java.util.Date;

public class ClassInfo {
    private Integer classId;

    private Integer disciplineId;

    private Integer syllabusId;

    private Integer classroomId;

    private Integer staffId;

    private String className;

    private Integer classNumber;

    private String classStartTime;

    private String classEndTime;

    private String classIsuesd;

    private String classState;

    private String classDesc;
    
    private ClassroomInfo  classroomInfo ;

    public ClassroomInfo getClassroomInfo() {
		return classroomInfo;
	}

	public void setClassroomInfo(ClassroomInfo classroomInfo) {
		this.classroomInfo = classroomInfo;
	}

	public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public Integer getSyllabusId() {
        return syllabusId;
    }

    public void setSyllabusId(Integer syllabusId) {
        this.syllabusId = syllabusId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassStartTime() {
        return classStartTime;
    }

    public void setClassStartTime(String classStartTime) {
        this.classStartTime = classStartTime;
    }

    public String getClassEndTime() {
        return classEndTime;
    }

    public void setClassEndTime(String classEndTime) {
        this.classEndTime = classEndTime;
    }

    public String getClassIsuesd() {
        return classIsuesd;
    }

    public void setClassIsuesd(String classIsuesd) {
        this.classIsuesd = classIsuesd == null ? null : classIsuesd.trim();
    }

    public String getClassState() {
        return classState;
    }

    public void setClassState(String classState) {
        this.classState = classState == null ? null : classState.trim();
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

	@Override
	public String toString() {
		return "ClassInfo [classId=" + classId + ", disciplineId=" + disciplineId + ", syllabusId=" + syllabusId
				+ ", classroomId=" + classroomId + ", staffId=" + staffId + ", className=" + className
				+ ", classNumber=" + classNumber + ", classStartTime=" + classStartTime + ", classEndTime="
				+ classEndTime + ", classIsuesd=" + classIsuesd + ", classState=" + classState + ", classDesc="
				+ classDesc + ", classroomInfo=" + classroomInfo + "]";
	}
    
    
}