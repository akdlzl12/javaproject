package example1;

public class ObjectDemo2 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 23);
		Person p2 = new Person("김유신", 31);
		
		System.out.println(p1);				// 참조변수의 값을 출력하려고 하면 toString()의 실행결과가 출력된다. 
		System.out.println(p1.toString());
		System.out.println(p2);
		
		int hashCode1 = p1.hashCode();
		int hashCode2 = p2.hashCode();
		System.out.println("해시코드: " + hashCode1);
		System.out.println("해시코드: " + hashCode2);
	

	}

}
