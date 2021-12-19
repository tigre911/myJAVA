package com.eud.air.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.eud.air.member.vo.MemberVo;

@Component
public class MemberDao {
	
	public final static int MEMBER_IS =1;
	public final static int MEMBER_IS_NOT =0;
	public final static int MEMBER_INSERT_SUCCESS = 2;
	public final static int MEMBER_INSERT_FAIL = 3;
	 
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int insertMember(MemberVo memberVo) {
		System.out.println("[MemberDao]::: insertMember() INIT");
		
		String sql = "INSERT INTO tbl_member(m_mail, m_pw, m_reg_date, m_mod_date)"
				+ " VALUES(?,?,NOW(),NOW())";
		
		int result = jdbcTemplate.update(sql, memberVo.getM_mail(), memberVo.getM_pw());
		
		if (result>0) {
			return MEMBER_INSERT_SUCCESS;
			
		}else {
			return MEMBER_INSERT_FAIL;
		}
		
	}

	public boolean isMember(MemberVo memberVo) {
		System.out.println("[MemberDao]::: isMember() INIT");
		
		int result = 0;
		
		String sql = "SELECT COUNT(*) FROM tbl_member WHERE m_mail = ?";
		result = jdbcTemplate.queryForObject(sql, Integer.class, memberVo.getM_mail());
		
		return result > 0? true : false ;
		
//		if (result>0) {
//			return true;
//		}else {
//			return false;
//		}
		
	}

	public int loginMember(MemberVo memberVo) {
		System.out.println("[MemberDao]::: loginMember() INIT");
		int result = 0;
		
		String sql = "SELECT COUNT(*) FROM tbl_member WHERE m_mail=? and m_pw=?";
		result = jdbcTemplate.queryForObject(sql, Integer.class, memberVo.getM_mail(), memberVo.getM_pw());
		
		return result;
	}

	public List<MemberVo> selectMembers() {
		System.out.println("[MemberDao]::: selectMembers() INIT");
		
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
