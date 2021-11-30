package com.our.arp.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.our.arp.member.service.MemberService;
import com.our.arp.member.vo.MemberVo;

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
	public String loginConfrim(MemberVo memberVo, HttpSession session, Model model) {
		System.out.println("[MemberController]:::::loginConfrim()");
		
		int result = memberService.loginConfirm(memberVo);
		
		model.addAttribute("m_mail", memberVo.getM_mail());
		
		if (result==0) {
			return "member/loginForm";
		}else {
		session.setAttribute("loginMember", memberVo.getM_mail());
		
		return "redirect:/";
		}
	}

	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		System.out.println("[MemberController]:::::joinForm()");
		
		
		
		return "member/joinForm";
	}
	
	@RequestMapping(value = "/joinConfirm", method = RequestMethod.POST)
	public String joinConFirm(MemberVo memberVo, Model model) {
		System.out.println("[MemberController]:::::joinConFirm()");
		
		memberService.joinConfirm(memberVo);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		System.out.println("[MemberController]:::::logout()");
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	
}
