package com.guigu.service;

import java.util.List;

import com.guigu.pojo.ClassInfo;

public interface ClassService {

	List<ClassInfo> findAll() throws Exception;

	boolean addClass(ClassInfo classInfo) throws Exception;

	List<ClassInfo> findByName(String className) throws Exception;

	boolean deleteById(int classId) throws Exception;

	ClassInfo findByName(int classId) throws Exception ;

	boolean updateByClassInfo(ClassInfo classInfo) throws Exception ;
	
}
