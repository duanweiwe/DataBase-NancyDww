package Member;

import java.sql.Timestamp;

public class Comment {

	private int CommentId;
	private int UserId;
	private Timestamp CommentTime;
	private int BookId;
	private String CommentContext;
	public Comment(){
		
	}
	public Comment(int n1,int n2,int n3,String s3,Timestamp d){
		this.CommentId=n1;
		this.CommentTime=d;
		this.UserId=n2;
		this.BookId=n3;
		this.CommentContext=s3;
	}
	public int getCommentId() {
		return CommentId;
	}
	public void setCommentId(int commentId) {
		CommentId = commentId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	public String getCommentContext() {
		return CommentContext;
	}
	public void setCommentContext(String commentContext) {
		CommentContext = commentContext;
	}
	public Timestamp getCommentTime() {
		return CommentTime;
	}
	public void setCommentTime(Timestamp commentTime) {
		CommentTime = commentTime;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	
}
