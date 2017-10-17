package example2;

import java.util.StringTokenizer;

public class StringTokenizerDemo2 {
	public static void main(String[] args) {
		//String text1 = "홍길동:남:010-0000-1111:hong@gmail.com";
		String text2 = "이순신:남::lee@gmail.com";
		
		String[] arr = text2.split(":");
		StringTokenizer st = new StringTokenizer(text2,":");
		
		for(int a = 0; a < arr.length; a++) {
				System.out.println(arr[a]);
			
		}
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
		
		
	}
}
