package Member;

public class Reader {

	private int UserId;
	private String UserName;
	private String Password;
	private String UserType;
	private String Email;
	private String BarCode;
	private String IDCard;
	private String Sex;
	private String Phone;
	private int BorrowTimes;
	public Reader(){}
	public Reader(int u,String name,String p,String type,String e,String b,String id,String s,String ph,int bt){
		this.UserId=u;
		this.UserName=name;
		this.Password=p;
		this.UserType=type;
		this.Email=e;
		this.BarCode=b;
		this.IDCard=id;
		this.Sex=s;
		this.Phone=ph;
		this.BorrowTimes=bt;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBarCode() {
		return BarCode;
	}
	public void setBarCode(String barCode) {
		BarCode = barCode;
	}
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public int getBorrowTimes() {
		return BorrowTimes;
	}
	public void setBorrowTimes(int borrowTimes) {
		BorrowTimes = borrowTimes;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}
	
	
}
