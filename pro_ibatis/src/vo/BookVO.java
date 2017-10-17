package vo;

import java.util.Date;

public class BookVO {
	

	private int no;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private Date pubdate;
	private String discount;
	
	public BookVO() {}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getPubdate() {
		return pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "BookVO [no=" + no + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", price="
				+ price + ", pubdate=" + pubdate + ", discount=" + discount + "]";
	}
}
