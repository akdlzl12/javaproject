package example4;

import java.util.Date;

public class CommonUtilsDemo {
public static void main(String[] args) {
	int number = 12341325;
	String str1 = CommonUtils.numberWithComma(number);
	System.out.println(str1);
	
	Date now = new Date();
	
	String str2 = CommonUtils.yyyyMMdd(now);
	System.out.println(str2);
	
	String str3 = CommonUtils.yyyyMMdd2(now);
	System.out.println(str3);
}
}
