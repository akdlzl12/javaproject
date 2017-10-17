package example1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo4 {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		File f = new File("C:\\java_workspace\\oop1");
		File[] files = f.listFiles((dir, name) -> name.endsWith("java"));
		for (File file : files) {
			Date date = new Date(file.lastModified());
			System.out.println(file.getName() + "\t" + file.length() + "\t" + sdf.format(date));
		}
	}
}
