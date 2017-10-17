package example1;

public class BoxApp {
	public static void main(String[] args) {
		// String을 담기위해서  Box1객체 생성
		Box box1 = new Box();
		box1.put(new String("홍길동"));
		// 꺼낼때 마다 타입형변환을 해야 한다.
		String str = (String) box1.get();
		System.out.println(str);
		
		// String이 아닌 다른 타입의 객체가 저장되는 것을 막을 수 없다.
		Box box2 = new Box();
		box2.put(new Integer(3));
		int value = (int) box2.get();
		System.out.println(value);
		
		
		
		
	}
}
