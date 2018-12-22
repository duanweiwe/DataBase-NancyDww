package DAO;
import java.util.*;
import Member.*;

public interface ReservationDAO {
	public int insertReservation(Reservation r);
	public int updateReservation(Reservation r);
	public int deleteReservation(int id);
	public List<Reservation> getReservation(int uid,int bid);
	public Reservation getReservation(int id);

}
