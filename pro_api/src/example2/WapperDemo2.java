package example2;

public class WapperDemo2 {
	public static void main(String[] args) {
		// 오토박싱/언박싱
		// 기본자료형과 대응되는 Wrapper객체간의 전환
		// Java5부터 기용되는 기능이다.
		
		// 오토박싱
		Integer a = 10;
		Integer b = new Integer(10);
		System.out.println(a + b);		// a.intValue() + b.intValue()
		
		// 오토언박싱
		int c = a;
		int d = b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c+d);
	}
}
