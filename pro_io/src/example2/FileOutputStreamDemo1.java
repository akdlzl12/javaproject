package example2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fis = new FileOutputStream("C:\\Temp\\sample.txt", true);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.next();
		
		System.out.println("전화번호: ");
		String phone = sc.next();
		
		System.out.println("이메일: ");
		String email = sc.next();
		
		String data = name + ", " + phone + ", " + email + System.lineSeparator();
		byte[] bytes = data.getBytes();
		fis.write(bytes);
		
		
		fis.close();
	}
}
