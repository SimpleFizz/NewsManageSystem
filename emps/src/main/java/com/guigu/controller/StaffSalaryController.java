package com.guigu.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.Page;
import com.guigu.pojo.StaffSalary;
import com.guigu.service.StaffSalaryService;



@Controller
@RequestMapping("/StaffSalaryController")
public class StaffSalaryController {
	
	@Resource
	private StaffSalaryService staffSalaryService ;
	
	@RequestMapping("/listStaffSalary.action")
	public String listStaffSalary(HttpServletRequest request) throws Exception {
		/*List<StaffSalary> list = staffSalaryService.findAll();
		request.setAttribute("StaffSalaryList", list);*/
		
		
	String pageNumStr = request.getParameter("pageNum");

		int pageNum = 0;
		if(pageNumStr == null) {
			pageNum = 1;
		}else {
			pageNum = Integer.parseInt(pageNumStr);
		}
		Page<StaffSalary>  page = staffSalaryService.getPage(pageNum);
			
		request.setAttribute("page", page);
		//请求转发
		
		
		
		return "view/financial/StaffSalary/staffSalary_list" ;
		
	}
	
	//StaffSalaryController/addStaffSalary.acton
	@RequestMapping("/addStaffSalary.action")
	public String addStaffSalary(StaffSalary staffSalary,HttpServletRequest request) throws Exception {
		boolean result = staffSalaryService.add(staffSalary);
		
		return "redirect:/StaffSalaryController/listStaffSalary.action" ;
		
	}
	
	//	StaffSalaryController/findByStaffId.action
		@RequestMapping("/findByStaffId.action")
		public String findByStaffId(int staffId ,HttpServletRequest request) throws Exception {
			
			List<StaffSalary> staffSalary = staffSalaryService.findByIdOfStaff(staffId);
			
			request.setAttribute("StaffSalaryList", staffSalary);
			return "view/financial/StaffSalary/staffSalary_list" ;
			
		}
		
		
		@RequestMapping("/deleteById.action")
		public String deleteById(int staffSalaryId,HttpServletRequest request) throws Exception {
			boolean result = staffSalaryService.deleteById(staffSalaryId);
			
			return "redirect:/StaffSalaryController/listStaffSalary.action" ;
			
		}
		
		@RequestMapping("/updateUi.action")
		public String updateUi(int staffSalaryId , HttpServletRequest request) throws Exception {
			StaffSalary staffSalary = staffSalaryService.findByName(staffSalaryId);
			request.setAttribute("staffSalary", staffSalary);
			
			return "view/financial/StaffSalary/staffSalary_update"  ;
			
		}
		
		@RequestMapping("/update.action")
		public String update(StaffSalary staffSalary,HttpServletRequest request) throws Exception {
			
			System.out.println(staffSalary);
			boolean  result  = staffSalaryService.update(staffSalary);
			
			return "redirect:/StaffSalaryController/listStaffSalary.action" ;
			
			
		}
		
		
		
		@RequestMapping("/countIncome.action")
		public void countIncome(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			String n1Str = request.getParameter("n1");
			String n2Str = request.getParameter("n2");

		
			
			response.setContentType("text/plain");
			int result = Integer.parseInt(n2Str)+Integer.parseInt(n1Str);
		
			
			PrintWriter writer =response.getWriter();
			writer.println(result);
			writer.flush();
		}
}

