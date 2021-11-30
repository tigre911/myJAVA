package com.eud.air.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eud.air.admin.dao.AdminDao;
import com.eud.air.admin.vo.AdminVo;

@Service
public class AdminService {

	@Autowired
	AdminDao adminDao;
	
	public int loginConfirm(AdminVo adminVo) {
		
		int result = adminDao.loginAdmin(adminVo);
		
		return result;
	}

}
