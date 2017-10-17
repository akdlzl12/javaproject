package example5;

import java.util.Arrays;

public class SystemDemo2 {
	public static void main(String[] args) {
		String[] name = {"홍길동", "이순신", "강감찬", "김유신", };
		String[] users = new String[10];
		
		/*
		 * System.arraycopy(Objext[] src,		// 원본배열 
		 * 					int srcPos, 		// 원본배열에서 복사 시작 위치
		 * 					Object[] dest, 		// 목적지 배열
		 * 					int destPos, 		// 목적기 배열에서 복사시작 위치
		 * 					int Length)			// 복사할 원소의 갯수
		 * */
		
		System.arraycopy(name, 0, users, 2, 4);
		System.out.println(Arrays.toString(users));
	}
}
