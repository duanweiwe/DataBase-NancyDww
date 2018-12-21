package Member;

import java.sql.Date;

public class BorrowInfo {

	private int id;
	private int BookId;
	private int UserId;
	private Date BorrowTime;
	BorrowInfo(){
		
	}
	public BorrowInfo(int n1,int n2,int n3,Date d){
		this.id=n1;
		this.BookId=n2;
		this.UserId=n3;
		this.BorrowTime=d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public Date getBorrowTime() {
		return BorrowTime;
	}
	public void setBorrowTime(Date borrowTime) {
		BorrowTime = borrowTime;
	}
}
