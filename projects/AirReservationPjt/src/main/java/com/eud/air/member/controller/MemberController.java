package com.eud.air.member.controller;

import java.nio.channels.SeekableByteChannel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eud.air.member.dao.MemberDao;
import com.eud.air.member.service.MemberService;
import com.eud.air.member.vo.MemberVo;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	@Autowired
	MemberService memberService;

	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("[MemberController]:::::loginForm()");
		return "member/loginForm";
	}
	
	@RequestMapping(value = "/loginConfirm", method = RequestMethod.POST)
	public String loginConfirm(MemberVo memberVo, Model model, HttpServletRequest request) {
		System.out.println("[MemberController]:::::loginConfirm()");
		
		int result = memberService.loginConfirm(memberVo); //0 로그인 실패 , 1 로그인 성공
		
		model.addAttribute("m_mail", memberVo.getM_mail());
		
		if (result ==0) {
			return "member/loginFail";
		}else {
			
			HttpSession session = request.getSession();
			session.setAttribute("loginMember", memberVo.getM_mail());
			
			return "redirect:/";
		}
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	private String joinForm() {
		System.out.println("[MemberController]:::::joinForm()");
		
		return "member/joinForm";
	}

	@RequestMapping(value = "/joinConfirm", method = RequestMethod.POST)
	public String joinConfirm(MemberVo memberVo, Model model) {
		System.out.println("[MemberController]:::::joinConfirm()");
		
		int result = memberService.joinMember(memberVo);
		
		model.addAttribute("m_mail", memberVo.getM_mail());
		
		if (result == MemberDao.MEMBER_IS) {
			
			return "member/isOldMember";
		}else if(result == MemberDao.MEMBER_INSERT_SUCCESS){
			
			return "member/joinSuccess";
		}else {
			return "member/joinFail";
		}
		
		
	}
}
