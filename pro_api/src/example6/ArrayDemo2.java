package example6;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo2 {
	public static void main(String[] args) {
		Student[] students = {new Student(10, "홍길동", 100),
							  new Student(13, "김유신", 40),
							  new Student(5, "강감찬", 60),
							  new Student(23, "이순신", 80),
							  new Student(61, "김구", 10),
							  new Student(32, "안중근", 50),
							  new Student(27, "권률", 90)
							  }; 
		
		// Arrays의 sort(Object[] arr, Compatator c)은 Compatator 인터페이스의 compare()메서드에 구현된 내용을 참조해서 배열을 정렬한다.
		Arrays.sort(students, new Comparator<Student>() {
			public int compare(Student a, Student b) {
				int value = b.getScore() - a.getScore();
				if(value == 0) {
					return a.getNo() - b.getNo();
					
				}else {
					return value;
					
				}
				
			}
			
		});
		System.out.println(Arrays.toString(students));
		
	}
}
