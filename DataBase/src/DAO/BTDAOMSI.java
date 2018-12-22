package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Member.BT;


import java.util.*;
public class BTDAOMSI extends DAOBase implements BTDAO {

	private static final String insertBTSQL="insert into BT(TypeId,BookId) values(?,?)";

	@Override
	public int insertBT(BT bt) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertBTSQL);
			
			pstm.setInt(1, bt.getTypeId());
			pstm.setInt(2, bt.getBookId());
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	private static final String updateBTSQL="update BT set TypeId=?,BookId=? where Id=?";

	@Override
	public int updateBT(BT bt) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateBTSQL);
			pstm.setInt(1, bt.getTypeId());
			pstm.setInt(2, bt.getBookId());
			pstm.setInt(3, bt.getId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;


	}
	private static final String deleteBTSQL="delete from BT where Id=?";
	@Override
	public int deleteBT(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			
			pstm = conn.prepareStatement(deleteBTSQL);
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
	private static final String getBTSQL="select Id,TypeId,BookId from BT where BookId=?";
	@Override
	public List<BT> getBT(int bid) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(getBTSQL);
			pstm.setInt(1, bid);
			rs=pstm.executeQuery();
			List<BT> bl=new ArrayList<BT>();
			BT temp = null;
			while(rs.next())
			{
				temp = new BT(rs.getInt("Id"),rs.getInt("TypeId"),rs.getInt("BookId"));
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
	private static final String getBTSQL2="select Id,TypeId,BookId from BT where TypeId=?";
	@Override
	public List<BT> getBT2(int Tid) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(getBTSQL2);
			pstm.setInt(1, Tid);
			rs=pstm.executeQuery();
			List<BT> bl=new ArrayList<BT>();
			BT temp = null;
			while(rs.next())
			{
				temp = new BT(rs.getInt("Id"),rs.getInt("TypeId"),rs.getInt("BookId"));
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
