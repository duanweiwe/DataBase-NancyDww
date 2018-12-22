package DAO;
import Member.*;
public interface BookShelfDAO {
	public BookShelf getBookShelf(String No);
	public int insertBookShelf(BookShelf bs);
	public int updateBookShelf(BookShelf bs);
	public int deleteBookShelf(int bs);
	
	}
