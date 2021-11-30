package com.eud.air.admin.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.eud.air.admin.vo.AdminVo;

@Component
public class AdminDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int loginAdmin(AdminVo adminVo) {
		
int result = 0;
		
		String sql = "SELECT COUNT(*) FROM tbl_admin WHERE a_mail=? and a_pw=?";
		result = jdbcTemplate.queryForObject(sql, Integer.class, adminVo.getA_mail(), adminVo.getA_pw());
		
		System.out.println("result--------->" + result);
		
		return result;
	}

}
