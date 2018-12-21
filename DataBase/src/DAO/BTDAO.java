package DAO;
import Member.*;
import java.util.List;
public interface BTDAO {
	public void insertBT(BT bt);
	public void updateBT(BT bt);
	public void deleteBT(int id);
	public List<BT> getBT(int bid);
	public List<BT> getBT2(int Tid);

}
