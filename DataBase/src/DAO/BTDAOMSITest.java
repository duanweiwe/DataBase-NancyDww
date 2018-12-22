package DAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Member.BT;

public class BTDAOMSITest {

	@Test
	public void testInsertBT() {//add
		BTDAOMSI btdm=new BTDAOMSI();
		BT bt=new BT();
		bt.setTypeId(2);
		bt.setBookId(5);
		assertEquals(1,btdm.insertBT(bt));
	}
	@Test
	public void testUpdateBT() {//update the BT where bookId=2 ,set TypeId=7
		BTDAOMSI btdm=new BTDAOMSI();
		List<BT> lb=btdm.getBT(2);
		BT bt=lb.get(0);
		bt.setTypeId(7);
		assertEquals(1,btdm.updateBT(bt));
	}
	@Test
	public void testDeleteBT() {
		BTDAOMSI btdm=new BTDAOMSI();
		assertEquals(1,btdm.deleteBT(10));
	}
	@Test
	public void testGetBT() {
		BTDAOMSI btdm=new BTDAOMSI();
		List<BT> lb=btdm.getBT(3);
		for(int i=0;i<lb.size();i++){
			BT b=lb.get(i);
			System.out.println(b.getId()+" "+b.getTypeId()+" "+b.getBookId());
		}
		assertEquals(9,lb.get(0).getId());
	}
	@Test
	public void testGetBT2() {
		BTDAOMSI btdm=new BTDAOMSI();
		List<BT> lb=btdm.getBT2(4);
		for(int i=0;i<lb.size();i++){
			BT b=lb.get(i);
			System.out.println(b.getId()+" "+b.getTypeId()+" "+b.getBookId());
		}
		assertEquals(1,lb.size());
	}

}
