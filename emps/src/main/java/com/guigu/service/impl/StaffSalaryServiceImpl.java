package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.mapper.StaffSalaryMapper;
import com.guigu.pojo.Page;
import com.guigu.pojo.StaffSalary;
import com.guigu.pojo.StaffSalaryExample;
import com.guigu.service.StaffSalaryService;


@Service
public class StaffSalaryServiceImpl implements StaffSalaryService {

	
	@Resource
	StaffSalaryMapper staffSalaryMapper;
	
	@Override
	public List<StaffSalary> findAll() throws Exception {
		
	return staffSalaryMapper.selectByExample(new StaffSalaryExample());
	}

	@Override
	public boolean add(StaffSalary staffSalary) throws Exception {

		return staffSalaryMapper.insert(staffSalary) > 0;
	}

	@Override
	public List<StaffSalary> findByIdOfStaff(int staffId) throws Exception {
		
		StaffSalaryExample example = new StaffSalaryExample();
		example.createCriteria().andStaffIdEqualTo(staffId);
		
		return staffSalaryMapper.selectByExample(example);
	}

	@Override
	public boolean deleteById(int staffSalaryId) throws Exception {
		
		return staffSalaryMapper.deleteByPrimaryKey(staffSalaryId) > 0;
	}

	@Override
	public StaffSalary findByName(int staffSalaryId) throws Exception {
		
		return staffSalaryMapper.selectByPrimaryKey(staffSalaryId);
	}

	@Override
	public boolean update(StaffSalary staffSalary) throws Exception {

		return staffSalaryMapper.updateByPrimaryKeySelective(staffSalary) > 0;
	}

	@Override
	
	public Page<StaffSalary>  getPage(int pageNum) throws Exception {
			
			Page<StaffSalary> page = null ;
			StaffSalaryExample example = new StaffSalaryExample();
			
			int totalRecord =staffSalaryMapper.countByExample(example);
			
			page = new Page<>(totalRecord, pageNum);
			
			List<StaffSalary> list =staffSalaryMapper.getStaffSalaryList(page);
			
			page.setList(list);
			
			return page;
		}
	

	
	
	
	




	
/*	

	@Override
	public boolean addClassroom(ClassroomInfo classroomInfo) throws Exception {

		return classroomInfoMapper.insert(classroomInfo) > 0;
	}

	@Override
	public List<ClassroomInfo> findByName(String classroomName) throws Exception {
		
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
	}*/
	
	
}
