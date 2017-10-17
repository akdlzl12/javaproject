package example2;

public class WapperDemo3 {
	public static void main(String[] args) {
		// Integer, Double의 주요 API
		// 상수		: MIN_VALUE, MAX_VALUE
		// 생성자		: new Integer(int), new Integer(String), new Double(int), new Double(String),
		// 메소드		: byteValue(), intValue(), longValue(), doubleValue(), ....
		//			  min(int, int), max(int, int), min(double, double), max(double, double)
		// 정적메소드	: int Integer.pareInt(String text), double Double.parseDouble(String text)
		
		//Integer의 주요API
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		String text1 = "10";
		String text2 = "3.14";
		String text3 = "10000000000000000";
		
		int number1 = Integer.parseInt(text1); 
		double number2 = Double.parseDouble(text2);
		long number3 = Long.parseLong(text3);
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		String text4 = "100";
		int number4 = Integer.parseInt(text4, 10); 
		int number5 = Integer.parseInt(text4, 2);
		System.out.println(number4);
		System.out.println(number5);
		
		
	}
}
