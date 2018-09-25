package com.guigu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.AnthortyDTO;
import com.guigu.pojo.AnthortyInfo;
import com.guigu.pojo.StaffInfo;
import com.guigu.service.AnthortyService;
import com.guigu.service.StaffInfoService;

@RequestMapping("/LogController")
@Controller
public class LogController {
	
	@Resource
	private StaffInfoService  staffInfoService;
	@Resource
	private AnthortyService  anthortyService;
	
	@RequestMapping("/logIn.action")
	public String logIn(String userName,String passWord,HttpServletRequest  request) throws Exception {
		
		StaffInfo  staffInfo = staffInfoService.logIn(userName,passWord);
        List<AnthortyInfo>  anthlist = anthortyService.getAnthortyInfoByRoleId(staffInfo.getRoleId());
     // 构建菜单（一级和二级）
		List<AnthortyDTO> dtolist = new ArrayList<AnthortyDTO>();

		for (AnthortyInfo anth : anthlist) {

			if (anth != null && anth.getAnthortyPid() == 1) {
				AnthortyDTO dto = new AnthortyDTO();
				dto.setAnth(anth);

				// 子菜单
				List<AnthortyInfo> sublist = new ArrayList<AnthortyInfo>();
				getAnthorty(sublist, anthlist, anth.getAnthortyId());

				dto.setList(sublist);
				dtolist.add(dto);
			}
		}
		request.getSession().setAttribute("staffInfo", staffInfo);
		request.setAttribute("dtoList", dtolist);

		return "index";
	}
	
	public void getAnthorty(List<AnthortyInfo> sublist,
			List<AnthortyInfo> list, Integer anthortyId) {

		if (list != null && list.size() > 0) {
			for (AnthortyInfo anth : list) {
				if (anth != null && anth.getAnthortyPid() != null
						&& anth.getAnthortyPid().equals(anthortyId)) {
					sublist.add(anth);
					getAnthorty(sublist, list, anth.getAnthortyId());
				}
			}
		}

	}

}
