package com.guigu.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.DisciplineInfo;
import com.guigu.service.DisciplineService;

@Controller
@RequestMapping("/DisciplineController")
public class DisciplineController {
	@Resource
	private DisciplineService disciplineService ;
	
	@RequestMapping("/findAlldiscipline.action")
	public String findAllDiscipline(HttpServletRequest request) throws Exception {
			List<DisciplineInfo> list =disciplineService.findAll();
			request.setAttribute("disciplineInfolist", list);
		
		return "view/classinfo/disciplineinfo/disciplineinfo_list";
		
	}
	
	
	@RequestMapping("/addDisciplineInfo.action")
	public String addDisciplineInfo(DisciplineInfo disciplineInfo, HttpServletRequest request) throws Exception {
			boolean result = disciplineService.addDiscipline(disciplineInfo);
			
		return "redirect:/DisciplineController/findAlldiscipline.action";
		
	}
	
	
	
	
	@RequestMapping("/findByName.action")
	public String findByName(String disciplineName,HttpServletRequest request) throws Exception {
			List<DisciplineInfo> list =disciplineService.findByName(disciplineName);
			request.setAttribute("disciplineInfolist", list);
		
		return "view/classinfo/disciplineinfo/disciplineinfo_list";
		
	}
	
	
	@RequestMapping("/deleteById.action")
	public String deleteById(int disciplineId , HttpServletRequest request) throws Exception {
			boolean result = disciplineService.deleteById(disciplineId);
			
		return "redirect:/DisciplineController/findAlldiscipline.action";
		
	}
	
	
	@RequestMapping("/updateUi.action")
	public String updateUi(int disciplineId , HttpServletRequest request) throws Exception {
		DisciplineInfo disciplineInfo = disciplineService.findById(disciplineId);
		
		request.setAttribute("disciplineInfo", disciplineInfo);
			
		return "view/classinfo/disciplineinfo/disciplineinfo_update";
		
	}
	
	//update.action
	
	@RequestMapping("/update.action")
	public String update(DisciplineInfo disciplineInfo,HttpServletRequest request) throws Exception {
			boolean result =disciplineService.updateById(disciplineInfo);
		
		return "redirect:/DisciplineController/findAlldiscipline.action";
		
	}
	
	
}
