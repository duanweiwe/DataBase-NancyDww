package DAO;
import java.util.List;

import Member.*;


public interface ReaderDAO 
{
	public int insertReader(Reader temp);
	public int updateReader(Reader temp);
	public int deleteReader(int id);
	public Reader getReader(int id);
}
