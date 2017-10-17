package example1;


public class Score implements Cloneable{
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score() {}
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 현재 Score객체의 복제본을 제공하는 메소드
	public Score cloneScore() {
		// 복제된 Score 객체를 저장할 변수
		Score cloneObject = null;
		try {
			// Object의 clone()메소드를 실행하면 현재 객체의 복제본이 만들어진다.
			// Object의 clone()메소드는 복제된 객체에 대한 Object타입의 참조값을 반환하기 때문에 현재 객체타입으로 형변환해야 한다.
			cloneObject = (Score)clone();
		} catch (CloneNotSupportedException e) {
			
		}
		
		// 복제된 객체를 제공한다.
			return cloneObject;
		
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	

}
