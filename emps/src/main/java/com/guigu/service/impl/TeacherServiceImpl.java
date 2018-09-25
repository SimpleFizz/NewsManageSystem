package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.guigu.mapper.StaffInfoMapper;
import com.guigu.pojo.StaffInfo;
import com.guigu.pojo.StaffInfoExample;
import com.guigu.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {
	
	
	@Resource
	StaffInfoMapper staffInfoMapper ;
	
	@Override
	public List<StaffInfo> findAllByRoleId(int roleId1) throws Exception {
			StaffInfoExample example = new StaffInfoExample();
			example.createCriteria().andRoleIdEqualTo(roleId1);
		
		return staffInfoMapper.selectByExample(example);
	}

	@Override
	public boolean add(StaffInfo staffInfo) throws Exception {
			
			staffInfo.setRoleId(7);
		return staffInfoMapper.insertSelective(staffInfo) > 0;
	}

	@Override
	public List<StaffInfo> findByNameOrSex(String staffName, String staffSex) throws Exception {
		StaffInfoExample  example = new StaffInfoExample();
		if(staffName != null  && staffSex == null) {
			example.createCriteria().andStaffNameLike("%"+staffName+"%").andRoleIdEqualTo(7);
			return staffInfoMapper.selectByExample(example);
		}else {
			example.createCriteria().andStaffSexLike("%"+staffSex+"%").andRoleIdEqualTo(7);
			return staffInfoMapper.selectByExample(example);
		}

	}

	@Override
	public boolean deleteById(int staffId) throws Exception {

		return staffInfoMapper.deleteByPrimaryKey(staffId) > 0;
	}
	

	@Override
	public StaffInfo findById(int staffId) throws Exception {
		
		
		return staffInfoMapper.selectByPrimaryKey(staffId);
	}

	@Override
	public boolean updateById(StaffInfo staffInfo) throws Exception {

		return staffInfoMapper.updateByPrimaryKeySelective(staffInfo) > 0;
	}
	
}
