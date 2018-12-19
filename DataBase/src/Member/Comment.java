package Member;

import java.util.Date;

public class Comment {

	private int CommentId;
	private String UserId;
	private Date CommentTime;
	private String ISBN;
	Comment(){
		
	}
	public int getCommentId() {
		return CommentId;
	}
	public void setCommentId(int commentId) {
		CommentId = commentId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public Date getCommentTime() {
		return CommentTime;
	}
	public void setCommentTime(Date commentTime) {
		CommentTime = commentTime;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
}
