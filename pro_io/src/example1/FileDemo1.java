package example1;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
		File f = new File("C:/java_workspace", "ArrayDemo1.java");
		
		System.out.println("파일이 존재하는가? " + f.exists());
		
		System.out.println("이름: " + f.getName());
		
		System.out.println("경로: " + f.getParent());
		
		System.out.println("경로: " + f.getAbsolutePath());
		
		System.out.println("크기: " + f.length());
	}
}
