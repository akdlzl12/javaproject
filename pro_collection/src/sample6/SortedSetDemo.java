package sample6;

import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(12);
		set.add(1);
		set.add(88);
		set.add(65);
		set.add(34);
		set.add(11);
		set.add(39);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}
