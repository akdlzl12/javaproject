package example4;

import java.util.Calendar;
import java.util.Date;

public class DateDemo1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		// 1970년0시0분0초부터 현재 시간까지를 밀리초단위로 환산한 값 얻기
		long time = now.getTime();
		System.out.println(time);
		
		now.setTime(10);
		System.out.println(now);
		
		Calendar now1 = Calendar.getInstance();
		
		// 지정된 날짜로 Calender객체를 변경하기
		now1.set(1991, 11, 6);
		
		// Calender객체에서 지정된 필드에 해당하는 값 조회하기
		int year = now1.get(Calendar.YEAR);
		int month = now1.get(Calendar.MONTH)+1;
		int day = now1.get(Calendar.DAY_OF_MONTH);
		int hour = now1.get(Calendar.HOUR);
		int minute = now1.get(Calendar.MINUTE);
		int second = now1.get(Calendar.SECOND);
		
		System.out.println("년" + year);
		System.out.println("월" + month);
		System.out.println("일" + day);
		System.out.println("시" + hour);
		System.out.println("분" + minute);
		System.out.println("초" + second);
		
		Date date = now1.getTime();
		System.out.println(date);
	}
}
