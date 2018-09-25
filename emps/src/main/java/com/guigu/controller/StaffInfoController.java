package com.guigu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.StaffInfo;
import com.guigu.service.StaffInfoService;

@RequestMapping("/StaffInfoController")
@Controller
public class StaffInfoController {
	
	@Resource
	private StaffInfoService  staffInfoService;
	
	
	@RequestMapping("/findAllStaff.action")
	public String findAllStaff(HttpServletRequest  request) throws Exception {
		List<StaffInfo>  list = staffInfoService.findAll();
		request.setAttribute("staffInfoList", list);
		return "view/system/staffinfo/staffinfo_list";
	}
	
	
	@RequestMapping("/staffinfoUpdateUi.action")
	public String staffinfoUpdateUi(int staffId,HttpServletRequest  request) throws Exception {
		StaffInfo  staffInfo = staffInfoService.findById(staffId);
		request.setAttribute("staffInfo", staffInfo);
		return "view/system/staffinfo/staffinfo_update";
	}
	
	
	@RequestMapping("/staffinfoUpdate.action")
	public String staffinfoUpdate(StaffInfo staffInfo,HttpServletRequest  request) throws Exception {
		boolean  result = staffInfoService.updateById(staffInfo);
		return "redirect:/StaffInfoController/findAllStaff.action";
	}
	
	
	@RequestMapping("/staffinfoAdd.action")
	public String staffinfoAdd(StaffInfo staffInfo,HttpServletRequest  request) throws Exception {
		System.out.println(staffInfo);
		boolean  result = staffInfoService.add(staffInfo);
		return "redirect:/StaffInfoController/findAllStaff.action";
	}
	
	
	@RequestMapping("/deleteStaffInfoById.action")
	public String deleteStaffInfoById(int staffId,HttpServletRequest  request) throws Exception {
		boolean  result = staffInfoService.deleteById(staffId);
		return "redirect:/StaffInfoController/findAllStaff.action";
	}
	
	
	

}
