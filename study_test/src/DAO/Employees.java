package DAO;

public class Employees {


	private int employess_id;
	private String first_name;
	private int salary;
	
	
	public Employees() {}
	

	public int getEmployess_id() {
		return employess_id;
	}

	public void setEmployess_id(int employess_id) {
		this.employess_id = employess_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	@Override
	public String toString() {
		return "Employees [employess_id=" + employess_id + ", first_name=" + first_name + ", salary=" + salary
				+ "]";
	}
	
	
}
