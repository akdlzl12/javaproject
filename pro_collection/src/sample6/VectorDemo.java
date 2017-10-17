package sample6;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> names = new Vector<>();
		
		names.add("홍길동");
		names.addElement("김유신");
		names.add("이순신");
		names.add("강감찬");
		
		System.out.println("저장된 갯수: " + names.size());
		System.out.println("비어있는가: " + names.isEmpty());
		
		for (String string : names) {
			System.out.println(string);
		}
		
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
