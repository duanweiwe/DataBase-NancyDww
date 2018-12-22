package DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import Member.BookShelf;

public class BookShelfDAOMSITest {

	@Test
	public void testGetBookShelf() {
		BookShelfDAOMSI bsdm=new BookShelfDAOMSI();
		BookShelf bs=bsdm.getBookShelf("A111");
		assertEquals("A111",bs.getShelfNo());
	}

	@Test
	public void testInsertBookShelf() {
		BookShelfDAOMSI bsdm=new BookShelfDAOMSI();
		BookShelf bs=new BookShelf();
		bs.setCapacity(20);
		bs.setLocation("301‘ƒ¿¿ “");
		bs.setRoomId(1);
		bs.setShelfName("301µ⁄“ª Èº‹");
		bs.setShelfNo("A001");
		assertEquals(1,bsdm.insertBookShelf(bs));
	}

	@Test
	public void testUpdateBookShelf() {
		BookShelfDAOMSI bsdm=new BookShelfDAOMSI();
		BookShelf bs=bsdm.getBookShelf("A111");
		bs.setCapacity(70);
		assertEquals(1,bsdm.updateBookShelf(bs));
	}

	@Test
	public void testDeleteBookShelf() {
		BookShelfDAOMSI bsdm=new BookShelfDAOMSI();
		
		assertEquals(1,bsdm.deleteBookShelf(2));
	}

}
