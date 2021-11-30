package com.our.arp.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.our.arp.member.dao.MemberDao;
import com.our.arp.member.vo.MemberVo;

@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;
	
	public int loginConfirm(MemberVo memberVo) {
		System.out.println("[MemberService]:::::loginConfirm()")
		;
		int result = memberDao.loginConfirm(memberVo);
		
		return result;
		
	}

	public void joinConfirm(MemberVo memberVo) {
		System.out.println("[MemberService]:::::joinConfirm()");
		

		memberDao.insertMember(memberVo);
		
	}

	public List<MemberVo> showMembers() {
		System.out.println("[MemberService]:::::showMembers()");
		
		List<MemberVo> memberVos = memberDao.showMembers();
		
		return memberVos;
	}


}
