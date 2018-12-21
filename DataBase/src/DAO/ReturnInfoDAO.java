package DAO;
import java.util.*;
import Member.*;

public interface ReturnInfoDAO {
	public void insertReturnInfo(ReturnInfo ri);
	public void updateReturnInfo(ReturnInfo ri);
	public void deleteReturnInfo(int id);
	public ReturnInfo getReturnInfo(int id);
	

}
