package com.guigu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.ClassroomInfo;
import com.guigu.pojo.SyllabusInfo;
import com.guigu.service.SyllabusService;

@RequestMapping("/SyllabusController")
@Controller
public class SyllabusController {
	
	@Resource
	private SyllabusService  syllabusService;
	
	@RequestMapping("/findAllSyllabus.action")
	public String findAllSyllabus(HttpServletRequest  request) throws Exception {
		List<SyllabusInfo>  list = syllabusService.findAll();
		request.setAttribute("SyllabusInfoList", list);
		return "view/classinfo/syllabusinfo/syllabusinfo_list";
	}
	
	
	@RequestMapping("/addSyllabusInfo.action")
	public String addSyllabusInfo(SyllabusInfo syllabusInfo ,HttpServletRequest  request) throws Exception {
		boolean result = syllabusService.addSyllabus(syllabusInfo);
		
		return "redirect:/SyllabusController/findAllSyllabus.action";
	}
	
	//SyllabusController/findByName.action
	
	@RequestMapping("/findByName.action")
	public String findByName(String syllabusName ,HttpServletRequest request) throws Exception {
		
		List<SyllabusInfo> list = syllabusService.findByName(syllabusName);
		
		request.setAttribute("SyllabusInfoList", list);
		
		return "view/classinfo/syllabusinfo/syllabusinfo_list" ;
		
	}
		
	
	//通过ID删除 SyllabusController/deleteById.action?syllabusId
	@RequestMapping("/deleteById.action")
	public String deleteById(int syllabusId,HttpServletRequest request) throws Exception {
		boolean result = syllabusService.deleteById(syllabusId);
		
		return "redirect:/SyllabusController/findAllSyllabus.action" ;
		
	}
	
	// SyllabusController/updateUi.action?syllabusId
	
	@RequestMapping("/updateUi.action")
	public String updateUi(int syllabusId,HttpServletRequest request) throws Exception {
		SyllabusInfo syllabusInfo = syllabusService.findById (syllabusId);
		request.setAttribute("syllabusInfo", syllabusInfo);
		return "view/classinfo/syllabusinfo/syllabusinfo_update" ;
		
	}
	//SyllabusController/update.action
	@RequestMapping("/update.action")
	public String update(SyllabusInfo syllabusInfo,HttpServletRequest request) throws Exception {
		boolean result = syllabusService.update(syllabusInfo);
		
		return "redirect:/SyllabusController/findAllSyllabus.action" ;
		
	}
	
}
