package DAO;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Member.BorrowInfo;

public class BorrowInfoDAOMSITest {

	@Test
	public void testInsertBorrowInfo() {//Add 
		BorrowInfoDAOMSI bidm=new BorrowInfoDAOMSI();
		BorrowInfo bi=new BorrowInfo();
		bi.setBookId(10);
		bi.setUserId(2);
		assertEquals(1,bidm.insertBorrowInfo(bi));
	}
	@Test
	public void testUpdateBorrowInfo() {//update BorrowInfo where id=1,set Date="2018-12-20"
		BorrowInfoDAOMSI bidm=new BorrowInfoDAOMSI();
		BorrowInfo b=bidm.getBorrowInfo2(1);
		Date date=new Date(2018-12-20);
		b.setBorrowTime(date);
		assertEquals(1,bidm.updateBorrowInfo(b));
	}
	@Test
	public void testDeleteBorrowInfo() {//delete BorrowInfo where id=8
		BorrowInfoDAOMSI bidm=new BorrowInfoDAOMSI();
		assertEquals(1,bidm.deleteBorrowInfo(8));
	}
	@Test
	public void testGetBorrowInfo() {//find BorrowInfo where id=2
		BorrowInfoDAOMSI bidm=new BorrowInfoDAOMSI();
		BorrowInfo b=bidm.getBorrowInfo2(2);
		assertEquals(2,b.getId());
	}
	@Test
	public void testGetBorrowInfo2() {//get BorrowInfo where userId=3
		BorrowInfoDAOMSI bidm=new BorrowInfoDAOMSI();
		List<BorrowInfo> lb=bidm.getBorrowInfo(3);
		for(int i=0;i<lb.size();i++){
			BorrowInfo b=lb.get(i);
			System.out.println(b.getId()+" User:"+b.getUserId()+" BookId:"+b.getBookId()+" BorrowTime:"+b.getBorrowTime());
		}
		assertEquals(2,lb.get(0).getId());
	}

}
