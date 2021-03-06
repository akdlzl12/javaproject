package example2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo2 {
	public static void main(String[] args) throws IOException {
		long beginTime = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("C:\\Temp\\javafx-src.zip");
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\javafx-src3.zip");
		
		byte[] buf = new byte[1024*8];
		int value = 0;
		while((value = fis.read(buf)) != -1) {
			fos.write(buf, 0 , value);
		}
		
		fis.close();
		fos.close();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("소요시간: " + (endTime - beginTime) + "밀리초");
	}
}
