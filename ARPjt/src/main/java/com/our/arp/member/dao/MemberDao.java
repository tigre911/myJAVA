package com.our.arp.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.our.arp.member.vo.MemberVo;
@Component
public class MemberDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int loginConfirm(MemberVo memberVo) {
		System.out.println("[MemberService]:::::loginConfirm()");
		
		int result= 0;
		String sql = "SELECT COUNT(*) FROM tbl_member WHERE m_mail=? and m_pw=?";
		
		result = jdbcTemplate.queryForObject(sql, Integer.class, memberVo.getM_mail(), memberVo.getM_pw());
		
		return result;
	}

	public void insertMember(MemberVo memberVo) {
		System.out.println("[MemberService]:::::insertMember()");
		String sql = "INSERT INTO tbl_member(m_mail, m_pw, m_reg_date, m_mod_date)"
				+ " VALUES(?,?,NOW(),NOW())";
		
		jdbcTemplate.update(sql, memberVo.getM_mail(), memberVo.getM_pw());
	}

	public List<MemberVo> showMembers() {
		System.out.println("[MemberService]:::::showMembers()");
		
		String sql = "SELECT * FROM tbl_member";
		List<MemberVo> memberVos = jdbcTemplate.query(sql, new RowMapper<MemberVo>() {

			@Override
			public MemberVo mapRow(ResultSet rs, int rowNum) throws SQLException {

				MemberVo memberVo = new MemberVo();
				memberVo.setM_no(rs.getInt("m_no"));
				memberVo.setM_mail(rs.getString("m_mail"));
				memberVo.setM_pw(rs.getString("m_pw"));
				memberVo.setM_reg_date(rs.getString("m_reg_date"));
				memberVo.setM_mod_date(rs.getString("m_mod_date"));
				
				return memberVo;
			}
			
		});
		
		return memberVos;
	}

	

}
