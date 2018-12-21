package Member;

public class Room {

	 
	private int RoomId;
	private String RoomNo;
	private String RoomName;
	private String RoomLocation;
	private int RoomCapacity;
	Room(){
		
	}
	public Room(int id,String No,String na,String l,int c){
		this.RoomId=id;
		this.RoomNo=No;
		this.RoomName=na;
		this.RoomLocation=l;
		this.RoomCapacity=c;
	}
	public int getRoomId() {
		return RoomId;
	}
	public void setRoomId(int roomId) {
		RoomId = roomId;
	}
	public String getRoomName() {
		return RoomName;
	}
	public void setRoomName(String roomName) {
		RoomName = roomName;
	}
	public String getRoomLocation() {
		return RoomLocation;
	}
	public void setRoomLocation(String roomLocation) {
		RoomLocation = roomLocation;
	}
	public int getRoomCapacity() {
		return RoomCapacity;
	}
	public void setRoomCapacity(int roomCapacity) {
		RoomCapacity = roomCapacity;
	}
	public String getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(String roomNo) {
		RoomNo = roomNo;
	}
}
