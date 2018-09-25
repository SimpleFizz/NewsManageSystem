package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.mapper.ClassInfoMapper;
import com.guigu.mapper.ClassroomInfoMapper;
import com.guigu.pojo.ClassInfo;
import com.guigu.pojo.ClassInfoExample;
import com.guigu.pojo.ClassroomInfoExample;
import com.guigu.service.ClassService;


@Service
public class ClassServiceImpl implements ClassService {
	
	
	@Resource
	ClassInfoMapper   classInfoMapper;
	
	@Resource
	ClassroomInfoMapper  classroomInfoMapper ;

	@Override
	public List<ClassInfo> findAll() throws Exception {
		
		List<ClassInfo> list = classInfoMapper.selectByExample(new ClassInfoExample());
		
/*		list.forEach((staff)->{
			staff.setRoleInfo(roleInfoMapper.selectByPrimaryKey(staff.getRoleId()));
		});*/
		
		list.forEach((classinfo)->{
			classinfo.setClassroomInfo(classroomInfoMapper.selectByPrimaryKey(classinfo.getClassroomId()));
		});
		
		return list ;
	}

	@Override
	public boolean addClass(ClassInfo classInfo) throws Exception {
					
		return classInfoMapper.insert(classInfo) > 0;
		
	}

	@Override
	public List<ClassInfo> findByName(String className) throws Exception {
		ClassInfoExample example = new ClassInfoExample();
		example.createCriteria().andClassNameLike("%"+className+"%");
		
		return classInfoMapper.selectByExample(example);
	}

	@Override
	public boolean deleteById(int classId) throws Exception {

		return classInfoMapper.deleteByPrimaryKey(classId) > 0;
	}

	@Override
	public ClassInfo findByName(int classId) throws Exception {

		return classInfoMapper.selectByPrimaryKey(classId);
	}

	@Override
	public boolean updateByClassInfo(ClassInfo classInfo) throws Exception {

		
		return classInfoMapper.updateByPrimaryKeySelective(classInfo) > 0;
	}

}
