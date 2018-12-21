package DAO;
import Member.*;
public interface BookShelfDAO {
	public BookShelf getBookShelf(String No);
	public void insertBookShelf(BookShelf bs);
	public void updateBookShelf(BookShelf bs);
	public void deleteBookShelf(int bs);
	
	}
