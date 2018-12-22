package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Member.BookInfo;
import Member.BookShelf;

public class BookShelfDAOMSI extends DAOBase implements BookShelfDAO {

	private static final String getShelfSQL="select ShelfId,ShelfNo,ShelfName,Capacity,Location,RoomId from BookShelf where ShelfNo=?";
	@Override
	public BookShelf getBookShelf(String No) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(getShelfSQL);
			pstm.setString(1, No);
			rs=pstm.executeQuery();
			BookShelf temp = null;
			while(rs.next())
				temp = new BookShelf(rs.getInt("ShelfId"),rs.getString("ShelfNo"),rs.getString("ShelfName"),rs.getInt("Capacity"),rs.getString("Location"),rs.getInt("RoomId"));
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	private static final String insertShelfSQL="insert into BookShelf(ShelfNo,ShelfName,Capacity,Location,RoomId) values(?,?,?,?,?)";
	@Override
	public int insertBookShelf(BookShelf bs) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertShelfSQL);
			
			pstm.setString(1, bs.getShelfNo());
			pstm.setString(2, bs.getShelfName());
			pstm.setInt(3,bs.getCapacity());
			pstm.setString(4, bs.getLocation());
			pstm.setInt(5, bs.getRoomId());
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	private static final String updateShelfSQL="update BookShelf set ShelfNo=?,ShelfName=?,Capacity=?,Location=?,RoomId=? where ShelfId=?";

	@Override
	public int updateBookShelf(BookShelf bs) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateShelfSQL);
			pstm.setString(1, bs.getShelfNo());
			pstm.setString(2, bs.getShelfName());
			pstm.setInt(3,bs.getCapacity());
			pstm.setString(4, bs.getLocation());
			pstm.setInt(5, bs.getRoomId());
			pstm.setInt(6, bs.getId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	
	private static final String deleteShelfSQL="delete from BookShelf where ShelfId=";

	@Override
	public int deleteBookShelf(int bs) {
		Connection conn = null;
		Statement pstm = null;
		try{
			conn = getConnection();
			String str = deleteShelfSQL+String.valueOf(bs);
			pstm=conn.createStatement();
			
			pstm.executeUpdate(str);
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}

}
