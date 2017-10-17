package example1;

public class Product {
	private int no;
	private String name;
	private String company;
	private int price;
	
	public Product() {}

	public Product(int no, String name, String company, int price) {
		super();
		this.no = no;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		
		return no;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		return this.no == ((Product)obj).no;
	}

	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", company=" + company + ", price=" + price + "]";
	}
	
	
}
