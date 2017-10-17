package example2;

public class StringDemo1 {

	public static void main(String[] args) {
		String str = "2017,1,홍길동,국어,영어,수학,영어회화";
		
		// 문자열의 길이 조회하기: int length()
		int textLength = str.length();
		System.out.println("문자열의 길이: " + textLength);
		
		// 특정위치의 문자 조회하기: charAt(int position)
		System.out.println(str.charAt(5));
		
		// 지정된 문자의 등장위치를 조회하기: int indexOf(String str), int lastIndexOf(String str)
		
		int pos1 = str.indexOf("영어");
		System.out.println("영어라는 단어의 첫번째 등장위치 " + pos1);
		int pos2 = str.lastIndexOf("영어");
		System.out.println("영어라는 글자가 마지막으로 등장하는 위치 " + pos2);
		int pos3 = str.indexOf("도덕");
		System.out.println("도덕이라는 글자가 처음으로 등장하는 위치 " + pos3);
		
		// 지정된 글자를 포함하고 있는지 여부를 조회하기: boolean contains(CharSequence str)
		boolean flag1 = str.contains("영어");
		System.out.println("영어라는 글자를 포함하고 있는지: " + flag1);
		boolean flag2 = str.contains("물리");
		System.out.println("물리라는 글자를 포함하고 있는지: " + flag2);
		
		// 지정된 글자로 시작하는지/끝나는지 알아내기
		String url = "http://www.daum.net";
		boolean flag3 = url.startsWith("http://");
		System.out.println("http://로 시작하는 문자열인가? " + flag3);
		
		String filename = "나만 안되는 연애.mp3";
		boolean flag4 = filename.endsWith("mp3");
		System.out.println("mp3라는 글자로 끝나는가? " + flag4);
		
		// 문자열이 비어있는지 여부를 알아내기j
		String text = "";
		boolean flag5 = text.isEmpty();
		System.out.println("문자열이 비어있는가? " + flag5);
		
		// 문자열의 좌/우에 있는 의미없는 공백을 제거한 새로운 문자열 얻기
		String text2 = "       hello                word              ";
		String trimedText = text2.trim();
		System.out.println("좌우의 공백 없에버리기 " + trimedText);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
