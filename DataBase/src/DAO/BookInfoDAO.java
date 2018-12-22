package DAO;
import Member.*;
import java.util.List;
public interface BookInfoDAO 
{
	public int insertBookInfo(BookInfo book);
	public int updateBookInfo(BookInfo book);
	public int deleteBookInfo(BookInfo book);
	public BookInfo getBookInfo(int id);
	public BookInfo getBookInfo(String BookName);
	

}
