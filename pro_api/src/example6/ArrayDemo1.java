package example6;

import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] numbers = {23,14,23,43,34,78,5};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		String[] names = {"이순신", "김유신", "강감찬", "홍길동", "유관순", "김구", };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}
}
