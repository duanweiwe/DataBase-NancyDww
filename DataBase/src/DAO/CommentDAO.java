package DAO;
import Member.*;
import java.util.List;

public interface CommentDAO {
	public void insertComment(Comment c);
	public void updateComment(Comment c);
	public void deleteComment(int id);
	public Comment getComment0(int id);
	public List<Comment> getComment(int uid);
	public List<Comment> getComment(int uid,String bid);

}
