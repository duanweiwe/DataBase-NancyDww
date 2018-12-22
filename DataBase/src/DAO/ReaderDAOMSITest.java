package DAO;

import static org.junit.Assert.*;

import org.junit.Test;
import Member.*
;public class ReaderDAOMSITest {

	@Test
	public void testInsertReader() {
		  Reader r=new Reader();
		  r.setUserName("Betty");
		  r.setPassword("1234");
		  r.setBarCode("2222");
		  r.setBorrowTimes(0);
		  r.setEmail("Betty@2222");
		  r.setIDCard("77777");
		  r.setPhone("123456");
		  r.setSex("Å®");
		  r.setUserType("Ñ§Éú");
		  ReaderDAOMSI rd=new ReaderDAOMSI();
	      assertEquals(1,rd.insertReader(r));
}

	@Test
	public void testUpdateReader() {
		ReaderDAOMSI rd=new ReaderDAOMSI();
		Reader r=rd.getReader(1);
		r.setUserName("Peter2");
		assertEquals(1,rd.updateReader(r));
	}

	@Test
	public void testGetReader() {
		ReaderDAOMSI rd=new ReaderDAOMSI();
		Reader r=rd.getReader(1);
		assertEquals(1,r.getUserId());
	}

	@Test
	public void testDeleteReader() {
		ReaderDAOMSI rd=new ReaderDAOMSI();
		assertEquals(1,rd.deleteReader(6));
	}

}
