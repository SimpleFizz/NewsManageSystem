package com.guigu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.StaffInfo;
import com.guigu.service.TeacherService;


@RequestMapping("/TeacherController")
@Controller
public class TeacherController {
	
	@Resource
	private TeacherService  teacherService;
	
	
	@RequestMapping("/findAllTeacher.action")
	public String findAllTeacher(HttpServletRequest  request) throws Exception {
		 final int roleId1=7;
		List<StaffInfo>  list = teacherService.findAllByRoleId(roleId1);
		request.setAttribute("TeacherInfoList", list);
		
		return "view/classinfo/teacher/teacher_list";
	}
	
	
	@RequestMapping("/staffinfoAdd.action")
	public String staffinfoAdd(StaffInfo staffInfo,HttpServletRequest  request) throws Exception {
		System.out.println(staffInfo);
		boolean  result = teacherService.add(staffInfo);

		return "redirect:/TeacherController/findAllTeacher.action";
		
	}
	
	//TeacherController/findByMethod.action?
	
	
	@RequestMapping("/findByMethod.action")
	public String findByMethod(String staffName, String staffSex,HttpServletRequest  request) throws Exception {
		
		
		List<StaffInfo> list=teacherService.findByNameOrSex(staffName,staffSex);
		
		request.setAttribute("TeacherInfoList", list);

		return "view/classinfo/teacher/teacher_list";
		
	}
	
	//StaffInfoController/deleteStaffInfoById.action
	@RequestMapping("/deleteStaffInfoById.action")
	public String deleteStaffInfoById(int staffId,HttpServletRequest  request) throws Exception {
		System.out.println(staffId);
		boolean  result = teacherService.deleteById(staffId);
		System.out.println(result);
		return "redirect:/TeacherController/findAllTeacher.action";
	}
	
	//TeacherController/staffinfoUpdateUi.action
	//TeacherController/staffinfoUpdateUi.action
	
	@RequestMapping("/staffinfoUpdateUi.action")
	public String staffinfoUpdateUi(int staffId,HttpServletRequest  request) throws Exception {
		
		System.out.println(staffId+"=========================================");
		StaffInfo  staffInfo = teacherService.findById(staffId);
		
		System.out.println(staffInfo);
		
		request.setAttribute("staffInfo", staffInfo);
		return "view/classinfo/teacher/teacher_update";
	}
	
	//TeacherController/staffinfoUpdate.action
	
	
	@RequestMapping("/staffinfoUpdate.action")
	public String staffinfoUpdate(StaffInfo staffInfo,HttpServletRequest  request) throws Exception {
		boolean  result = teacherService.updateById(staffInfo);
		return "redirect:/TeacherController/findAllTeacher.action";
	}
	

	

	


	
}
