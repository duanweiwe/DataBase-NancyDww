package Member;

public class BookShelf {
	private int Id;
	private String ShelfNo;
	private String ShelfName;
	private String Location;
	private int RoomId;
	private int Capacity;
	public BookShelf(){
		
	}
	public BookShelf(int n1,String s1,String s2,int n2,String s3,int n3 ){
		this.Id=n1;
		this.ShelfNo=s1;
		this.ShelfName=s2;
		this.Location=s3;
		this.RoomId=n3;
		this.Capacity=n2;
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
	public int getRoomId() {
		return RoomId;
	}
	public void setRoomId(int roomId) {
		RoomId = roomId;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
}
