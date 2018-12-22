package DAO;
import Member.*;
import java.util.List;
public interface BTDAO {
	public int insertBT(BT bt);
	public int updateBT(BT bt);
	public int deleteBT(int id);
	public List<BT> getBT(int bid);
	public List<BT> getBT2(int Tid);
	
}
