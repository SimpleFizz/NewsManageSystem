package com.guigu.service;

import java.util.List;

import com.guigu.pojo.AnthortyInfo;
import com.guigu.pojo.RoleInfo;

public interface AnthortyService {

	List<AnthortyInfo> findAll() throws Exception ;

	List<RoleInfo> findAllRole() throws Exception;

	List<RoleInfo> findAllRoleByName(String roleName) throws Exception;

	RoleInfo getRoleInfoById(int roleId)  throws  Exception;

	List<AnthortyInfo> getAnthortyInfoByRoleId(int roleId) throws  Exception;

	void anthortyChange(int roleId, Integer[] anthortyId) throws Exception;

	AnthortyInfo getAnthortyInfoById(int anthortyId) throws Exception;

	List<AnthortyInfo> getAllAnthortyInfoOne() throws  Exception;

	void changeAnthortyById(AnthortyInfo anthortyInfo) throws Exception;

}
