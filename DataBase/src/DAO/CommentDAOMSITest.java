package DAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Member.Comment;

public class CommentDAOMSITest {

	@Test
	public void testInsertComment() {//add
		CommentDAOMSI cdm=new CommentDAOMSI();
		Comment c=new Comment();
		c.setUserId(5);
		c.setBookId(2);
		c.setCommentContext("ƒÕ»À—∞Œ∂");
		assertEquals(1,cdm.insertComment(c));
	}
	@Test
	public void testUpdateComment() {//update the comment where id=2 ,set context="Wonderful"
		CommentDAOMSI cdm=new CommentDAOMSI();
		Comment c=cdm.getComment0(2);
		c.setCommentContext("Wonderful");
		assertEquals(1,cdm.updateComment(c));
	}
	@Test
	public void testDeleteComment() {//delete the comment where id=11
		CommentDAOMSI cdm=new CommentDAOMSI();
		assertEquals(1,cdm.deleteComment(11));
	}
	@Test
	public void testGetComment0() {//find the comment where id=2
		CommentDAOMSI cdm=new CommentDAOMSI();
		Comment c=cdm.getComment0(2);
		assertEquals(2,c.getCommentId());
	}
	@Test
	public void testGetComment() {//find the comments where userid=3 and bookid=3
		CommentDAOMSI cdm=new CommentDAOMSI();
		List<Comment> lc=cdm.getComment(3, 3);
		for(int i=0;i<lc.size();i++){
			Comment c=lc.get(i);
			System.out.println(c.getCommentId()+" "+c.getUserId()+" "+c.getBookId()+" "+c.getCommentContext()+" "+c.getCommentTime());
		}
		assertEquals(3,lc.get(0).getCommentId());
	}

}
