package com.eud.air.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eud.air.member.dao.MemberDao;
import com.eud.air.member.vo.MemberVo;

@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;
	
	public int joinMember(MemberVo memberVo) {
		System.out.println("[MemberService]::: joinMember() INIT");
		
		if (memberDao.isMember(memberVo)) {
			return MemberDao.MEMBER_IS;		
		}else {
			return memberDao.insertMember(memberVo); 
			
		}
		
		
	}

	public int loginConfirm(MemberVo memberVo) {
		System.out.println("[MemberService]::: loginConfirm() INIT");
		int result = memberDao.loginMember(memberVo);
		
		return result;
	}

	public List<MemberVo> getMembers() {
		System.out.println("[MemberService]::: getMembers() INIT");
		List<MemberVo> memberVos = memberDao.selectMembers();
		
		return memberVos;
	}

	
}
