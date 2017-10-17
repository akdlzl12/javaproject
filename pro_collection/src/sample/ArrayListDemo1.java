package sample;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		// 배열과 ArrayList
		String[] nameArr = new String[10];
		nameArr[0] = "홍길동";
		nameArr[1] = "강감찬";
		
//		for(String n : nameArr) {
//			System.out.println(n);
//			
//		}
		
		ArrayList<String> names = new ArrayList<>();
		names.add("왕건");
		names.add("궁예");
		names.add("견원");
		
		ArrayList<String> namesList = new ArrayList<>();
		namesList.add("홍길동");
		namesList.add("강감찬");
		namesList.add("이순신");
		namesList.add("김유신");
		namesList.add("유관순");
		namesList.add("유관순");	// 동일한 객체를 저장할 수 있다.
		namesList.add("김구");
		namesList.addAll(names);	// 다른 콜렉션을 저장할 수 있다.
		
		
		
		// ArrayList에 저장된 요소가 없을 때 true를 반환한다.
		boolean empty = namesList.isEmpty();
		System.out.println(empty);
		
		// ArrayList에 지정된 요소가 존재하는지 여부를 반환한다.
		boolean exist = namesList.contains("김유신");
		System.out.println(exist);
		
		// ArrayList에 저장된 모든 요소 삭제하기
		namesList.clear();

		
//		for(String n : namesList) {
//			System.out.println(n);
//		}
	}
}
