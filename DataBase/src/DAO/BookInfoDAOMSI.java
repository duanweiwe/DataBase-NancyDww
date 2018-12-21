package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import Member.*;
import Member.BookInfo;

public class BookInfoDAOMSI extends DAOBase implements BookInfoDAO {

	private static final String insertBookSQL="insert into BookInfo(ISBN,BookName,BookShelfId,BookStatus) values(?,?,?,?)";
	@Override
	public void insertBookInfo(BookInfo book) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertBookSQL);
			
			pstm.setString(1, book.getISBN());
			pstm.setString(2, book.getBookName());
			pstm.setInt(3,book.getShelfId());
			pstm.setString(4, book.getBookStatus());
			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static final String updateBookSQL="update BookInfo set ISBN=?,BookName=?,BookShelfId=?,BookStatus=? where BookId=?";
	@Override
	public void updateBookInfo(BookInfo book) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateBookSQL);
			pstm.setString(1, book.getISBN());
			pstm.setString(2, book.getBookName());
			pstm.setString(3, book.getBookStatus());
			pstm.setInt(4, book.getShelfId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String deleteBookSQL="delete from BookInfo where BookId=";
	@Override
	public void deleteBookInfo(BookInfo book) {
		Connection conn = null;
		Statement pstm = null;
		try{
			conn = getConnection();
			String str = deleteBookSQL+String.valueOf(book.getBookId());
			pstm=conn.createStatement();
			
			pstm.executeUpdate(str);
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	private static final String getBookSQL="select BookId,ISBN,BookName,BookShelfId from BookInfo where BookId=";
	@Override
	public BookInfo getBookInfo(int id) {
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getBookSQL+String.valueOf(id);
			rs=pstm.executeQuery(str);
			BookInfo temp = null;
			while(rs.next())
				temp = new BookInfo(rs.getInt("BookId"),rs.getString("ISBN"),rs.getString("BookName"),rs.getInt("BookShelfId"),rs.getString("BookStatus"));
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}

	private static final String getBookSQL2="select BookId,ISBN,BookName,BookShelfId,BookStatus from BookInfo where BookName=";

	@Override
	public BookInfo getBookInfo(String BookName) {
		
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getBookSQL2+BookName;
			rs=pstm.executeQuery(str);
			BookInfo temp = null;
			while(rs.next())
				temp = new BookInfo(rs.getInt("BookId"),rs.getString("ISBN"),rs.getString("BookName"),rs.getInt("BookShelfId"),rs.getString("BookStatus"));
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
