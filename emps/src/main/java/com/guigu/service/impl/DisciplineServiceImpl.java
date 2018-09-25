package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.mapper.DisciplineInfoMapper;
import com.guigu.pojo.DisciplineInfo;
import com.guigu.pojo.DisciplineInfoExample;
import com.guigu.pojo.RoleInfoExample;
import com.guigu.service.DisciplineService;

@Service
public class DisciplineServiceImpl implements DisciplineService {
	
	@Resource
	private DisciplineInfoMapper disciplineInfoMapper ;

	@Override
	public  List<DisciplineInfo> findAll() throws Exception {
		
		return disciplineInfoMapper.selectByExample(new DisciplineInfoExample());
	}

	@Override
	public boolean addDiscipline(DisciplineInfo disciplineInfo) throws Exception {
		
		
		return disciplineInfoMapper.insert(disciplineInfo) > 0 ;
	}

	@Override
	public List<DisciplineInfo> findByName(String disciplineName) throws Exception {
		DisciplineInfoExample example = new DisciplineInfoExample();
		
		example.createCriteria().andDisciplineNameLike("%"+disciplineName+"%");
		
		
		return disciplineInfoMapper.selectByExample(example);
	}

	@Override
	public boolean deleteById(int disciplineId) throws Exception {

		return disciplineInfoMapper.deleteByPrimaryKey(disciplineId) > 0;
	}

	@Override
	public DisciplineInfo findById(int disciplineId) throws Exception {
		
		
		return disciplineInfoMapper.selectByPrimaryKey(disciplineId);
	}

	@Override
	public boolean updateById(DisciplineInfo disciplineInfo) throws Exception {

		return disciplineInfoMapper.updateByPrimaryKeySelective(disciplineInfo) > 0;
	}

	}


