package example2;

public class StringDemo2 {
	public static void main(String[] args) {
		String text = "gildong@gamil.com";
		
		// 부분문자열 얻기
		// String substring(int begin) : 지정된 시작위치부터 문자열의 끝까지 얻기
		// String substring(int begin, int end) : 지정된 시작위치와 끝위치 사이의 문자열 얻기
		String subText1 = text.substring(8);
		System.out.println("begin을 8로 지정한 경우 " + subText1);
		
		String subText2 = text.substring(8, 13);
		System.out.println(subText2);
		
		String subText3 = text.substring(0, text.indexOf("@"));
		System.out.println("0부터 7전까지 사이의 문자열 얻기: " + subText3);
		
		String text2 = "홍길동,전자공학과,2,남자,30,A,68,182.6";
		// 지정된 구분문자로 문자열 조각내기
		// String[] split(String 구분문자)
		String[] items = text2.split(",");
		for(int a = 0; a < items.length; a++) {
			System.out.println(items[a]);
		}
		
		// 문자열에서 지정한 내용을 다른 내용으로 바꾼 새로운 문자열 얻기
		// String replace(String oldText, String newText)		: 변경대상내용을 찾아서 새로운 내용으로 변경된 문자열을 반환한다.
		// String replaceAll(String regPattern, String newText) : 정규표현식의 패턴과 일치하는 내용을 찾아서 새로운 내용으로 변경된 문자열을 반환한다.
		String text3 = "대한사람 대한으로 기리 보전하세";
		String modifiedText = text3.replace("대한", "한국");
		System.out.println(modifiedText);
		
		
		
	}
}
