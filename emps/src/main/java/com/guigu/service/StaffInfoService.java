package com.guigu.service;

import java.util.List;

import com.guigu.pojo.StaffInfo;

public interface StaffInfoService {

	List<StaffInfo> findAll()  throws Exception ;

	StaffInfo findById(int staffId)throws Exception ;

	boolean updateById(StaffInfo staffInfo) throws Exception;

	boolean deleteById(int staffId) throws Exception;

	boolean add(StaffInfo staffInfo) throws Exception;

	StaffInfo logIn(String userName, String passWord) throws Exception;

}
