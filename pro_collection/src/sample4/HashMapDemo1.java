package sample4;

import java.util.HashMap;
import java.util.Set;

class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("이순신", 30);
		map.put("김유신", 50);
		map.put("이이", 70);
		map.put("이황", 80);
		
		
		System.out.println(map.get("김유신"));
		System.out.println(map.toString());
		System.out.println(map.size());
		System.out.println(map.containsKey("이이"));
		Set<String> keys = map.keySet();
		for (String string : keys) {
			int value = map.get(string);
			System.out.println("[" + keys + "]" + value);
		}
		map.remove("이이");
		System.out.println(map.toString());
		System.out.println(map.size());
	}
}
