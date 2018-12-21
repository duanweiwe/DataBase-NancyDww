package Member;

public class BT {

	private int Id;
	private int BookId;
	private int TypeId;
	BT(){
		
	}
	public BT(int id,int bid,int uid){
		this.Id=id;
		this.BookId=bid;
		this.TypeId=uid;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public int getTypeId() {
		return TypeId;
	}
	public void setTypeId(int typeId) {
		TypeId = typeId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
}
