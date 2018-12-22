package Member;

import java.sql.Timestamp;

public class Reservation {

	private int RId;
	private int UserId;
	private int BookId;
	private Timestamp ReserveTime;
	
	public Reservation(){
		
	}
	public Reservation(int id,int uid,int bid,Timestamp t){
		this.RId=id;
		this.UserId=uid;
		this.BookId=bid;
		this.ReserveTime=t;
	}
	public int getRId() {
		return RId;
	}
	public void setRId(int rId) {
		RId = rId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public Timestamp getReserveTime() {
		return ReserveTime;
	}
	public void setReserveTime(Timestamp reserveTime) {
		ReserveTime = reserveTime;
	}
}
