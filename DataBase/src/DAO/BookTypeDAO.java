package DAO;
import Member.*;

public interface BookTypeDAO {
	public BookType getBookType(int id);
	public int insertBookType(BookType bt);
	public int updateBookType(BookType bt);
	public int deleteBookType(int bt);
	

}
