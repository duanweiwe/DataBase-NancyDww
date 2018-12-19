package Member;

public class DetailedBookInfo {

	private int BookId;
	private String Author;
	private String Description;
	private float Price;
	private String Catalog;
	private String ContactWay;
	private String ISOService;
	private String LoaderShape;
	private String PublishingHouse;
	private String Topic;
	DetailedBookInfo(){
		
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getCatalog() {
		return Catalog;
	}
	public void setCatalog(String catalog) {
		Catalog = catalog;
	}
	public String getContactWay() {
		return ContactWay;
	}
	public void setContactWay(String contactWay) {
		ContactWay = contactWay;
	}
	public String getISOService() {
		return ISOService;
	}
	public void setISOService(String iSOService) {
		ISOService = iSOService;
	}
	public String getLoaderShape() {
		return LoaderShape;
	}
	public void setLoaderShape(String loaderShape) {
		LoaderShape = loaderShape;
	}
	public String getPublishingHouse() {
		return PublishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		PublishingHouse = publishingHouse;
	}
	public String getTopic() {
		return Topic;
	}
	public void setTopic(String topic) {
		Topic = topic;
	}
	
}
