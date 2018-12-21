package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import Member.BorrowInfo;
import Member.Comment;

public class CommentDAOMSI extends DAOBase implements CommentDAO {

	private static final String insertCommentSQL="insert into Comment(UserId,ISBN,CommentContext,CommentTime) values(?,?,?,?)";
	@Override
	public void insertComment(Comment c) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertCommentSQL);
			
			pstm.setInt(1, c.getUserId());
			pstm.setString(2, c.getISBN());
			pstm.setString(3,c.getCommentContext());
			Timestamp d = new Timestamp(System.currentTimeMillis());
			pstm.setTimestamp(4, d);
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String updateCommentSQL="update Comment set UserId=?,ISBN=?,CommentContext=?,CommentTime=? where CommentId=?";
	@Override
	public void updateComment(Comment c) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateCommentSQL);
			pstm.setInt(1, c.getUserId());
			pstm.setString(2, c.getISBN());
			pstm.setString(3, c.getCommentContext());
			pstm.setTimestamp(4, c.getCommentTime());
			pstm.setInt(5, c.getCommentId());

			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}


	}
	private static final String deleteCommentSQL="delete from Comment where CommentId=";
	@Override
	public void deleteComment(int id) {
		Connection conn = null;
		Statement pstm = null;
		try{
			conn = getConnection();
			String str = deleteCommentSQL+id;
			pstm=conn.createStatement();
			
			pstm.executeUpdate(str);
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private static final String getCommentSQL1="select CommentId,UserId,ISBN,CommentContext,CommentTime from Comment where CommentId=";

	@Override
	public Comment getComment0(int id) {
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getCommentSQL1+id;
			rs=pstm.executeQuery(str);
			
			Comment temp = null;
			while(rs.next())
			{
				temp = new Comment(rs.getInt("CommentId"),rs.getInt("UserId"),rs.getString("ISBN"),rs.getString("CommentContext"),rs.getTimestamp("CommentTime"));
				
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
	private static final String getCommentSQL2="select CommentId,UserId,ISBN,CommentContext,CommentTime from Comment where UserId=";

	@Override
	public List<Comment> getComment(int uid) {
		
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getCommentSQL2+uid;
			rs=pstm.executeQuery(str);
			List<Comment> bl=new ArrayList<Comment>();
			Comment temp = null;
			while(rs.next())
			{
				temp = new Comment(rs.getInt("CommentId"),rs.getInt("UserId"),rs.getString("ISBN"),rs.getString("CommentContext"),rs.getTimestamp("CommentTime"));
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
	private static final String getCommentSQL="select CommentId,UserId,ISBN,CommentContext,CommentTime from Comment where UserId=? and ISBN=?";
	@Override
	public List<Comment> getComment(int uid, String bid) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(getCommentSQL);
			pstm.setInt(1, uid);
			pstm.setString(2, bid);

			rs=pstm.executeQuery();
			List<Comment> bl=new ArrayList<Comment>();
			Comment temp = null;
			while(rs.next())
			{
				temp = new Comment(rs.getInt("CommentId"),rs.getInt("UserId"),rs.getString("ISBN"),rs.getString("CommentContext"),rs.getTimestamp("CommentTime"));
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
