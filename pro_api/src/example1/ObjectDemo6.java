package example1;

public class ObjectDemo6 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person original = new Person("홍길동", 23);
		Car car = new Car("제네시스", "현대자동차", 2017);
		original.setMyCar(car);
		
		Person copy = original.getPerson();
		
		System.out.println("원본: " + original);
		System.out.println("복사본: " + copy);
		
		// 복사본 조작하기
		copy.setAge(50);
		copy.getMyCar().setYear(2014);
		
		System.out.println("원본: " + original);
		System.out.println("복사본: " + copy);


	}

}
