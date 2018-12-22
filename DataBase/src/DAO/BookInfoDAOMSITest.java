package DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import Member.*;
public class BookInfoDAOMSITest {

	@Test
	public void testInsertBookInfo() {
		BookInfoDAOMSI bidm=new BookInfoDAOMSI();
		BookInfo b=new BookInfo();
		b.setBookName("bookname");
		b.setISBN("9999999");
		b.setBookStatus("可借");
		b.setShelfId("A111");
		assertEquals(1,bidm.insertBookInfo(b));
	}
	@Test
	public void testUpdateBookInfo() {
		BookInfoDAOMSI bidm=new BookInfoDAOMSI();
		BookInfo b=bidm.getBookInfo(3);
		b.setBookName("《追风筝的人》");
		b.setShelfId("A666");
		assertEquals(1,bidm.updateBookInfo(b));
		}
	@Test
	public void testDeleteBookInfo() {
		BookInfoDAOMSI bidm=new BookInfoDAOMSI();
		BookInfo b=bidm.getBookInfo(11);
		assertEquals(1,bidm.deleteBookInfo(b));
		}

	@Test
	public void testGetBookInfoInt() {
		BookInfoDAOMSI bidm=new BookInfoDAOMSI();
		BookInfo b=bidm.getBookInfo(7);
		assertEquals(7,b.getBookId());
	}
	@Test
	public void testGetBookInfoString() {
		BookInfoDAOMSI bidm=new BookInfoDAOMSI();
		BookInfo b=bidm.getBookInfo("《活着》");
		assertEquals(5,b.getBookId());
	}

}
