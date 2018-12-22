package DAO;
import java.util.*;
import Member.*;

public interface ReturnInfoDAO {
	public int insertReturnInfo(ReturnInfo ri);
	public int updateReturnInfo(ReturnInfo ri);
	public int deleteReturnInfo(int id);
	public ReturnInfo getReturnInfo(int id);
	

}
