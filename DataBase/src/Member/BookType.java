package Member;

public class BookType {

	private int TypeId;
	private String TypeNO;
	private String TypeName;
	BookType(){
		
	}
	public BookType(int n1,String s1,String s2){
		this.TypeId=n1;
		this.TypeNO=s1;
		this.TypeName=s2;
	}
	public int getTypeId() {
		return TypeId;
	}
	public void setTypeId(int typeId) {
		TypeId = typeId;
	}
	public String getTypeNO() {
		return TypeNO;
	}
	public void setTypeNO(String typeNO) {
		TypeNO = typeNO;
	}
	public String getTypeName() {
		return TypeName;
	}
	public void setTypeName(String typeName) {
		TypeName = typeName;
	}
}
