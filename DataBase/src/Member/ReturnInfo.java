package Member;

import java.util.Date;

public class ReturnInfo {

	private int Id;
	private String UserId;
	private int BookId;
	private Date ReturnTime;
	ReturnInfo(){
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public Date getReturnTime() {
		return ReturnTime;
	}
	public void setReturnTime(Date returnTime) {
		ReturnTime = returnTime;
	}
}
