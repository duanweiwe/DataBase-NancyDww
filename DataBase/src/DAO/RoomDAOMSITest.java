package DAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Member.Room;

public class RoomDAOMSITest {
	@Test
	public void testInsertRoom() {
		RoomDAOMSI rdm=new RoomDAOMSI();
		Room r=new Room();
		r.setRoomNo("304");
		r.setRoomName("304ΩË‘ƒ “");
		r.setRoomLocation("Õº Èπ›»˝≤„");
		r.setRoomCapacity(40);
		assertEquals(1,rdm.insertRoom(r));
	}
	@Test
	public void testUpdateRoom() {
		RoomDAOMSI rdm=new RoomDAOMSI();
		Room r=rdm.getRoom(1);
		r.setRoomCapacity(40);
		assertEquals(1,rdm.updateRoom(r));
	}
	@Test
	public void testDeleteRoom() {
		RoomDAOMSI rdm=new RoomDAOMSI();
		assertEquals(1,rdm.deleteRoom(6));
	}
	@Test
	public void testGetRoomInt() {
		RoomDAOMSI rdm=new RoomDAOMSI();
		assertEquals(2,rdm.getRoom(2).getRoomId());
	}
	@Test
	public void testGetRoom() {
		RoomDAOMSI rdm=new RoomDAOMSI();
		List<Room> lr=rdm.getRoom();
		for(int i=0;i<lr.size();i++){
			Room r=lr.get(i);
			System.out.println(r.getRoomId()+" "+r.getRoomNo()+" "+r.getRoomName()+" "+r.getRoomLocation()+" "+r.getRoomCapacity());
		}
		assertEquals(6,lr.size());
	}

}
