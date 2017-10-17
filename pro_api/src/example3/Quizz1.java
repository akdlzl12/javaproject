package example3;

import java.util.StringTokenizer;

public class Quizz1 {
	public static void main(String[] args) {
		// "김"씨성을 가진 사용자는 모두 몇명인가?
		String text = "김유신,강감찬,이순신,김시민,김좌진,홍길동,을지문덕,윤간,김시습";
		int count = 0;
		String[] arr = text.split(",");
		for(int a = 0; a < arr.length; a++) {
			if(arr[a].substring(0, 1).equals("김")) {
				
				count++;
				
			}
			
		}
		System.out.println("김씨성을 가진 사람은 " + count + " 명입니다.");
		
	}
}
