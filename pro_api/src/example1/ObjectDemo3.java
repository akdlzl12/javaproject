package example1;

public class ObjectDemo3 {
	public static void main(String[] args) {
		Product p1 = new Product(100, "iphone7", "apple", 950000);
		Product p2 = new Product(100, "iphone7", "apple", 950000);
		
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
	}
}
