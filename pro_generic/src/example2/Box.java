package example2;

public class Box<T> {
	private T item;
	
	public Box() {}
	
	public void put(T item) {
		this.item = item;
		
	}
	
	public T get() {
		return item;
	}
}
