package com.campus.myapp.dao;

import com.campus.myapp.vo.MemberVO;

public interface MemberDAO {

	//회원등록
	public int memberInsert(MemberVO vo);
	
	public MemberVO loginCheck(MemberVO vo);
	
	public MemberVO memberSelect(String userid);
	
	public int memberUpdate(MemberVO vo);
}
