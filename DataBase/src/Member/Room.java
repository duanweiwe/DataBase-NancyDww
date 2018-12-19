package Member;

public class Room {

	private String RoomId;
	private String RoomName;
	private String RoomLocation;
	private int RoomCapacity;
	Room(){
		
	}
	public String getRoomId() {
		return RoomId;
	}
	public void setRoomId(String roomId) {
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
}
