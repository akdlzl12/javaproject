package example2;

public class StringBuilderDemo1 {
	public static void main(String[] args) {
		
		/*
		  	StringBuoilder와 StringBuffer
		  		- 내부 저장소를 가지고 있는 객체
		  		- append()메소드를 사용해서 내버저장소에 여러 데이터를 추가할 수 있다.
		  		- tostring()메소드를 사용해서 내부저장소의 값을 문자열로 꺼낼  수 있다.
		  	 	- +연산자를 사용함으로써 문자열객체가 불필요하게 생성되는 것을 방지할 목적으로 사용한다.
		*/
		
		String name = "홍길동";
		int kor = 100;
		int eng = 82;
		int math = 70;
		
		StringBuilder sb = new StringBuilder();
		sb.append("이름 ");
		sb.append(name);
		sb.append(" 국어점수= ");
		sb.append(kor);
		sb.append(" 영어점수= ");
		sb.append(eng);
		sb.append(" 수학점수= ");
		sb.append(math);
		
		System.out.println(sb.toString());
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("국어점수=").append(kor).append(",");
		buffer.append("영어점수=").append(eng).append(",");
		buffer.append("수학점수=").append(math).append(",");
		
		System.out.println(buffer.toString());
		
	}
}
