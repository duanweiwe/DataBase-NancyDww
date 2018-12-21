package DAO;

public class DAOFactory {
	public static BookInfoDAO getBookInfoDAO(){
		return new BookInfoDAOMSI();
	}
	public static BookShelfDAO getBookShelfDAO(){
		return new BookShelfDAOMSI();
	}
	public static BookTypeDAO getBookTypeDAO(){
		return new BookTypeDAOMSI();
	}
	public static BorrowInfoDAO getBorrowInfoDAO(){
		return new BorrowInfoDAOMSI();
	}
	public static BTDAO getBTDAO(){
		return new BTDAOMSI();
	}
	public static CommentDAO getCommentDAO(){
		return new CommentDAOMSI();
	}
	public static DetailedBookInfoDAO getDetailedBookInfoDAO(){
		return new DetailedBookInfoDAOMSI();
	}
	public static ReaderDAO getReaderDAO(){
		return new ReaderDAOMSI();
	}
	public static ReservationDAO getReservationDAO(){
		return new ReservationDAOMSI();
	}
	public static ReturnInfoDAO getReturnInfoDAO(){
		return new ReturnInfoDAOMSI();
	}
	public static RoomDAO getRoomDAO(){
		return new RoomDAOMSI();
	}

	
}
