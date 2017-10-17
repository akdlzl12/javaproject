package example2;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String text = "this is a text";
		StringTokenizer token = new StringTokenizer(text);
		
		while (token.hasMoreTokens()) {
			String token1 = token.nextToken();
			System.out.println(token1);
			
		}
	}
}
