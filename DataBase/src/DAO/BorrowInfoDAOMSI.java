package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Member.BookInfo;
import Member.BorrowInfo;

import java.util.*;
public class BorrowInfoDAOMSI extends DAOBase implements BorrowInfoDAO {

	private static final String insertBorrowInfoSQL="insert into BorrowInfo(BookId,UserId,BorrowTime) values(?,?,?)";
	@Override
	public int insertBorrowInfo(BorrowInfo bi) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertBorrowInfoSQL);
			java.util.Date utilDate = new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			pstm.setInt(1, bi.getBookId());
			pstm.setInt(2, bi.getUserId());
			pstm.setDate(3,sqlDate);
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;
		

	}

	private static final String updateBorrowSQL="update BorrowInfo set BookId=?,UserId=?,BorrowTime=? where Id=?";

	@Override
	public int updateBorrowInfo(BorrowInfo bi) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateBorrowSQL);
			pstm.setInt(1, bi.getBookId());
			pstm.setInt(2, bi.getUserId());
			pstm.setDate(3, bi.getBorrowTime());
			pstm.setInt(4,bi.getId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	private static final String deleteBorrowSQL="delete from BorrowInfo where Id=?";

	@Override
	public int deleteBorrowInfo(int bi) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			
			pstm = conn.prepareStatement(deleteBorrowSQL);
			pstm.setInt(1, bi);

			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;
		

	}
	private static final String getBorrowSQL="select Id,BookId,UserId,BorrowTime from BorrowInfo where UserId=?";

	@Override
	public List<BorrowInfo> getBorrowInfo(int userId) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(getBorrowSQL);
			pstm.setInt(1, userId);
			rs=pstm.executeQuery();
			List<BorrowInfo> bl=new ArrayList<BorrowInfo>();
			BorrowInfo temp = null;
			while(rs.next())
			{
				temp = new BorrowInfo(rs.getInt("Id"),rs.getInt("BookId"),rs.getInt("UserId"),rs.getDate("BorrowTime"));
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

	private static final String getBorrowSQL2="select Id,BookId,UserId,BorrowTime from BorrowInfo where Id=?";

	@Override
	public BorrowInfo getBorrowInfo2(int bid) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(getBorrowSQL2);
			pstm.setInt(1, bid);
			rs=pstm.executeQuery();
			
			BorrowInfo temp = null;
			while(rs.next())
			{
				temp = new BorrowInfo(rs.getInt("Id"),rs.getInt("BookId"),rs.getInt("UserId"),rs.getDate("BorrowTime"));
			}
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
