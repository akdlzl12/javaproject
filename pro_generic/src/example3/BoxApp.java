package example3;

public class BoxApp {
	public static void main(String[] args) {
		Box<String> name = new Box<String>();
		System.out.println("name box의 크기: " + name.size());
		name.add("홍길동");
		name.add("강감찬");
		name.add("안중근");
		name.add("윤봉길");
		name.add("김구");
		name.add("유관순");
		name.add("이순신");
		name.add("을지문덕");
		name.add("광개도대왕");
		name.add("세종대왕");
		name.add("정약용");
		name.add("이이");
		name.add("이황");
		name.add("신사임당");
		name.add("김좌진");
		name.add("계백");
		name.add("김유신");
		name.add("허준");
		
		System.out.println("name box의 크기: " + name.size());
		
		Box<Computer> products = new Box<Computer>();
		products.add(new Computer(1, "삼성컴퓨터", "삼성", 1000000));
		products.add(new Computer(1, "삼성컴퓨터", "삼성", 1000000));
		products.add(new Computer(1, "삼성컴퓨터", "삼성", 1000000));
		products.add(new Computer(1, "삼성컴퓨터", "삼성", 1000000));
		products.add(new Computer(1, "삼성컴퓨터", "삼성", 1000000));
		
		Box<Customer> customer = new Box<Customer>();
		customer.add(new Customer("hong", "홍길동", "010-1111-1111"));
		customer.add(new Customer("hong", "홍길동", "010-1111-1111"));
		customer.add(new Customer("hong", "홍길동", "010-1111-1111"));
		customer.add(new Customer("hong", "홍길동", "010-1111-1111"));
		customer.add(new Customer("hong", "홍길동", "010-1111-1111"));
		
		Customer c1 = customer.get(0);
		System.out.println(c1.getId());
	}
}
