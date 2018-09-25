package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.mapper.SyllabusInfoMapper;
import com.guigu.pojo.SyllabusInfo;
import com.guigu.pojo.SyllabusInfoExample;
import com.guigu.service.SyllabusService;

@Service
public class SyllabusServiceImpl implements SyllabusService {
	
	@Resource
	private SyllabusInfoMapper  syllabusInfoMapper;

	@Override
	public List<SyllabusInfo> findAll() throws Exception {
		return syllabusInfoMapper.selectByExample(new SyllabusInfoExample());
	}

	@Override
	public boolean addSyllabus(SyllabusInfo syllabusInfo) throws Exception {

		
		return syllabusInfoMapper.insert(syllabusInfo) > 0;
	}

	@Override
	public List<SyllabusInfo> findByName(String syllabusName) throws Exception {
		SyllabusInfoExample example = new SyllabusInfoExample();
		example.createCriteria().andSyllabusNameLike("%"+syllabusName+"%");
		
		return syllabusInfoMapper.selectByExample(example);
	}

	@Override
	public boolean deleteById(int syllabusId) throws Exception {

		return syllabusInfoMapper.deleteByPrimaryKey(syllabusId) > 0;
	}

	@Override
	public SyllabusInfo findById(int syllabusId) throws Exception {

		return syllabusInfoMapper.selectByPrimaryKey(syllabusId);
	}

	@Override
	public boolean update(SyllabusInfo syllabusInfo) throws Exception {
	
		
	return syllabusInfoMapper.updateByPrimaryKeySelective(syllabusInfo) > 0;
	
	}
	
	
	
}
