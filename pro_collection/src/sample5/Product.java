package sample5;

import java.util.Date;

public class Product {
	private int no;					// 상품번호
	private String category;		// 상품종류: 옷, 전자제품, 가구, 문구류
	private String name;			// 상품이름
	private String price;			// 상품가격
	private Date pubdate;			// 판매개시일
	private boolean isSoldOut;		// 절판여부
	
	public Product(int no, String category, String name, String price, Date pubdate, boolean isSoldOut) {
		super();
		this.no = no;
		this.category = category;
		this.name = name;
		this.price = price;
		this.pubdate = pubdate;
		this.isSoldOut = isSoldOut;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getPubdate() {
		return pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	public boolean isSoldOut() {
		return isSoldOut;
	}

	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}

	@Override
	public String toString() {
		return "Product [no=" + no + ", category=" + category + ", name=" + name + ", price=" + price + ", pubdate="
				+ pubdate + ", isSoldOut=" + isSoldOut + "]";
	}
	
	

	
	
	
	
	
}
