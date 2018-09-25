package com.guigu.service;

import java.util.List;

import com.guigu.pojo.ClassroomInfo;

public interface ClassroomService {

	List<ClassroomInfo> findAll() throws Exception;

	boolean addClassroom(ClassroomInfo classroomInfo) throws Exception;

	List<ClassroomInfo> findByName(String classroomName) throws Exception;

	boolean deleteById(int classroomId) throws Exception;

	ClassroomInfo findByName(int classroomId) throws Exception;

	boolean update(ClassroomInfo classroomInfo) throws Exception ;




	
}
