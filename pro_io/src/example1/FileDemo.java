package example1;

import java.io.File;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) {
		
		// c:/ 루트디렉토리의 정보를 담고 있는 file객체 생성하기
		File f = new File("C:/");
		
		System.out.println("파일인가? " + f.isFile());
		System.out.println("디렉토리인가? " + f.isDirectory());
		
		System.out.println("크기: " + f.length());
		
		System.out.println("이름: " + f.getName());
		
		System.out.println("경로: " + f.getAbsolutePath());
		
		System.out.println("최종 수정일: " + new Date(f.lastModified()));
		
		String[] list = f.list();
		for (String string : list) {
			System.out.println(string);
		}
	}
}
