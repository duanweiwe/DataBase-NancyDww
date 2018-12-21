package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Member.BookInfo;
import Member.BookType;

public class BookTypeDAOMSI extends DAOBase implements BookTypeDAO {

	private static final String getTypeSQL="select TypeId,TypeNO,TypeName from BookType where TypeId=";
	@Override
	public BookType getBookType(int id) {
		
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getTypeSQL+String.valueOf(id);
			rs=pstm.executeQuery(str);
			BookType temp = null;
			while(rs.next())
				temp = new BookType(rs.getInt("TypeId"),rs.getString("TypeNO"),rs.getString("TypeName"));
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	private static final String insertTypeSQL="insert into BookShelf(TypeNO,TypeName) values(?,?)";
	public void insertBookType(BookType bt) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertTypeSQL);
		
			pstm.setString(1,bt.getTypeNO());
			pstm.setString(2, bt.getTypeName());
		
			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	private static final String updateTypeSQL="update BookType set TypeNO=?,TypeName=? where TypeId=?";
	@Override
	public void updateBookType(BookType bt) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateTypeSQL);
			pstm.setString(1, bt.getTypeNO());
			pstm.setString(2, bt.getTypeName());
			pstm.setInt(3, bt.getTypeId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	private static final String deleteTypeSQL="delete from BookType where TypeId=";

	@Override
	public void deleteBookType(int bt) {
		Connection conn = null;
		Statement pstm = null;
		try{
			conn = getConnection();
			String str = deleteTypeSQL+String.valueOf(bt);
			pstm=conn.createStatement();
			
			pstm.executeUpdate(str);
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
