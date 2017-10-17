package sample4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		/*
		 *  책정보 담는 방법
		 *  1. Book클래스 정의
		 *  	public class Book{
		 *  		private int no;
		 *  		private String title;
		 *  	}
		 *  	Book book = new Book(10, "수도원 기행", "공지영", "청비", 15000);
		 *  	
		 *  	1) book객체를 여러 개 담을 수 있는 ArrayList객체 생성
		 *  		ArrayList<Book> bookList = new ArrayList<>();
		 *  
		 *  2. Map을 활용한다.
		 *  	HashMap<String, Object> book = new HashMap<>();
		 *  	book.put("no", 10);
		 *  	book.put("title", "수도원 기행");
		 *  	book.put("author", "공지영");
		 *  
		 *  	1) 책정보 한권을 담은 Map객체를 여러개 담을 수 있는 ArrayList객체 생성하기
		 *  		ArrayList<HashMap<String, Object>> bookList = new ArrayList<>();
		 * */
		
		List<Map<String, Object>> books = new ArrayList<>();
		
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("no", 11);
		map1.put("title", "이것이 자바다");
		map1.put("price", 35000);
		
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("no", 12);
		map2.put("title", "자바의 정석");
		map2.put("price", 25000);
		
		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("no", 13);
		map3.put("title", "안드로이드의 모든것");
		map3.put("price", 28000);
		
		books.add(map1);
		books.add(map2);
		books.add(map3);
		
		for (Map<String, Object> map : books) {
			int no = (Integer) map.get("no");
			String title = (String) map.get("title");
			int price = (Integer) map.get("price");
			
			System.out.println(no + "\t" + title + "\t" + price);
					
		}
		 
		
	}
}
