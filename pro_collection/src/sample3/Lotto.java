package sample3;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		Random random = new Random();
		
		while(true) {
			int number = random.nextInt(45)+1;
			lotto.add(number);
			
			if(lotto.size() == 7) {
				break;
			}
		}
		System.out.println(lotto.toString());
	}
}
