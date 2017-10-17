package example6;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 7538316384483982537L;
	
	private String userId;
	private transient String password;
	private String email;
	private Car car;
	
	public User() {}
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", email=" + email + ", car=" + car + "]";
	}
	
}
