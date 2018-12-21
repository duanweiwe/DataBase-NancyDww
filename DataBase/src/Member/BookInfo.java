package Member;

public class BookInfo {

	private int BookId;
	private String ISBN;
	private String BookName;
	private int ShelfId;
	private String BookStatus;
	BookInfo(){
		
	}
	public BookInfo(int id,String s1,String s2,int n,String s3){
		this.BookId=id;
		this.ISBN=s1;
		this.BookName=s2;
		this.ShelfId=n;
		this.BookStatus=s3;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getShelfId() {
		return ShelfId;
	}
	public void setShelfId(int shelfId) {
		ShelfId = shelfId;
	}
	public String getBookStatus() {
		return BookStatus;
	}
	public void setBookStatus(String bookStatus) {
		BookStatus = bookStatus;
	}
	
	
}
