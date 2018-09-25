package com.guigu.service;

import java.util.List;

import com.guigu.pojo.SyllabusInfo;

public interface SyllabusService {

	List<SyllabusInfo> findAll() throws Exception;

	boolean addSyllabus(SyllabusInfo syllabusInfo) throws Exception;

	List<SyllabusInfo> findByName(String syllabusName) throws Exception;

	boolean deleteById(int syllabusId) throws Exception ;

	SyllabusInfo findById(int syllabusId) throws Exception ;

	boolean update(SyllabusInfo syllabusInfo) throws Exception ;

}
