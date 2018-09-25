package com.guigu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.ClassInfo;
import com.guigu.pojo.ClassroomInfo;
import com.guigu.pojo.DisciplineInfo;
import com.guigu.pojo.RoleInfo;
import com.guigu.pojo.StaffInfo;
import com.guigu.pojo.SyllabusInfo;
import com.guigu.service.ClassService;
import com.guigu.service.ClassroomService;
import com.guigu.service.DisciplineService;
import com.guigu.service.SyllabusService;
import com.guigu.service.TeacherService;


@Controller
@RequestMapping("/ClassController")


public class ClassController {
	
		@Resource
		private TeacherService teacherService;
		
		
		@Resource
		private ClassroomService  classroomService ;
		
		
		@Resource
		private ClassService classService ;
		
		//学科注入
		@Resource		
		private DisciplineService disciplineService;
		
		//课程表注入
		@Resource
		private SyllabusService syllabusService;
		
		
		@RequestMapping("/listClass.action")
		public String listClass(HttpServletRequest request) throws Exception {
			List<ClassInfo> list = classService.findAll();
			request.setAttribute("ClassInfoList", list);
			return "/view/classinfo/classinfo/classinfo_list" ;
			
		}
		
		
		//调用其他表对象
		public void addOtherObjectTable(HttpServletRequest request) throws Exception {
			List<StaffInfo> list =teacherService.findAllByRoleId(7);
			request.setAttribute("TeacherInfoList", list);
			
			List<ClassroomInfo> list1 =classroomService.findAll();
			request.setAttribute("ClassroomInfoList", list1);
			
			List<DisciplineInfo> list2 = disciplineService.findAll();
			request.setAttribute("DisciplineInfoList", list2);
			
			List<SyllabusInfo> list3 = syllabusService.findAll();
			request.setAttribute("SyllabusInfoList", list3);
		}
		
		@RequestMapping("/addClass.action")
		public String addClass(HttpServletRequest request) throws Exception {
			addOtherObjectTable(request);
			
			return "view/classinfo/classinfo/classinfo_add" ;
			
		}
		
		
		
		@RequestMapping("/addClassInfo.action")
		public String addClassInfo(ClassInfo  classInfo ,HttpServletRequest request) throws Exception {
			
			
			boolean result = classService.addClass(classInfo);
			
			return "redirect:/ClassController/listClass.action" ;
		}
		
		
		@RequestMapping("/findByName.action")
		public String findByName(String className ,HttpServletRequest request) throws Exception {
			
			List<ClassInfo> list = classService.findByName(className);
			
			request.setAttribute("ClassInfoList", list);
			return "/view/classinfo/classinfo/classinfo_list" ;
			
		}
		
		//通过ID删除
		@RequestMapping("/deleteById.action")
		public String deleteById(int classId,HttpServletRequest request) throws Exception {
			boolean result = classService.deleteById(classId);
			
			return "redirect:/ClassController/listClass.action" ;
			
		}
		
		@RequestMapping("/updateUi.action")
		public String updateUi(int classId,HttpServletRequest request) throws Exception {
			ClassInfo classInfo = classService.findByName (classId);
			
			addOtherObjectTable(request);
			request.setAttribute("classInfo", classInfo);
			return "/view/classinfo/classinfo/classinfo_update" ;
			
		}
		
		//ClassController/addClass.action
		@RequestMapping("/update.action")
		public String update(ClassInfo classInfo,HttpServletRequest  request) throws Exception {
			boolean result = classService.updateByClassInfo(classInfo);
			return "redirect:/ClassController/listClass.action";
		}
		
}
