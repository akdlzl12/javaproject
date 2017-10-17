package example3;

public class Box<T > {
	private int size = 10;
	Object[] items = new Object[size];
	private int position;
	
	public Box() {}
	
	public Box(int size) {
		this.size = size;
	}
	
	public void add(T item) {
		if(position == size) {
			Object[] array = new Object[size + 10];
			System.arraycopy(items, 0, array, 0, items.length);
			items = array;
			size = items.length;
		}
		items[position++] = item;
	}
	
	public T get(int index) {
		if(index < 0 || index > size -1) {
			throw new IndexOutOfBoundsException("유효한 인덱스 범위가 아닙니다.");
		}
		return (T) items[index];
	}
	
	public int size() {
		return size;
	}
	
	
}
