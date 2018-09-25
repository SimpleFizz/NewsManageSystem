package com.guigu.service;

import java.util.List;

import com.guigu.pojo.StaffInfo;

public interface TeacherService {

	List<StaffInfo> findAllByRoleId(int roleId1) throws Exception;

	boolean add(StaffInfo staffInfo) throws Exception;

	List<StaffInfo> findByNameOrSex(String staffName, String staffSex) throws Exception;

	boolean deleteById(int staffId) throws Exception;

	StaffInfo findById(int staffId) throws Exception;

	boolean updateById(StaffInfo staffInfo) throws Exception;

}
