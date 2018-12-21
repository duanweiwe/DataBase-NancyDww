package DAO;
import java.util.List;

import Member.*;


public interface ReaderDAO 
{
	public void insertReader(Reader temp);
	public void updateReader(Reader temp);
	public void deleteReader(int id);
	public Reader getReader(int id);
}
