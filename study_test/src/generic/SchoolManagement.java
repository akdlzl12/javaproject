package generic;

public class SchoolManagement {
	/**
	 * Person, Student, Worker, HighStudent 4개가 들어오도록 허용
	 * @param p
	 */
	public void registerCourse(Subject<? extends Person> subject) {
		System.out.println("일반과정 등록합니다");
		System.out.println(subject.toString());
		System.out.println("일반과정 등록 완료했습니다");
		System.out.println("------------------------------");
	}
	
	
	/**
	 * 일반 직장인 , 일반인 과정
	 */
	public void registerCourserForWorker(Subject<? super Worker> subject) {
		System.out.println("직장인과정 등록합니다");
		System.out.println(subject.toString());
		System.out.println("직장인과정 등록 완료했습니다");
		System.out.println("------------------------------");
	}
	
	/**
	 * 학생과정
	 */
	public void registerCourserForStudent(Subject<? extends Student> subject) {
		System.out.println("학생과정 등록합니다");
		System.out.println(subject.toString());
		System.out.println("학생과정 등록 완료했습니다");
		System.out.println("------------------------------");
	}
	
}
