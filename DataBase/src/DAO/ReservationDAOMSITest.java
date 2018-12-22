package DAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Member.Reservation;

public class ReservationDAOMSITest {

	@Test
	public void testInsertReservation() {
		ReservationDAOMSI rd=new ReservationDAOMSI();
		Reservation r=new Reservation();
		r.setBookId(6);
		r.setUserId(5);
		assertEquals(1,rd.insertReservation(r));
	}
	@Test
	public void testUpdateReservation() {
		ReservationDAOMSI rd=new ReservationDAOMSI();
		Reservation r=rd.getReservation(1);
		r.setBookId(7);
		assertEquals(1,rd.updateReservation(r));
	}
	@Test
	public void testDeleteReservation() {
		ReservationDAOMSI rd=new ReservationDAOMSI();
		assertEquals(1,rd.deleteReservation(2));
	}
	@Test
	public void testGetReservationIntInt() {
		ReservationDAOMSI rd=new ReservationDAOMSI();
		assertEquals(1,rd.getReservation(1).getRId());
	}
	@Test
	public void testGetReservationInt() {
		ReservationDAOMSI rd=new ReservationDAOMSI();
		List<Reservation> lr=rd.getReservation(1, 7);
		Reservation r=lr.get(0);
		System.out.println(r.getRId()+" "+r.getUserId()+" "+r.getBookId()+" "+r.getReserveTime());
		assertEquals(1,lr.size());
	}

}
