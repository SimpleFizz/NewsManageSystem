package com.guigu.service;

import java.util.List;

import com.guigu.pojo.RoleInfo;
import com.guigu.pojo.StaffInfo;

public interface RoleService {

	List<RoleInfo> findAll() throws Exception ;

	boolean addRole(RoleInfo roleInfo) throws Exception;

	List<RoleInfo> findByName(String roleName) throws Exception;

	boolean deleteById(int roleId) throws Exception;

	RoleInfo findById(int roleId) throws Exception;

	boolean updateById(RoleInfo roleInfo) throws Exception;

	List<StaffInfo> findStaffRoleList()throws Exception;

	StaffInfo findByStaffId(int staffId) throws  Exception;

	boolean updateStaffRole(StaffInfo staffInfo) throws Exception;

	List<StaffInfo> findByNameOrSex(String staffName, String staffSex) throws Exception;

}
