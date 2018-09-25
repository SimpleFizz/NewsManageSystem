package com.guigu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.mapper.AnthortyInfoMapper;
import com.guigu.mapper.RoleAnthorityInfoMapper;
import com.guigu.mapper.RoleInfoMapper;
import com.guigu.pojo.AnthortyInfo;
import com.guigu.pojo.AnthortyInfoExample;
import com.guigu.pojo.RoleAnthorityInfo;
import com.guigu.pojo.RoleAnthorityInfoExample;
import com.guigu.pojo.RoleInfo;
import com.guigu.pojo.RoleInfoExample;
import com.guigu.service.AnthortyService;

@Service
public class AnthortyServiceImpl implements AnthortyService{
	@Resource
	private AnthortyInfoMapper  anthortyMapper;
	@Resource
	private RoleInfoMapper  roleInfoMapper;
	
	@Resource
	private RoleAnthorityInfoMapper roleAnthorutyMapper;

	@Override
	public List<AnthortyInfo> findAll() throws Exception {
		List<AnthortyInfo> list = anthortyMapper.selectByExample(new AnthortyInfoExample());
		return list;
	}

	@Override
	public List<RoleInfo> findAllRole() throws Exception {
		return roleInfoMapper.selectByExample(new RoleInfoExample());
	}

	@Override
	public List<RoleInfo> findAllRoleByName(String roleName) throws Exception {
		RoleInfoExample example = new RoleInfoExample();
		example.createCriteria().andRoleNameLike("%"+roleName+"%");
		return roleInfoMapper.selectByExample(example);
	}

	@Override
	public RoleInfo getRoleInfoById(int roleId) throws Exception {
		return roleInfoMapper.selectByPrimaryKey(roleId);
	}

	@Override
	public List<AnthortyInfo> getAnthortyInfoByRoleId(int roleId) throws Exception {
		return anthortyMapper.getByRoleId(roleId);
	}

	@Override
	public void anthortyChange(int roleId, Integer[] anthortyId) throws Exception {
		
		
		//进行删除
		RoleAnthorityInfoExample  example = new RoleAnthorityInfoExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		roleAnthorutyMapper.deleteByExample(example);
		//添加
		RoleAnthorityInfo info = null;
		if(anthortyId !=null && anthortyId.length>0) {
			for(int anthId :anthortyId) {
				info = new RoleAnthorityInfo();
				info.setAnthortyId(anthId);
				info.setRoleId(roleId);
				roleAnthorutyMapper.insertSelective(info);
			}
		}
		
	}

	@Override
	public AnthortyInfo getAnthortyInfoById(int anthortyId) throws Exception {
		AnthortyInfo  anthortyInfo =  anthortyMapper.selectByPrimaryKey(anthortyId);
		
		if(anthortyInfo != null) {
			anthortyInfo.setParentAnthorty(anthortyMapper.selectByPrimaryKey(anthortyInfo.getAnthortyPid()));	
		}
		
		return anthortyInfo;
	}

	@Override
	public List<AnthortyInfo> getAllAnthortyInfoOne() throws Exception {
		AnthortyInfoExample  example = new AnthortyInfoExample();
		example.createCriteria().andAnthortyPidEqualTo(1);
		return anthortyMapper.selectByExample(example);
	}

	@Override
	public void changeAnthortyById(AnthortyInfo anthortyInfo) throws Exception {
		anthortyMapper.updateByPrimaryKeySelective(anthortyInfo);
	}

}
