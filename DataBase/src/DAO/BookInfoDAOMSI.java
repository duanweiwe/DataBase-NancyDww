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
	public int insertBookInfo(BookInfo book) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertBookSQL);
			
			pstm.setString(1, book.getISBN());
			pstm.setString(2, book.getBookName());
			pstm.setString(3,book.getShelfId());
			pstm.setString(4, book.getBookStatus());
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;
	}

	private static final String updateBookSQL="update BookInfo set ISBN=?,BookName=?,BookShelfId=?,BookStatus=? where BookId=?";
	@Override
	public int updateBookInfo(BookInfo book) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateBookSQL);
			pstm.setString(1, book.getISBN());
			pstm.setString(2, book.getBookName());
			pstm.setString(3, book.getShelfId());
			pstm.setString(4, book.getBookStatus());
			pstm.setInt(5, book.getBookId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	private static final String deleteBookSQL="delete from BookInfo where BookId=?";
	@Override
	public int deleteBookInfo(BookInfo book) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			
			pstm = conn.prepareStatement(deleteBookSQL);
			pstm.setInt(1,book.getBookId());
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
			return -1;
	}

	private static final String getBookSQL="select BookId,ISBN,BookName,BookShelfId,BookStatus from BookInfo where BookId=?";
	@Override
	public BookInfo getBookInfo(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(getBookSQL);
			pstm.setInt(1,id );
			rs=pstm.executeQuery();
			BookInfo temp = null;
			while(rs.next())
				temp = new BookInfo(rs.getInt("BookId"),rs.getString("ISBN"),rs.getString("BookName"),rs.getString("BookShelfId"),rs.getString("BookStatus"));
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}

	private static final String getBookSQL2="select BookId,ISBN,BookName,BookShelfId,BookStatus from BookInfo where BookName=?";

	@Override
	public BookInfo getBookInfo(String BookName) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(getBookSQL2);
			pstm.setString(1,BookName );
			
			rs=pstm.executeQuery();
			BookInfo temp = null;
			while(rs.next())
				temp = new BookInfo(rs.getInt("BookId"),rs.getString("ISBN"),rs.getString("BookName"),rs.getString("BookShelfId"),rs.getString("BookStatus"));
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
