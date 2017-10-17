package example1;

public class ObjactDemo8 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// Class.forName("클래스 전체 이름");
		// example1.Car 클래스를 메모리에 로딩시키기 설계도 정보가 들어있는 class객체를 반환한다.
		Class clazz = Class.forName("example1.Car");
		
		// newInstance()는 설계도를 사용해서 객체를 생성한다.
		Car car = (Car) clazz.newInstance();
		
		car.setName("제네시스");
		car.setCompany("현대자동차");
		car.setYear(2017);
		
		System.out.println(car);
	}
}
