package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Member.DetailedBookInfo;
import Member.Reader;

public class ReaderDAOMSI extends DAOBase implements ReaderDAO {

	private static final String insertReaderSQL="insert into Reader(UserName,Password,UserType,Email,BarCode,IDCard,Sex,Phone,BorrowTimes) values(?,?,?,?,?,?,?,?,?)";

	@Override
	public int insertReader(Reader temp) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertReaderSQL);
			
			pstm.setString(1,temp.getUserName());
			pstm.setString(2, temp.getPassword());
			pstm.setString(3,temp.getUserType());
			pstm.setString(4, temp.getEmail());
			pstm.setString(5, temp.getBarCode());
			pstm.setString(6, temp.getIDCard());
			pstm.setString(7, temp.getSex());
			pstm.setString(8, temp.getPhone());
			pstm.setInt(9, temp.getBorrowTimes());
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	private static final String updateReaderSQL="update Reader set UserName=?,Password=?,UserType=?,Email=?,BarCode=?,IDCard=?,Sex=?,Phone=?,BorrowTimes=? where UserId=?";

	@Override
	public int updateReader(Reader temp) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateReaderSQL);
			
			pstm.setString(1,temp.getUserName());
			pstm.setString(2, temp.getPassword());
			pstm.setString(3,temp.getUserType());
			pstm.setString(4, temp.getEmail());
			pstm.setString(5, temp.getBarCode());
			pstm.setString(6, temp.getIDCard());
			pstm.setString(7, temp.getSex());
			pstm.setString(8, temp.getPhone());
			pstm.setInt(9, temp.getBorrowTimes());
			pstm.setInt(10, temp.getUserId());
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}

		return -1;
	}
	
	private static final String getReaderSQL="select UserId,UserName,Password,UserType,Email,BarCode,IDCard,Sex,Phone,BorrowTimes from Reader where UserId=";

	@Override
	public Reader getReader(int id) {
		
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getReaderSQL+String.valueOf(id);
			rs=pstm.executeQuery(str);
			Reader temp = null;
			while(rs.next())
				temp = new Reader(rs.getInt("UserId"),rs.getString("UserName"),rs.getString("Password"),rs.getString("UserType"),rs.getString("Email"),rs.getString("BarCode"),rs.getString("IDCard"),rs.getString("Sex"),rs.getString("Phone"),rs.getInt("BorrowTimes"));
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	private static final String deleteReaderSQL="delete from Reader where UserId=";

	public int deleteReader(int id){
		Connection conn = null;
		Statement pstm = null;
		try{
			conn = getConnection();
			String str = deleteReaderSQL+id;
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
