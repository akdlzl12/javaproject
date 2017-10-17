package example1;

public class Box {
	private Object item;
	public Box() {}
	
	public void put(Object item) {
		this.item = item;
		
	}
	
	public Object get() {
		return item;
		
	}
}
