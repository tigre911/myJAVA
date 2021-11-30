package com.our.arp.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.our.arp.admin.dao.AdminDao;
import com.our.arp.admin.vo.AdminVo;
import com.our.arp.member.dao.MemberDao;
import com.our.arp.member.vo.MemberVo;

@Service
public class AdminService {

	@Autowired
	AdminDao adminDao;
	
	public int loginConfirm(AdminVo adminVo) {
		System.out.println("[AdminService]:::::loginConfirm()");
		
		int result = adminDao.loginAdmin(adminVo);
		
		return result;
	}

	
	

}
