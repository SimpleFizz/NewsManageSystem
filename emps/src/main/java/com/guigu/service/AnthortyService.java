package com.guigu.service;

import java.util.List;

import com.guigu.pojo.AnthortyInfo;

public interface AnthortyService {

	List<AnthortyInfo> getAnthortyInfoByRoleId(int roleId) throws Exception;

}
