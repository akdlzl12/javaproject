package example4;

public class Auth<I, P> {
	private I id;
	private P password;
	
	public Auth(I id, P password) {
		super();
		this.id = id;
		this.password = password;
	}

	public I getId() {
		return id;
	}

	public void setId(I id) {
		this.id = id;
	}

	public P getPassword() {
		return password;
	}

	public void setPassword(P password) {
		this.password = password;
	}
	
	
	
	
}
