package DAO;
import Member.*;
import java.util.*;

public interface RoomDAO {
	public int insertRoom(Room m);
	public int updateRoom(Room m);
	public int deleteRoom(int id);
	public Room getRoom(int id);
	public List<Room> getRoom();

}
