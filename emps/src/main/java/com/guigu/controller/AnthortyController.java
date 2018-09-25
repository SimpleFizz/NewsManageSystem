package com.guigu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.AnthortyDTO;
import com.guigu.pojo.AnthortyInfo;
import com.guigu.pojo.RoleAnthorityInfo;
import com.guigu.pojo.RoleInfo;
import com.guigu.service.AnthortyService;

@RequestMapping("/AnthortyController")
@Controller
public class AnthortyController {
	
	@Resource
	private AnthortyService  anthortyService;
	
	@RequestMapping("/listAnthorty.action")
	public String listAnthorty (HttpServletRequest  request) throws Exception {
		List<AnthortyInfo>  list = anthortyService.findAll();
		request.setAttribute("abthortyList", list);
		return "view/system/anthorty/anthorty_list";
	}
	
	
	@RequestMapping("/authortyChangeList.action")
	public String authortyChangeList(HttpServletRequest  request) throws Exception {
		//获得角色列表
		List<RoleInfo>  roleList = anthortyService.findAllRole();
		request.setAttribute("roleList", roleList);
	
		return "view/system/anthotychange/anthorty_changelist";
	}

	
	
	@RequestMapping("/getByRoleName.action")
	public String getByRoleName(String roleName,HttpServletRequest  request) throws Exception {
		//获得角色列表
		List<RoleInfo>  roleList = anthortyService.findAllRoleByName(roleName);
		request.setAttribute("roleList", roleList);
	
		return "view/system/anthotychange/anthorty_changelist";
	}
	
	@RequestMapping("/anthortyChangeUi.action")
	public String anthortyChangeUi(int  roleId,HttpServletRequest  request) throws Exception {
		//获得角色的信息
		RoleInfo  roleInfo = anthortyService.getRoleInfoById(roleId);
		
		request.setAttribute("roleInfo", roleInfo);
		
		//获得系统中所有的权限
		List<AnthortyInfo>  anthortyList = anthortyService.findAll();
		
		
		//获得该角色权限
		List<AnthortyInfo>  myRoleAnthortyList = anthortyService.getAnthortyInfoByRoleId(roleId);
		
		List<AnthortyDTO> dtolist = new ArrayList<AnthortyDTO>();

		for (AnthortyInfo anth : anthortyList) {

			if (anth!=null &&anth.getAnthortyPid() == 1) {
				AnthortyDTO dto = new AnthortyDTO();
				
				if(myRoleAnthortyList!=null && myRoleAnthortyList.size()>0){
					for(AnthortyInfo rainfo:myRoleAnthortyList){
						if(rainfo.getAnthortyId() == anth.getAnthortyId()){
							anth.setChecked(true);
						}
					}
				}
				// 一级菜单
				dto.setAnth(anth);
				// 子菜单
				List<AnthortyInfo> sublist = new ArrayList<AnthortyInfo>();
				getAnthorty(myRoleAnthortyList,sublist, anthortyList, anth.getAnthortyId());
				dto.setList(sublist);
				System.out.println(sublist.size());
				dtolist.add(dto);
			}
		}
		request.setAttribute("dtoList", dtolist);
		return "view/system/anthotychange/anthorty_change";
	}
	
	public void getAnthorty(List<AnthortyInfo> railist,List<AnthortyInfo> sublist,
			List<AnthortyInfo> list, Integer anthortyId) {

		if (list != null && list.size() > 0) {
			for (AnthortyInfo anth : list) {
				if (anth!=null && anth.getAnthortyPid()!=null && anth.getAnthortyPid().equals(anthortyId)) {
					if(railist!=null && railist.size()>0){
						for(AnthortyInfo rainfo:railist){
							if(rainfo.getAnthortyId() == anth.getAnthortyId()){
								anth.setChecked(true);
							}
						}
					}
					sublist.add(anth);
					getAnthorty(railist,sublist, list, anth.getAnthortyId());
				}
			}
		}

	}
	
	
	@RequestMapping("/anthortyChange.action")
	public String anthortyChange(int roleId,Integer[] anthortyId, HttpServletRequest  request) throws Exception {
		anthortyService.anthortyChange(roleId,anthortyId);
		return "redirect:/AnthortyController/authortyChangeList.action";
	}
	
	
	
	@RequestMapping("/anthortyById.action")
	public String anthortyById(int  anthortyId, HttpServletRequest  request) throws Exception {
		
		AnthortyInfo  anthortyInfo = anthortyService.getAnthortyInfoById(anthortyId);
		request.setAttribute("anthortyInfo",anthortyInfo);
		
		return "view/system/anthorty/anthorty_show";
	}
	
	
	
	
	
	@RequestMapping("/changeUi.action")
	public String changeUi(int  anthortyId, HttpServletRequest  request) throws Exception {
		
		AnthortyInfo  anthortyInfo = anthortyService.getAnthortyInfoById(anthortyId);
		request.setAttribute("anthortyInfo",anthortyInfo);
		
		//获得所有的权限：
		List<AnthortyInfo>  anthortyInfoList = anthortyService.getAllAnthortyInfoOne();
		request.setAttribute("anthortyInfoList",anthortyInfoList);
		
		return "view/system/anthorty/anthory_update";
	}
	
	
	
	
	@RequestMapping("/change.action")
	public String change(AnthortyInfo  anthortyInfo, HttpServletRequest  request) throws Exception {
		
		anthortyService.changeAnthortyById(anthortyInfo);
		
		return "view/system/anthorty/anthory_update";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
