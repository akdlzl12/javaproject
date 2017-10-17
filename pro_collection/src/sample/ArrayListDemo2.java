package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 
		ArrayList<String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("김유신");
		names.add("강감찬");
		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		// Iterator
		Iterator<String> it= names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
		// Java8
		names.stream();
		
	}
}
