package com.our.arp.reservation.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.our.arp.member.vo.MemberVo;
import com.our.arp.reservation.service.ReservationService;
import com.our.arp.reservation.vo.ReservationVo;
@Controller

@RequestMapping(value = "/reservation")
public class ReservationController {

	@Autowired
	ReservationService reservationService;
	
	@RequestMapping(value = "/reservationForm", method = RequestMethod.GET)
	public String reservationForm() {
		System.out.println("[MemberController]:::::reservationForm()");
		
		return "/reservation/reservationForm";
	}
	
	@RequestMapping(value = "/reservationConfirm", method = RequestMethod.POST)
	public String reservationConfirm(ReservationVo reservationVo) {
		System.out.println("[MemberController]:::::reservationConfirm()");
		
		reservationService.reservationConfirm(reservationVo);
		
		return "redirect:/reservation/reservationList";
	}
	
	@RequestMapping(value = "/reservationList", method = RequestMethod.GET)
	public String reservationList(HttpSession session, Model model) {
		System.out.println("[MemberController]:::::reservationList()");
		
		String m_mail = String.valueOf(session.getAttribute("loginMember"));
		
		List<ReservationVo> reservationVos = reservationService.reservationList(m_mail);
		
		model.addAttribute("reservationVos", reservationVos);
		
		return "/reservation/reservationList";
	}
	
	@RequestMapping(value = "/reservationModifyForm", method = RequestMethod.GET)
	public String reservationModifyForm(@RequestParam int r_no, Model model) {
		System.out.println("[MemberController]:::::reservationModifyForm()");
		
		ReservationVo reservationVo = reservationService.modifyReservationForm(r_no);
		model.addAttribute("reservationVo", reservationVo);
		
		return "/reservation/reservationModifyForm";
	}
	
	@RequestMapping(value = "/reservationModifyConfirm", method = RequestMethod.POST)
	public String resertvationModifyConfirm(ReservationVo reservationVo, Model model) {
		System.out.println("[ReservationController]::: resertvationModifyConfirm() INIT");
		
		int result= reservationService.modifyReservation(reservationVo);
		model.addAttribute("reservationVo", reservationVo);
		
		return "redirect:/reservation/reservationList";
	}
	
	@RequestMapping(value = "/reservationCancel", method = RequestMethod.GET)
	public String reservationCancel(@RequestParam int r_no) {
		System.out.println("[ReservationController]::: reservationCancel() INIT");
		System.out.println("r_no --------->"+ r_no);
		int result = reservationService.reservationCancel(r_no);
		 
		return "redirect:/reservation/reservationList";
	}
	
}
