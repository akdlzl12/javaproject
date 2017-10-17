package example5;

import java.util.Date;

public class Rental {


	

	@Override
	public String toString() {
		return "Rental [no=" + no + ", title=" + title + ", username=" + username + ", rentDate=" + rentDate
				+ ", backDate=" + backDate + ", back=" + back + "]";
	}

	private long no;			// 대여번호
	private String title;		// 대여한 책 제목
	private String username;	// 대여자 이름
	private String rentDate;	// 대여일
	private String backDate;	// 반납일
	private int back;			// 반납여부 0이면 대여중, 1이면 반납
	
	public Rental() {
		
	}
	
	public Rental(String title, String username, String rentDate) {
		super();
		this.no = System.currentTimeMillis();
		this.title = title;
		this.username = username;
		this.rentDate = rentDate;
		
	}
	
	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}
	
	public String getBackDate() {
		return backDate;
	}

	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}

	public int getback() {
		return back;
	}

	public void setBack(int back) {
		this.back = back;
	}
	
	
	
	
}
