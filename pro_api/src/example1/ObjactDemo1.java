package example1;

public class ObjactDemo1 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 23);
		Person p2 = new Person("김유신", 31);
		Person p3 = p1;
		Person p4 = new Person("홍길동", 23);
		
		System.out.println(p1.equals(p3));	// 같은 객체여서 T
		System.out.println(p1.equals(p4));	// 같은값을 가지고 있어도 다른 객체여서 F
	}
}
