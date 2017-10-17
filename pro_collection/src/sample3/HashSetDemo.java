package sample3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		names.add("홍길동");
		names.add("홍길동1");
		names.add("홍길동2");
		names.add("홍길동3");
		names.add("홍길동4");
		names.add("홍길동5");
		names.add("홍길동6");
		
//		for (String string : names) {
//			System.out.println(string);
//		}
		
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
	}
}
