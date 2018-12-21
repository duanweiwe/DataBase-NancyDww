package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Member.*;

public class DetailedBookInfoDAOMSI extends DAOBase implements DetailedBookInfoDAO {

	private static final String insertDetailSQL="insert into DetailedBookInfo(BookId,Author,Description,Price,Catalog,ContactWay,ISOService,LoaderShape,PublishingInformation,Topic) values(?,?,?,?,?,?,?,?,?,?)";
	@Override
	public void insertDetailedInfo(DetailedBookInfo dbi) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(insertDetailSQL);
			
			pstm.setInt(1, dbi.getBookId());
			pstm.setString(2, dbi.getAuthor());
			pstm.setString(3,dbi.getDescription());
			pstm.setFloat(4, dbi.getPrice());
			pstm.setString(5, dbi.getCatalog());
			pstm.setString(6, dbi.getContactWay());
			pstm.setString(7, dbi.getISOService());
			pstm.setString(8, dbi.getLoaderShape());
			pstm.setString(9, dbi.getPublishingInformation());
			pstm.setString(10, dbi.getTopic());
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String updateDetailSQL="update DetailedBookInfo set Author=?,Description=?,Price=?,Catalog=?,ContactWay=?,ISOService=?,LoaderShape=?,PublishingInformation=?,Topic=? where BookId=?";

	@Override
	public void updateDetailedInfo(DetailedBookInfo dbi) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			pstm = conn.prepareStatement(updateDetailSQL);
			
			
			pstm.setString(1, dbi.getAuthor());
			pstm.setString(2,dbi.getDescription());
			pstm.setFloat(3, dbi.getPrice());
			pstm.setString(4, dbi.getCatalog());
			pstm.setString(5, dbi.getContactWay());
			pstm.setString(6, dbi.getISOService());
			pstm.setString(7, dbi.getLoaderShape());
			pstm.setString(8, dbi.getPublishingInformation());
			pstm.setString(9, dbi.getTopic());
			pstm.setInt(10, dbi.getBookId());
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static final String deleteDetailSQL="delete from DetailedBookInfo where BookId=";
	@Override
	public void deleteDetailedInfo(int bid) {
		Connection conn = null;
		Statement pstm = null;
		try{
			conn = getConnection();
			String str = deleteDetailSQL+bid;
			pstm=conn.createStatement();
			
			pstm.executeUpdate(str);
			pstm.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	private static final String getDetailSQL="select Id,BookId,Author,Description,Price,Catalog,ContactWay,ISOService,LoaderShape,PublishingInformation,Topic from DetailedBookInfo where BookId=";
	@Override
	public DetailedBookInfo getDetailedInfo(int bid) {
		
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getDetailSQL+String.valueOf(bid);
			rs=pstm.executeQuery(str);
			DetailedBookInfo temp = null;
			while(rs.next())
				temp = new DetailedBookInfo(rs.getInt("Id"),rs.getInt("BookId"),rs.getString("Author"),rs.getString("Description"),rs.getFloat("Price"),rs.getString("Catalog"),rs.getString("ContactWay"),rs.getString("ISOService"),rs.getString("LoaderShape"),rs.getString("PublishingInformation"),rs.getString("Topic"));
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	private static final String getDetailSQL2="select Id,BookId,Author,Description,Price,Catalog,ContactWay,ISOService,LoaderShape,PublishingInformation,Topic from DetailedBookInfo where Topic=";
	@Override
	public List<DetailedBookInfo> getDetailedInfo(String topic) {
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.createStatement();
			String str = getDetailSQL2+topic;
			rs=pstm.executeQuery(str);
			DetailedBookInfo temp = null;
			List<DetailedBookInfo> bl=new ArrayList<DetailedBookInfo>();
			while(rs.next())
			{
				temp = new DetailedBookInfo(rs.getInt("Id"),rs.getInt("BookId"),rs.getString("Author"),rs.getString("Description"),rs.getFloat("Price"),rs.getString("Catalog"),rs.getString("ContactWay"),rs.getString("ISOService"),rs.getString("LoaderShape"),rs.getString("PublishingInformation"),rs.getString("Topic"));
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
