package example1;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:/Temp/test");
		f.mkdir();
		f.delete();
		
		File f1 = new File("c:/Temp/a/b/c");
		f1.mkdirs();
		f1.delete();
		
		File f2 = new File("c:/Temp/abc.txt");
		f2.createNewFile();
	}
}
