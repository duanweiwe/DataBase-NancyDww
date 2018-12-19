package Member;

import java.util.Date;

public class BorrowInfo {

	private int id;
	private int BookId;
	private String UserId;
	private Date BorrowTime;
	BorrowInfo(){
		
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
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public Date getBorrowTime() {
		return BorrowTime;
	}
	public void setBorrowTime(Date borrowTime) {
		BorrowTime = borrowTime;
	}
}
