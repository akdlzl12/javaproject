package example3;

public class Customer {
	private String id;
	private String username;
	private String phone;
	
	public Customer(String id, String username, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", phone=" + phone + "]";
	}
	
	
}
