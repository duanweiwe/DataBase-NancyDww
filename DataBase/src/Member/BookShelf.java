package Member;

public class BookShelf {
	private String ShelfNo;
	private String ShelfName;
	private String Location;
	private String RoomId;
	private int Capacity;
	BookShelf(){
		
	}
	public String getShelfNo() {
		return ShelfNo;
	}
	public void setShelfNo(String shelfNo) {
		ShelfNo = shelfNo;
	}
	public String getShelfName() {
		return ShelfName;
	}
	public void setShelfName(String shelfName) {
		ShelfName = shelfName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getRoomId() {
		return RoomId;
	}
	public void setRoomId(String roomId) {
		RoomId = roomId;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
}
