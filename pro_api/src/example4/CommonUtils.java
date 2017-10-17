package example4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {
	private static DecimalFormat df1 = new DecimalFormat("#,###");
	private static SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyyMMdd");
	private static SimpleDateFormat yyyyMMdd2 = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String numberWithComma(int number) {
		return df1.format(number);
		
	}
	
	public static String yyyyMMdd(Date date) {
		return yyyyMMdd.format(date);
		
	}
	
	public static String yyyyMMdd2(Date date) {
		return yyyyMMdd2.format(date);
		
	}
}
