package DAO;
import Member.*;
import java.util.List;
public interface BorrowInfoDAO {

	public int insertBorrowInfo(BorrowInfo bi);
	public int updateBorrowInfo(BorrowInfo bi);
	public int deleteBorrowInfo(int bi);
	public List<BorrowInfo> getBorrowInfo(int userId);
	public BorrowInfo getBorrowInfo2(int bid);
}
