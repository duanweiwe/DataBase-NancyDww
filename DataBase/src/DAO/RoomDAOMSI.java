package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Member.BookShelf;
import Member.BorrowInfo;
import Member.Room;

public class RoomDAOMSI extends DAOBase implements RoomDAO {
	
	private static final String insertRoomSQL="insert into Room(RoomNo,RoomName,RoomLocation,RoomCapacity) values(?,?,?,?)";

	@Override
	public int insertRoom(Room m) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertRoomSQL);
			
			pstm.setString(1, m.getRoomNo());
			pstm.setString(2, m.getRoomName());
			
			pstm.setString(3, m.getRoomLocation());
			pstm.setInt(4, m.getRoomCapacity());

			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	private static final String updateRoomSQL="update Room set RoomNo=?,RoomName=?,RoomLocation=?,RoomCapacity=? where RoomId=?";

	@Override
	public int updateRoom(Room m) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateRoomSQL);
			pstm.setString(1, m.getRoomNo());
			pstm.setString(2, m.getRoomName());
			pstm.setString(3,m.getRoomLocation());
			pstm.setInt(4, m.getRoomCapacity());
			pstm.setInt(5, m.getRoomId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	private static final String deleteRoomSQL="delete from Room where RoomId=?";
	@Override
	public int deleteRoom(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm=conn.prepareStatement(deleteRoomSQL);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	private static final String getRoomSQL="select RoomId,RoomNo,RoomName,RoomLocation,RoomCapacity from Room where RoomId=?";

	@Override
	public Room getRoom(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.prepareStatement(getRoomSQL);
			pstm.setInt(1, id);
			rs=pstm.executeQuery();
			Room temp = null;
			while(rs.next())
				temp = new Room(rs.getInt("RoomId"),rs.getString("RoomNo"),rs.getString("RoomName"),rs.getString("RoomLocation"),rs.getInt("RoomCapacity"));
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	private static final String getRoomSQL2="select RoomId,RoomNo,RoomName,RoomLocation,RoomCapacity from Room";

	@Override
	public List<Room> getRoom() {
		
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			List<Room> bl=new ArrayList<Room>();

			rs=pstm.executeQuery(getRoomSQL2);
			Room temp = null;
			while(rs.next()){
				temp = new Room(rs.getInt("RoomId"),rs.getString("RoomNo"),rs.getString("RoomName"),rs.getString("RoomLocation"),rs.getInt("RoomCapacity"));
				bl.add(temp);
			}
			rs.close();
			pstm.close();
			conn.close();
			return bl;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
