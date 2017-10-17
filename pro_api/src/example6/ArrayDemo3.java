package example6;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo3 {
	public static void main(String[] args) {
		Student[] arr1 = {new Student(10, "길동", 300),
				  new Student(2, "유신", 100),
				  new Student(6, "감찬", 200)
				  };

		Student[] arr2 = {new Student(1000000, "Andrew", 700),
		  		  new Student(20000, "Robert", 800),
		  		  new Student(60000, "Jane", 400)
		  		  };
		
		// 성적을 기준으로 오름차순 정렬하기
		Comparator<Student> comparator = new Comparator<Student>() {
			
			@Override
			public int compare(Student a, Student b) {
				// TODO Auto-generated method stub
				return a.getScore() - b.getScore();
			}
		};
		
		// 이름을 기준으로 오름차순 정렬하기
		Comparator<Student> comparatorName = new Comparator<Student>() {
			public int compare(Student a, Student b) {
				return a.getName().compareTo(b.getName());
			}
		};
		
		Arrays.sort(arr1, comparator);
		Arrays.sort(arr2, comparatorName);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
			
	
			
			
	
	}
	
	public static class ScoreComparaotor implements Comparator<Student> {
		public int compare(Student a, Student b) {
			return a.getScore() - b.getScore();			
		}
		
	}
}
