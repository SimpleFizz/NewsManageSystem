package com.guigu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.RoleInfo;
import com.guigu.pojo.StaffInfo;
import com.guigu.service.RoleService;

@Controller
@RequestMapping("/RoleController")
public class RoleController {
	
	@Resource
	private RoleService roleService;
	
	@RequestMapping("/listRole.action")
	public String listRole(HttpServletRequest  request) throws Exception {
		List<RoleInfo>  list = roleService.findAll();
		request.setAttribute("roleInfoList", list);
		return "view/system/roleinfo/roleinfo_list";
		
	}
	
	

	
	
	@RequestMapping("/addRoleInfo.action")
	public String addRoleInfo(RoleInfo roleInfo,HttpServletRequest  request) throws Exception {
		
		boolean result = roleService.addRole(roleInfo);
		
		
		return "redirect:/RoleController/listRole.action";
		
	}
	
	
	@RequestMapping("/deleteById.action")
	public String deleteById(int roleId,HttpServletRequest  request) throws Exception {
		
		boolean result = roleService.deleteById(roleId);
		
		return "redirect:/RoleController/listRole.action";
		
	}
	
	
	@RequestMapping("/findByName.action")
	public String findByName(String roleName,HttpServletRequest  request) throws Exception {
		List<RoleInfo>  list = roleService.findByName(roleName);
		request.setAttribute("roleInfoList", list);
		return "view/system/roleinfo/roleinfo_list";
		
	}
	
	
	@RequestMapping("/updateUi.action")
	public String updateUi(int  roleId,HttpServletRequest  request) throws Exception {
		RoleInfo roleInfo = roleService.findById(roleId);
		request.setAttribute("roleInfo", roleInfo);
		return "view/system/roleinfo/roleinfo_update";
		
	}
	
	
	@RequestMapping("/update.action")
	public String update(RoleInfo roleInfo,HttpServletRequest  request) throws Exception {
		boolean result = roleService.updateById(roleInfo);
		return "redirect:/RoleController/listRole.action";
		
	}
	
	
	
	@RequestMapping("/findRoleUserList.action")
	public String findRoleUserList(HttpServletRequest  request) throws Exception {
		List<StaffInfo>  list = roleService.findStaffRoleList();
		request.setAttribute("staffInfoList", list);
		return "view/system/roleinfo/staffinfo_role_list";
		
	}
	
	
	@RequestMapping("/findByMethod.action")
	public String findByMethod(String staffName,String staffSex ,HttpServletRequest  request) throws Exception {
		List<StaffInfo>  list = roleService.findByNameOrSex(staffName,staffSex);
		request.setAttribute("staffInfoList", list);
		return "view/system/roleinfo/staffinfo_role_list";
		
	}
	
	@RequestMapping("/getStaffRoleInfo.action")
	public String getStaffRoleInfo(int staffId,HttpServletRequest  request) throws Exception {
		StaffInfo  staffInfo = roleService.findByStaffId(staffId);
		request.setAttribute("staffInfo", staffInfo);
		
		List<RoleInfo>  roleInfoList = roleService.findAll();
		request.setAttribute("roleInfoList", roleInfoList);
		return "view/system/roleinfo/role_change";
		
	}
	
	
	@RequestMapping("/updateStaffRole.action")
	public String updateStaffRole(StaffInfo staffInfo ,HttpServletRequest  request) throws Exception {
		boolean result = roleService.updateStaffRole(staffInfo);
		return "redirect:/RoleController/findRoleUserList.action";
		
	}
	
	
	
	
	
	
	
	
	
	
}
