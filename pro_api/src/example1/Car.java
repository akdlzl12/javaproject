package example1;

public class Car {
	private String name;
	private String company;
	private int year;
	
	public Car() {
		
	}


	public Car(String name, String company, int year) {
		super();
		this.name = name;
		this.company = company;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", company=" + company + ", year=" + year + "]";
	}

	
	
	
}
