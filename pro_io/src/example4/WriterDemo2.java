package example4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriterDemo2 {
	public static void main(String[] args) throws IOException {
		
		//
		PrintWriter writer = new PrintWriter(new FileWriter("C:\\Temp\\sample5"), true);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		String name = sc.next();
		writer.println(name);
		
		
		System.out.print("전화번호:");
		String phone = sc.next();
		writer.println(phone);
		
		
		writer.close();
		sc.close();
	}
}
