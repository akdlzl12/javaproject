package example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:/Temp/sample.txt");
		
		StringBuffer sb = new StringBuffer();
		int value = 0;
		while((value = fis.read()) != -1) {
			sb.append((char) value);
		}
		
		fis.close();
		
		String text = sb.toString();
		System.out.println("파일내용: " + text);
	
	}
}
