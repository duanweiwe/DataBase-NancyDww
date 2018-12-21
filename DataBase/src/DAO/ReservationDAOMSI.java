package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

//import Member.Comment;
import Member.Reservation;

public class ReservationDAOMSI extends DAOBase implements ReservationDAO {
	private static final String insertReservationSQL="insert into Reservation(UserId,BookId,ReserveTime) values(?,?,?)";

	@Override
	public void insertReservation(Reservation r) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertReservationSQL);
			
			pstm.setInt(1, r.getUserId());
			pstm.setInt(2, r.getBookId());
			
			Timestamp d = new Timestamp(System.currentTimeMillis());
			pstm.setTimestamp(3, d);
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String updateReservationSQL="update Reservation set UserId=?,BookId=?,ReserveTime=? where RId=?";
	@Override
	public void updateReservation(Reservation r) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateReservationSQL);
			pstm.setInt(1, r.getUserId());
			pstm.setInt(2, r.getBookId());
			pstm.setTimestamp(3, r.getReserveTime());
			pstm.setInt(4, r.getRId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String deleteReservationSQL="delete from Reservation where RId=";

	@Override
	public void deleteReservation(int id) {
		Connection conn = null;
		Statement pstm = null;
		try{
			conn = getConnection();
			String str = deleteReservationSQL+id;
			pstm=conn.createStatement();
			
			pstm.executeUpdate(str);
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String getReservationSQL="select RId,UserId,BookId,ReserveTime from Reservation where RId=";
	private static final String getReservationSQL2="select RId,UserId,BookId,ReserveTime from Reservation where UserId=? and BookId=?";

	@Override
	public List<Reservation> getReservation(int uid, int bid) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(getReservationSQL2);
			pstm.setInt(1, uid);
			pstm.setInt(2, bid);

			rs=pstm.executeQuery();
			List<Reservation> bl=new ArrayList<Reservation>();
			Reservation temp = null;
			while(rs.next())
			{
				temp = new Reservation(rs.getInt("RId"),rs.getInt("UserId"),rs.getInt("BookId"),rs.getTimestamp("ReserveTime"));
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
	
	

	@Override
	public Reservation getReservation(int id) {
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getReservationSQL+id;
			rs=pstm.executeQuery(str);
			
			Reservation temp = null;
			while(rs.next())
			{
				temp = new Reservation(rs.getInt("RId"),rs.getInt("UserId"),rs.getInt("BookId"),rs.getTimestamp("ReserveTime"));
				
			}
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
