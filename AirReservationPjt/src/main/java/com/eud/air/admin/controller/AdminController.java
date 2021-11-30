package com.eud.air.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.eud.air.admin.service.AdminService;
import com.eud.air.admin.vo.AdminVo;
import com.eud.air.member.service.MemberService;
import com.eud.air.member.vo.MemberVo;
import com.eud.air.reservation.service.ReservationService;
import com.eud.air.reservation.vo.ReservationVo;

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
		
		
		return "redirect:/adminHome/";
	}
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String adminHome() {
		System.out.println("[AdminController]:::::adminHome() Init");
		
		
		return "admin/loginForm";
	}
	
	
	@RequestMapping(value = "/loginConfirm", method = RequestMethod.POST)
	public String loginConfirm(AdminVo adminVo, HttpSession session) {
		System.out.println("[AdminController]:::::loginConfirm() Init");
		
		int result = adminService.loginConfirm(adminVo);
		
		if (result > 0) {
			System.out.println("login success-----------");
			session.setAttribute("admin", adminVo.getA_mail());
			return "redirect:/admin/";
			
		}else {
			System.out.println("login fail-----------");
			return "redirect:/admin/";
		}
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		System.out.println("[AdminController]:::::logout() Init");
		
		session.invalidate();
		
		return "redirect:/admin/";
	}

	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("[AdminController]:::::loginForm() Init");
		
		return "redirect:/admin/";
	}
	
	@RequestMapping(value = "/members", method = RequestMethod.GET)
	public String members(Model model) {
		System.out.println("[AdminController]:::::members() Init");
		
		List<MemberVo> memberVos = memberService.getMembers();
		model.addAttribute("memberVos", memberVos);
		
		return "admin/members";
	}
	
	@RequestMapping(value = "/reservations", method = RequestMethod.GET)
	public String reservations(Model model) {
		System.out.println("[AdminController]:::::reservations() Init");
		
		List<ReservationVo> reservationVos = reservationService.getReservations();
		model.addAttribute("reservationVos", reservationVos);
		
		return "admin/reservations";
	}
	
	@RequestMapping(value = "reservationModifyForm", method = RequestMethod.GET)
	public String reservationModifyForm(@RequestParam int r_no, Model model) {
		System.out.println("[AdminController]:::::reservations() Init");
		
		ReservationVo reservationVo = reservationService.getReservation(r_no);
		model.addAttribute("reservationVo", reservationVo);
		
		return "admin/reservationModifyForm";
	}

}
