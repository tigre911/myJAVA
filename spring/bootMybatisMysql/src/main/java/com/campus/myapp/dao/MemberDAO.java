package com.campus.myapp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.campus.myapp.vo.MemberVO;

@Mapper
@Repository
public interface MemberDAO {
	public MemberVO login(MemberVO vo);
}
