package example3;

public class Quizz3 {
	
	public static void hideNumber(String phone) {
		// 전화번호의 끝 4자리를 남기고 나머지 번호는 "*"로 표시하기
		String[] arr = phone.split("-");
		String star = "";
		for(int a = 0; a < arr.length-1; a++) {		
			star = "";
			for(int b = 0; b < arr[a].length(); b++) {
				star += "*";
			}
			arr[a] = star + "-";
			
		}
		
		for(int c = 0; c < arr.length; c++) {
			System.out.print(arr[c]);
				
		}
			System.out.println();
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		//전화번호 가리기
		hideNumber("010-1110-1111");
		hideNumber("02-111-4567");
	}
}
