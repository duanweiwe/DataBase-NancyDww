package DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import Member.ReturnInfo;

public class ReturnInfoDAOMSITest {

	@Test
	public void testInsertReturnInfo() {//add
		ReturnInfoDAOMSI rdm=new ReturnInfoDAOMSI();
		ReturnInfo r=new ReturnInfo();
		r.setUserId(5);
		r.setBookId(3);
		assertEquals(1,rdm.insertReturnInfo(r));
	}
	@Test
	public void testUpdateReturnInfo() {//update the returninfo where id=1 ,set userid=2 and bookid=4
		ReturnInfoDAOMSI rdm=new ReturnInfoDAOMSI();
		ReturnInfo r=rdm.getReturnInfo(1);
		r.setUserId(2);
		r.setBookId(4);
		assertEquals(1,rdm.updateReturnInfo(r));
	}
	@Test
	public void testDeleteReturnInfo() {//delete where id=5
		ReturnInfoDAOMSI rdm=new ReturnInfoDAOMSI();
		assertEquals(1,rdm.deleteReturnInfo(5));
	}
	@Test
	public void testGetReturnInfo() {//find where id=1
		ReturnInfoDAOMSI rdm=new ReturnInfoDAOMSI();
		assertEquals(1,rdm.getReturnInfo(1).getId());
	}

}
