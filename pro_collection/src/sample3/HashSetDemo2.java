package sample3;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Integer> scores = new HashSet<>();
		scores.add(new Integer(23));
		scores.add(50);
		scores.add(50);
		scores.add(new Integer(45));
		
		System.out.println(scores);
	}
}
