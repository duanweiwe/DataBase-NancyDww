package DAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Member.BookInfo;
import Member.DetailedBookInfo;

public class DetailedBookInfoDAOMSITest {
	@Test
	public void testInsertDetailedInfo() {//add
		DetailedBookInfoDAOMSI dbi=new DetailedBookInfoDAOMSI();
		DetailedBookInfo d=new DetailedBookInfo();
		d.setBookId(11);
		d.setAuthor("AAA");
		d.setCatalog("aaaa");
		d.setContactWay("contactway");
		d.setDescription("description");
		d.setISOService("iso");
		d.setLoaderShape("16X16");
		d.setPrice(100);
		d.setPublishingInformation("publishing");
		d.setSecondAuthor("bbb");
		d.setTopic("ttt");
		assertEquals(1,dbi.insertDetailedInfo(d));
	}
	@Test
	public void testUpdateDetailedInfo() {//update the info where id=2 ,set catalog=bbbb and set firstauthor=CCCC
		DetailedBookInfoDAOMSI dbi=new DetailedBookInfoDAOMSI();
		DetailedBookInfo d=dbi.getDetailedInfo(2);
		d.setCatalog("bbbb");
		d.setAuthor("CCCC");
		assertEquals(1,dbi.updateDetailedInfo(d));
	}
	@Test
	public void testDeleteDetailedInfo() {//delete the info where id=10
		DetailedBookInfoDAOMSI dbi=new DetailedBookInfoDAOMSI();
		assertEquals(1,dbi.deleteDetailedInfo(10));
	}
	@Test
	public void testGetDetailedInfoInt() {//find the info where id=2
		DetailedBookInfoDAOMSI dbi=new DetailedBookInfoDAOMSI();
		DetailedBookInfo d=dbi.getDetailedInfo(2);
		assertEquals(2,d.getId());
	}
	@Test
	public void testGetDetailedInfoString() {
		DetailedBookInfoDAOMSI dbi=new DetailedBookInfoDAOMSI();
		List<DetailedBookInfo> ld=dbi.getDetailedInfo("”Ó÷Ê—ß");
		assertEquals(9,ld.get(0).getId());
	}

}
