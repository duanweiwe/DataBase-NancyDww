package DAO;
import Member.*;
import java.util.*;

public interface RoomDAO {
	public void insertRoom(Room m);
	public void updateRoom(Room m);
	public void deleteRoom(int id);
	public Room getRoom(int id);
	public List<Room> getRoom();

}
