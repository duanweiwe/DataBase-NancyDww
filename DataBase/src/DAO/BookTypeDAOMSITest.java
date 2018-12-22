package DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import Member.BookType;

public class BookTypeDAOMSITest {

	@Test
	public void testGetBookType() {
		BookTypeDAOMSI btdm=new BookTypeDAOMSI();
		BookType bt=btdm.getBookType(1);
		assertEquals(1,bt.getTypeId());
	}

	@Test
	public void testInsertBookType() {
		BookTypeDAOMSI btdm=new BookTypeDAOMSI();
		BookType bt=new BookType();
		bt.setTypeNO("A111.2");
		bt.setTypeName("外国文学，小说");
		assertEquals(1,btdm.insertBookType(bt));

	}

	@Test
	public void testUpdateBookType() {
		BookTypeDAOMSI btdm=new BookTypeDAOMSI();
		BookType bt=btdm.getBookType(1);
		bt.setTypeNO("B222");
		bt.setTypeName("俄国文学");
		assertEquals(1,btdm.updateBookType(bt));
	}

	@Test
	public void testDeleteBookType() {
		BookTypeDAOMSI btdm=new BookTypeDAOMSI();
		assertEquals(1,btdm.deleteBookType(8));
	}
}
