package Member;

public class BookInfo {

	private int BookId;
	private String ISBN;
	private String BookName;
	private int StoreNumber;
	private String BookShelfId;
	BookInfo(){
		
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
	public int getStoreNumber() {
		return StoreNumber;
	}
	public void setStoreNumber(int storeNumber) {
		StoreNumber = storeNumber;
	}
	public String getBookShelfId() {
		return BookShelfId;
	}
	public void setBookShelfId(String bookShelfId) {
		BookShelfId = bookShelfId;
	}
}
