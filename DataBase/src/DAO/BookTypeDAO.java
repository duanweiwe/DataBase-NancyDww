package DAO;
import Member.*;

public interface BookTypeDAO {
	public BookType getBookType(int id);
	public void insertBookType(BookType bt);
	public void updateBookType(BookType bt);
	public void deleteBookType(int bt);
	

}
