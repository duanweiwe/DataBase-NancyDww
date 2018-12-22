package DAO;
import Member.*;
import java.util.*;
public interface DetailedBookInfoDAO {
	public int insertDetailedInfo(DetailedBookInfo dbi);
	public int updateDetailedInfo(DetailedBookInfo dbi);
	public int deleteDetailedInfo(int bid);
	public DetailedBookInfo getDetailedInfo(int bid);
	public List<DetailedBookInfo> getDetailedInfo(String topic);

}
