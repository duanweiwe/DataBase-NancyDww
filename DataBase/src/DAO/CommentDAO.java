package DAO;
import Member.*;
import java.util.List;

public interface CommentDAO {
	public int insertComment(Comment c);
	public int updateComment(Comment c);
	public int deleteComment(int id);
	public Comment getComment0(int id);
	
	public List<Comment> getComment(int uid,int bid);

}
