package example6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car implements Serializable {
	
	private static final long serialVersionUID = 3472707120206451674L;
	
	private int year;
	private String name;
	private String company;
	private int price;
	
	public Car() {}
	
	public Car(int year, String name, String company, int price) {
		super();
		this.year = year;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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
	public String toString() {
		return "Car [year=" + year + ", name=" + name + ", company=" + company + ", price=" + price + "]";
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException, ClassNotFoundException {
		// 직렬화할 때 자동으로 실행된다.
		System.out.println("Car의 writeObject() 실행됨");
		out.writeInt(year);
		out.writeUTF(name);
		out.writeUTF(company);
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		// 역직렬화할 때 자동으로 실행된다.
		System.out.println("Car의 readIbject() 실행됨");
		this.year = in.readInt();
		this.name = in.readUTF();
		this.company = in.readUTF();
		
	}
	
}
