package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.guigu.mapper.RoleInfoMapper;
import com.guigu.mapper.StaffInfoMapper;
import com.guigu.pojo.RoleInfo;
import com.guigu.pojo.RoleInfoExample;
import com.guigu.pojo.StaffInfo;
import com.guigu.pojo.StaffInfoExample;
import com.guigu.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Resource
	private RoleInfoMapper  roleInfoMapper;
	@Resource
	private StaffInfoMapper  staffInfoMapper;

	@Override
	public List<RoleInfo> findAll() throws Exception {
		
		return roleInfoMapper.selectByExample(new RoleInfoExample());
	}

	@Override
	public boolean addRole(RoleInfo roleInfo) throws Exception {
		return roleInfoMapper.insertSelective(roleInfo) > 0;
	}

	@Override
	public List<RoleInfo> findByName(String roleName) throws Exception {
		RoleInfoExample  example = new RoleInfoExample();
		example.createCriteria().andRoleNameLike("%"+roleName+"%");
		return roleInfoMapper.selectByExample(example);
	}

	@Override
	public boolean deleteById(int roleId) throws Exception {
		return roleInfoMapper.deleteByPrimaryKey(roleId)> 0;
	}

	@Override
	public RoleInfo findById(int roleId) throws Exception {
		return roleInfoMapper.selectByPrimaryKey(roleId);
	}

	@Override
	public boolean updateById(RoleInfo roleInfo) throws Exception {
		return roleInfoMapper.updateByPrimaryKeySelective(roleInfo) > 0;
	}

	@Override
	public List<StaffInfo> findStaffRoleList() throws Exception {
		List<StaffInfo> list = staffInfoMapper.selectByExample(new StaffInfoExample());
		if(!CollectionUtils.isEmpty(list)) {
			list.forEach((staff)->{
				staff.setRoleInfo(roleInfoMapper.selectByPrimaryKey(staff.getRoleId()));
			});
		}
		return list;
	}

	@Override
	public StaffInfo findByStaffId(int staffId) throws Exception {
		StaffInfo  staffInfo = staffInfoMapper.selectByPrimaryKey(staffId);
		return staffInfo;
	}

	@Override
	public boolean updateStaffRole(StaffInfo staffInfo) throws Exception {
		return staffInfoMapper.updateByPrimaryKeySelective(staffInfo) > 0 ;
	}

	@Override
	public List<StaffInfo> findByNameOrSex(String staffName, String staffSex) throws Exception {
		StaffInfoExample  example = new StaffInfoExample();
		if(staffName != null  && staffSex == null) {
			example.createCriteria().andStaffNameLike("%"+staffName+"%");
		}else {
			example.createCriteria().andStaffSexLike("%"+staffSex+"%");
		}
		List<StaffInfo> list=  staffInfoMapper.selectByExample(example);
			if(!CollectionUtils.isEmpty(list)) {
				list.forEach((staff)->{
					staff.setRoleInfo(roleInfoMapper.selectByPrimaryKey(staff.getRoleId()));
				});
			}
		return list;
	}

}
