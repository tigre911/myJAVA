package com.eud.air.reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eud.air.reservation.dao.ReservationDao;
import com.eud.air.reservation.vo.ReservationVo;

@Service
public class ReservationService {

	@Autowired
	ReservationDao reservationDao;
	
	public List<ReservationVo> reservationConfirm(ReservationVo reservationVo) {
		System.out.println("[ReservationService]::: reservationConfirm() INIT");
		
		int result = reservationDao.insertReservation(reservationVo);
		
		List<ReservationVo> reservationVos = null;
		if(result>0) {
			reservationVos = reservationDao.selectResrvationsByMail(reservationVo.getR_mail());
			
		}
		
		return reservationVos;
	}

	public List<ReservationVo> getReservations(String m_mail) {
		System.out.println("[ReservationService]::: getReservations() INIT");
		
		List<ReservationVo> reservationVos = reservationDao.selectResrvationsByMail(m_mail);
		
		return reservationVos;
	}

	public ReservationVo getReservation(int r_no) {
		System.out.println("[ReservationService]::: getReservation() INIT");
		
		ReservationVo reservationVo = reservationDao.selectResrvationsByNo(r_no);
		
		return reservationVo;
	}

	public int modifyReservation(ReservationVo reservationVo) {
		System.out.println("[ReservationService]::: modifyReservation() INIT");

		int result = reservationDao.updateReservation(reservationVo);
		
		return result;
	}

	public int cancelReservation(int r_no) {
		System.out.println("[ReservationService]::: cancelReservation() INIT");

		int result = reservationDao.deleteReservation(r_no);
		
		return result;
	}

	public List<ReservationVo> getReservations() {
		System.out.println("[ReservationService]::: getReservations() INIT");

		List<ReservationVo> reservationVos = reservationDao.selectReservations();
		
		return reservationVos;
	}

}
