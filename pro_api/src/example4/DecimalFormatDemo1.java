package example4;

import java.text.DecimalFormat;

public class DecimalFormatDemo1 {
	public static void main(String[] args) {
		/*
		 * 숫자를 세자리마다 ,를 붙여서 표시하기
		 * 1. DecimalFormat객체를 생성 <- 패턴을 지정
		 * 2. DecomalFormat의 format(숫자)를 실행해서 지정된 숫자를 특정패턴의 문자열로 변환한다.
		 * */
		double number = 10000000.1254;
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		
		String formatNumber = df1.format(number);
		System.out.println(formatNumber);
		
		DecimalFormat df2 = new DecimalFormat("0,000.00");
		String formatNumber2 = df2.format(number);
		System.out.println(formatNumber2);
	}
}
