package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Member.*;

public class DetailedBookInfoDAOMSI extends DAOBase implements DetailedBookInfoDAO {

	private static final String insertDetailSQL="insert into DetailedBookInfo(BookId,FirstAuthor,Description,Price,Catalog,ContactWay,ISOService,LoaderShape,PublishingInformation,Topic,SecondAuthor) values(?,?,?,?,?,?,?,?,?,?,?)";
	@Override
	public int insertDetailedInfo(DetailedBookInfo dbi) {
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
			pstm.setString(11, dbi.getSecondAuthor());
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	private static final String updateDetailSQL="update DetailedBookInfo set FirstAuthor=?,Description=?,Price=?,Catalog=?,ContactWay=?,ISOService=?,LoaderShape=?,PublishingInformation=?,Topic=?,SecondAuthor=? where BookId=?";

	@Override
	public int updateDetailedInfo(DetailedBookInfo dbi) {
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
			pstm.setString(10, dbi.getSecondAuthor());
			
			pstm.setInt(11, dbi.getBookId());
			
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}

		return -1;
	}
	private static final String deleteDetailSQL="delete from DetailedBookInfo where BookId=?";
	@Override
	public int deleteDetailedInfo(int bid) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			conn = getConnection();
			
			pstm=conn.prepareStatement(deleteDetailSQL);
			pstm.setInt(1, bid);
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1;

	}
	
	private static final String getDetailSQL="select Id,BookId,FirstAuthor,Description,Price,Catalog,ContactWay,ISOService,LoaderShape,PublishingInformation,Topic,SecondAuthor from DetailedBookInfo where BookId=?";
	@Override
	public DetailedBookInfo getDetailedInfo(int bid) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.prepareStatement(getDetailSQL);
			pstm.setInt(1, bid);
			rs=pstm.executeQuery();
			DetailedBookInfo temp = null;
			while(rs.next())
				temp = new DetailedBookInfo(rs.getInt("Id"),rs.getInt("BookId"),rs.getString("FirstAuthor"),rs.getString("Description"),rs.getFloat("Price"),rs.getString("Catalog"),rs.getString("ContactWay"),rs.getString("ISOService"),rs.getString("LoaderShape"),rs.getString("PublishingInformation"),rs.getString("Topic"),rs.getString("SecondAuthor"));
			rs.close();
			pstm.close();
			conn.close();
			return temp;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	private static final String getDetailSQL2="select Id,BookId,FirstAuthor,Description,Price,Catalog,ContactWay,ISOService,LoaderShape,PublishingInformation,Topic,SecondAuthor from DetailedBookInfo where Topic=?";
	@Override
	public List<DetailedBookInfo> getDetailedInfo(String topic) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstm=conn.prepareStatement(getDetailSQL2);
			pstm.setString(1, topic);
			rs=pstm.executeQuery();
			DetailedBookInfo temp = null;
			List<DetailedBookInfo> bl=new ArrayList<DetailedBookInfo>();
			while(rs.next())
			{
				temp = new DetailedBookInfo(rs.getInt("Id"),rs.getInt("BookId"),rs.getString("FirstAuthor"),rs.getString("Description"),rs.getFloat("Price"),rs.getString("Catalog"),rs.getString("ContactWay"),rs.getString("ISOService"),rs.getString("LoaderShape"),rs.getString("PublishingInformation"),rs.getString("Topic"),rs.getString("SecondAuthor"));
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
