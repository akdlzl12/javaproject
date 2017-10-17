package example1;


public class Person implements Cloneable{
	private String name;
	private int age;
	private Car myCar;
	
	public Person() {}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public Car getMyCar() {
		return myCar;
	}
	
	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Object의 clone()을 이용해서 Person객체를 앝은 복제한다.
		Person copyPerson = (Person) super.clone();
		
		Car copyCar = new Car();
		
		copyCar.setName(myCar.getName());
		copyCar.setCompany(myCar.getCompany());
		copyCar.setYear(myCar.getYear());
		
		copyPerson.setMyCar(copyCar);
		
		return copyPerson;
	}
	
	public Person getPerson() throws CloneNotSupportedException {
		
		return (Person)clone();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", myCar=" + myCar + "]";
	}
		
	
}
