package example4;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException {
		/*
		 * 날짜형식의 문자열로부터 Date객체 생성하기
		 * SimpleDateFormat의 parse(String sorce) 메소드는  지정된 날짜형식의 문자열을 해석해서 Date객체를 생성한다.
		 * 문자열을 해석하기 위해서 SimpleDateFormat객체를 생성할 때 해석할 문자열의 패턴을 지정해야 한다.
		 * */
		String text = "1991.12.06";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.parse(text));
	}
}
