package DAO;
import java.util.*;
import Member.*;

public interface ReservationDAO {
	public void insertReservation(Reservation r);
	public void updateReservation(Reservation r);
	public void deleteReservation(int id);
	public List<Reservation> getReservation(int uid,int bid);
	public Reservation getReservation(int id);

}
