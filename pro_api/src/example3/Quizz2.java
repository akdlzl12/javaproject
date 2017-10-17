package example3;

public class Quizz2 {
	public static void printMiddle(String text){
		// 글자수가 홀수일때는 가운데 글자하나
		// 글자수가 짝수일때는 가운데를 기준으로 좌우에 한 글자를 출력한다.
		if(text.length()%2 == 0) {
			System.out.println(text.substring(text.length()/2-1, text.length()/2+1));
			
		}else {
			System.out.println(text.substring(text.length()/2, text.length()/2+1));
			
		}
		
	}
	
	public static void main(String[] args) {
		printMiddle("power"); 		// w
		printMiddle("program");		// g
		printMiddle("full");		// ul
		
	}
}
