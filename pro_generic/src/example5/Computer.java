package example5;

public class Computer<M extends Moniter> {
	private M moniter;
	
	public Computer() {
		super();
	}
	

	public Computer(M moniter) {
		super();
		this.moniter = moniter;
	}

	public M getMoniter() {
		return moniter;
	}
	
	public void setMoniter(M moniter) {
		this.moniter = moniter;
	} 
	

	public void turnOnMointer() {
		moniter.on();
	}
	
	public void turnOffMointer() {
		moniter.off();
	}
	
	public void displayMointer() {
		moniter.display();
	}

}
