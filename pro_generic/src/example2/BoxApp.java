package example2;

public class BoxApp {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.put("홍길동");
		System.out.println(box1.get());
	}
}
