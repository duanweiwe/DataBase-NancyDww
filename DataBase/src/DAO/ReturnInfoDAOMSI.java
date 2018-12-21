package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

import Member.Reservation;
import Member.ReturnInfo;

public class ReturnInfoDAOMSI extends DAOBase implements ReturnInfoDAO {
	private static final String insertReturnSQL="insert into ReturnInfo(UserId,BookId,ReturnTime) values(?,?,?)";

	@Override
	public void insertReturnInfo(ReturnInfo ri) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertReturnSQL);
			
			pstm.setInt(1, ri.getUserId());
			pstm.setInt(2, ri.getBookId());
			java.util.Date utilDate = new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			pstm.setDate(3,sqlDate);
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String updateReturnSQL="update ReturnInfo set UserId=?,BookId=?,ReturnTime=? where Id=?";

	@Override
	public void updateReturnInfo(ReturnInfo ri) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateReturnSQL);
			pstm.setInt(1, ri.getUserId());
			pstm.setInt(2, ri.getBookId());
			pstm.setDate(3, ri.getReturnTime());
			pstm.setInt(4, ri.getId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String deleteReturnSQL="delete from ReturnInfo where Id=";
	@Override
	public void deleteReturnInfo(int id) {
		Connection conn = null;
		Statement pstm = null;
		try{
			conn = getConnection();
			String str = deleteReturnSQL+id;
			pstm=conn.createStatement();
			
			pstm.executeUpdate(str);
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String getReturnSQL="select Id,UserId,BookId,ReturnTime from ReturnInfo where Id=";

	@Override
	public ReturnInfo getReturnInfo(int id) {
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getReturnSQL+id;
			rs=pstm.executeQuery(str);
			
			ReturnInfo temp = null;
			while(rs.next())
			{
				temp = new ReturnInfo(rs.getInt("Id"),rs.getInt("UserId"),rs.getInt("BookId"),rs.getDate("ReturnTime"));
				
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
