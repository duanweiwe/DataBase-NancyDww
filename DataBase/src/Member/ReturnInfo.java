package Member;

import java.sql.Date;

public class ReturnInfo {

	private int Id;
	private int UserId;
	private int BookId;
	private Date ReturnTime;
	public ReturnInfo(){
		
	}
    public ReturnInfo(int id,int uid,int bid,Date d){
		this.Id=id;
		this.UserId=uid;
		this.BookId=bid;
		this.ReturnTime=d;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public Date getReturnTime() {
		return ReturnTime;
	}
	public void setReturnTime(Date returnTime) {
		ReturnTime = returnTime;
	}
}
