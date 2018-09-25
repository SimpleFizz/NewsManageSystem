package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.mapper.ClassroomInfoMapper;
import com.guigu.pojo.ClassroomInfo;
import com.guigu.pojo.ClassroomInfoExample;
import com.guigu.service.ClassroomService;

@Service
public class ClassroomServiceImpl implements ClassroomService {
	
	@Resource
	ClassroomInfoMapper classroomInfoMapper;
	
	@Override
	public List<ClassroomInfo> findAll() throws Exception {
		
		
		return classroomInfoMapper.selectByExample(new ClassroomInfoExample());
	}

	@Override
	public boolean addClassroom(ClassroomInfo classroomInfo) throws Exception {

		return classroomInfoMapper.insert(classroomInfo) > 0;
	}

	@Override
	public List<ClassroomInfo> findByName(String classroomName) throws Exception {
		ClassroomInfoExample example = new ClassroomInfoExample();
		example.createCriteria().andClassroomNameLike("%"+classroomName+"%");
		
		return classroomInfoMapper.selectByExample(example);
	}

	@Override
	public boolean deleteById(int classroomId) throws Exception {

		return classroomInfoMapper.deleteByPrimaryKey(classroomId) > 0;
	}

	@Override
	public ClassroomInfo findByName(int classroomId) throws Exception {
		return classroomInfoMapper.selectByPrimaryKey(classroomId);
	}

	@Override
	public boolean update(ClassroomInfo classroomInfo) throws Exception {
		
		return classroomInfoMapper.updateByPrimaryKeySelective(classroomInfo) > 0;
	}


}
