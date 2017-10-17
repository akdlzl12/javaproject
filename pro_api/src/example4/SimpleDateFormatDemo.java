package example4;

import java.text.SimpleDateFormat;
import java.util.Date;



public class SimpleDateFormatDemo {
	
	public static void formattingDate(String pattern) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String formateDate = sdf.format(now);
		System.out.println(formateDate);
		
	}
	
	public static void main(String[] args) {
		formattingDate("yyyy.M.d");
		formattingDate("yyyy.MM.dd");
		formattingDate("yyyy.MM.dd E" );
		formattingDate("yyyy.MM.dd EEEE" );
		formattingDate("yyyy.MM.dd EEEE a");
		formattingDate("a hh:mm:ss");
		formattingDate("a HH:mm:ss");
		formattingDate("yyyy년 M월 d일 EEEE a HH:mm:ss");
		
	
	}
}
