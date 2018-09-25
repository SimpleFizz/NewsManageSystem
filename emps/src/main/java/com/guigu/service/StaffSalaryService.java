package com.guigu.service;

import java.util.List;

import com.guigu.pojo.Page;
import com.guigu.pojo.StaffSalary;

public interface StaffSalaryService {

	List<StaffSalary> findAll() throws Exception ;

	boolean add(StaffSalary staffSalary) throws Exception;

	List<StaffSalary> findByIdOfStaff(int staffId) throws Exception;

	boolean deleteById(int staffSalaryId) throws Exception ;

	StaffSalary findByName(int staffSalaryId) throws Exception;

	boolean update(StaffSalary staffSalary) throws Exception;

	Page<StaffSalary> getPage(int pageNum) throws Exception;


/*	boolean addClassroom(ClassroomInfo classroomInfo) throws Exception;

	List<ClassroomInfo> findByName(String classroomName) throws Exception;

	boolean deleteById(int classroomId) throws Exception;

	ClassroomInfo findByName(int classroomId) throws Exception;

	boolean update(ClassroomInfo classroomInfo) throws Exception ;
}*/
	}