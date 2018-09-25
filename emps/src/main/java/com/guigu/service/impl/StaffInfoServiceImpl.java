package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.guigu.mapper.StaffInfoMapper;
import com.guigu.pojo.StaffInfo;
import com.guigu.pojo.StaffInfoExample;
import com.guigu.service.StaffInfoService;

@Service
public class StaffInfoServiceImpl implements StaffInfoService{
	
	@Resource
	private StaffInfoMapper  staffInfoMapper;

	@Override
	public List<StaffInfo> findAll() throws Exception {
		List list = null;
		try {
			list = staffInfoMapper.selectByExample(new StaffInfoExample());
		}catch (Exception e) {
			//记录日志
			throw e;
		}
		return list;
	}

	@Override
	public StaffInfo findById(int staffId) throws Exception {
		return staffInfoMapper.selectByPrimaryKey(staffId);
	}

	@Override
	public boolean updateById(StaffInfo staffInfo) throws Exception {
		return staffInfoMapper.updateByPrimaryKeySelective(staffInfo) > 0;
	}

	@Override
	public boolean deleteById(int staffId) throws Exception {
		return staffInfoMapper.deleteByPrimaryKey(staffId) >0;
	}

	@Override
	public boolean add(StaffInfo staffInfo) throws Exception {
		return staffInfoMapper.insertSelective(staffInfo) > 0;
	}

	@Override
	public StaffInfo logIn(String userName, String passWord) throws Exception {
		StaffInfoExample  example = new StaffInfoExample();
		example.createCriteria().andUserNumberEqualTo(userName).andUserPassowrdEqualTo(passWord);
		List<StaffInfo> list = staffInfoMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(list)) {
			return list.get(0);
		}
		
		return null;
	}

}
