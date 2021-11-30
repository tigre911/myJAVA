package com.our.arp.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.our.arp.admin.service.AdminService;
import com.our.arp.admin.vo.AdminVo;
import com.our.arp.member.service.MemberService;
import com.our.arp.member.vo.MemberVo;
import com.our.arp.reservation.service.ReservationService;
import com.our.arp.reservation.vo.ReservationVo;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	@Autowired
	MemberService memberService;
	@Autowired
	ReservationService reservationService;

	@RequestMapping(value = {""}, method = RequestMethod.GET)
	public String admin() {
		System.out.println("[AdminController]:::::admin() Init");
		
		return "redirect:/admin/";
	}
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String adminHome() {
		System.out.println("[AdminController]:::::adminHome() Init");
		
		return "admin/loginForm";
	}
	
	@RequestMapping(value = "/loginConfirm", method = RequestMethod.POST)
	public String loginConfirm(HttpSession session, AdminVo adminVo) {
		System.out.println("[AdminController]:::::loginConfirm() Init");
		
		adminService.loginConfirm(adminVo);
		
		session.setAttribute("admin", adminVo.getA_mail());
		
		return "redirect:/admin/";
	
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		System.out.println("[AdminController]:::::logout() Init");
		
		session.invalidate();
		
		return "redirect:/admin/";
	}
	
	@RequestMapping(value = "/members", method = RequestMethod.GET)
	public String showAllMembers(Model model) {
		System.out.println("[AdminController]:::::showAllMembers() Init");
		
		List<MemberVo> memberVos = memberService.showMembers();
		model.addAttribute("memberVos", memberVos);
		
		return "admin/members";
	}
	
	@RequestMapping(value = "/reservations", method = RequestMethod.GET)
	public String showAllReservations(Model model) {
		System.out.println("[AdminController]:::::showAllMembers() Init");
		
		List<ReservationVo> reservationVos = reservationService.getReservation();
		model.addAttribute("reservationVos", reservationVos);
		return "admin/reservations";
	}
	
}
