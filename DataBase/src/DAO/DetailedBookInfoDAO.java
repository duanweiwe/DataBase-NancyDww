package DAO;
import Member.*;
import java.util.*;
public interface DetailedBookInfoDAO {
	public void insertDetailedInfo(DetailedBookInfo dbi);
	public void updateDetailedInfo(DetailedBookInfo dbi);
	public void deleteDetailedInfo(int bid);
	public DetailedBookInfo getDetailedInfo(int bid);
	public List<DetailedBookInfo> getDetailedInfo(String topic);

}
