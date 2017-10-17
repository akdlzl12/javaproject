package example1;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo3 {
	public static void main(String[] args) {
		File f = new File("C:\\java_workspace\\oop1");
		
//		String[] fileNames = f.list(new FilenameFilter() {
//			
//			@Override
//			public boolean accept(File dir, String name) {
//				
//				return name.endsWith("java");
//			}
//		});
		
		String[] fileNames2 = f.list((dir, name) -> name.endsWith("java"));
		
		for (String string : fileNames2) {
			System.out.println(string);
		}
	}
}
