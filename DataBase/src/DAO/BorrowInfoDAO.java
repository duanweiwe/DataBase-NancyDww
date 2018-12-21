package DAO;
import Member.*;
import java.util.List;
public interface BorrowInfoDAO {

	public void insertBorrowInfo(BorrowInfo bi);
	public void updateBorrowInfo(BorrowInfo bi);
	public void deleteBorrowInfo(int bi);
	public List<BorrowInfo> getBorrowInfo(int userId);
	public BorrowInfo getBorrowInfo2(int bid);
}
