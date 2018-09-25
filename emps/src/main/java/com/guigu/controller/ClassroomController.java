package com.guigu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.ClassroomInfo;
import com.guigu.pojo.RoleInfo;
import com.guigu.service.ClassroomService;

@Controller
@RequestMapping("/ClassroomController")
public class ClassroomController {
	
	@Resource
	private ClassroomService classroomService ;
	
	@RequestMapping("/listClassroom.action")
	public String listClassroom(HttpServletRequest request) throws Exception {
		List<ClassroomInfo> list = classroomService.findAll();
		request.setAttribute("ClassroomInfoList", list);
		
		return "view/classinfo/classroominfo/classroominfo_list" ;
		
	}
	
	
	
	@RequestMapping("/addClassroomInfo.action")
	public String addClassroomInfo(ClassroomInfo classroomInfo,HttpServletRequest request) throws Exception {
		boolean result = classroomService.addClassroom(classroomInfo);
		
		return "redirect:/ClassroomController/listClassroom.action" ;
		
	}
	
	@RequestMapping("/findByName.action")
	public String findByName(String classroomName ,HttpServletRequest request) throws Exception {
		
		List<ClassroomInfo> list = classroomService.findByName(classroomName);
		
		request.setAttribute("ClassroomInfoList", list);
		return "view/classinfo/classroominfo/classroominfo_list" ;
		
	}
	
	//通过ID删除
	@RequestMapping("/deleteById.action")
	public String deleteById(int classroomId,HttpServletRequest request) throws Exception {
		boolean result = classroomService.deleteById(classroomId);
		
		return "redirect:/ClassroomController/listClassroom.action" ;
		
	}
	
	
	@RequestMapping("/updateUi.action")
	public String updateUi(int classroomId,HttpServletRequest request) throws Exception {
		ClassroomInfo classroomInfo = classroomService.findByName (classroomId);
		request.setAttribute("classroomInfo", classroomInfo);
		return "view/classinfo/classroominfo/classroominfo_update" ;
		
	}
	
	
	@RequestMapping("/update.action")
	public String update(ClassroomInfo classroomInfo,HttpServletRequest request) throws Exception {
		boolean result = classroomService.update(classroomInfo);
		
		return "redirect:/ClassroomController/listClassroom.action" ;
		
		
	}
	

	
	
}
