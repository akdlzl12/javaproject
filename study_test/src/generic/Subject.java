package generic;

import java.util.ArrayList;

/**
 * 과목 클래스
 * @author JHTA
 *
 * @param <T>
 */
public class Subject<T extends Person> {
	
	private int no;
	private String name;
	ArrayList<T> personList;	// 과목을 듣는 학생 배열리스트
	
	
	/**
	 * 생성자, new 키워드 이용할 때 호출됨
	 * 목적 : 객체 초기화
	 */
	public Subject(int no, String name) {
		this.no = no;
		this.name = name;
		this.personList = new ArrayList<T>();	// 학생 배열리스트 초기화
	}
	
	/**
	 * 과목에 학생추가
	 * @param t
	 */
	public void add(T t) {
		this.personList.add(t);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Subject\n");
		sb.append("NO\t"+this.no+"\n");
		sb.append("NAME\t"+this.name+"\n");
		for(T t : this.personList) {
			sb.append(t.toString()+"\n");
		}
		return sb.toString();
		
	}
}
