package com.our.arp.reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.our.arp.reservation.dao.ReservationDao;
import com.our.arp.reservation.vo.ReservationVo;
@Service
public class ReservationService {

	@Autowired
	ReservationDao reservationDao;
	
	public void reservationConfirm(ReservationVo reservationVo) {
		System.out.println("[ReservationService]:::::reservationConfirm()");
		
		reservationDao.insertReservation(reservationVo);
		
	}

	public List<ReservationVo> reservationList(String m_mail) {
		System.out.println("[ReservationService]:::::reservationList()");
		
		List<ReservationVo> reservationVos = reservationDao.selectResrvations(m_mail);
		
		return reservationVos;
	}

	public List<ReservationVo> getReservation() {
		System.out.println("[ReservationService]:::::getReservation()");
		
		List<ReservationVo> reservationVo = reservationDao.selectResrvationsByno();
		
		return reservationVo;
	}

	public ReservationVo modifyReservationForm(int r_no) {
		System.out.println("[ReservationService]:::::modifyReservationForm()");
		
		ReservationVo reservationVo = reservationDao.reservationByNo(r_no);
		
		return reservationVo;
	}

	public int modifyReservation(ReservationVo reservationVo) {
		System.out.println("[ReservationService]:::::modifyReservation()");
		
		int result = reservationDao.updateReservation(reservationVo);
		
		return result;
	}

	public int reservationCancel(int r_no) {
		System.out.println("[ReservationService]:::::modifyReservation()");
		
		int result = reservationDao.reservationCancel(r_no);
		
		return result;
	}

	

}
