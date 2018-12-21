package DAO;
import Member.*;
import java.util.List;
public interface BookInfoDAO 
{
	public void insertBookInfo(BookInfo book);
	public void updateBookInfo(BookInfo book);
	public void deleteBookInfo(BookInfo book);
	public BookInfo getBookInfo(int id);
	public BookInfo getBookInfo(String BookName);
	

}
