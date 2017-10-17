package example7;

public class Course<T> {
	private String name;
	private T[] studets;
	private int position;
	
	public Course(String name, int calacity) {
		this.name = name;
		studets = (T[])(new Object[calacity]);
	}
	
	public String getName() {
		return name;
	}
	
	public void add(T t) {
		studets[position++] = t;
	}

}
