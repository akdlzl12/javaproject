package example4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo1 {
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("C:\\Temp\\sample4.txt");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		String name = sc.next();
		writer.write(name);
		writer.flush();
		
		System.out.print("전화번호:");
		String phone = sc.next();
		writer.write(phone);
		writer.flush();
		
		writer.close();
		sc.close();
		
	}
}
