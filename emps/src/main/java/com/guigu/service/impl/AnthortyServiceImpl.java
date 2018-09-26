package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.mapper.AnthortyInfoMapper;
import com.guigu.mapper.RoleInfoMapper;
import com.guigu.pojo.AnthortyInfo;
import com.guigu.service.AnthortyService;

@Service
public class AnthortyServiceImpl implements AnthortyService {

	@Resource
	private AnthortyInfoMapper anthortyMapper;
	
	@Resource
	private RoleInfoMapper roleInfoMapper ;
	
	@Override
	public List<AnthortyInfo> getAnthortyInfoByRoleId(int roleId) throws Exception {
		return  anthortyMapper.getByRoleId(roleId);
	}


}
