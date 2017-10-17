package generic;

public class SchoolApp {
	public static void main(String[] args) {
		SchoolManagement manager = new SchoolManagement();
		Subject<Person> subjectPerson = new Subject<Person>(1, "일반과정 수업");	// 일반과정수업 생성
		
		Person 홍길동 = new Person(1, "홍길동");	// 홍길동 객체생성
		Person 강감찬 = new Person(2, "강감찬");	// 강감찬 객체생성
		Person 김유신 = new Person(3, "김유신");	// 김유신 객체생성
		subjectPerson.add(홍길동);				// 홍길동이 수강신청
		subjectPerson.add(강감찬);				// 강감찬이 수강신청 
		subjectPerson.add(김유신);				// 김유신이 수강신청
		
		Subject<Worker> subjectWorker = new Subject<Worker>(2, "직장인 교양수업");	// 직장인 교양수업
		subjectWorker.add(new Worker(1, "김대리"));
		subjectWorker.add(new Worker(2, "오과장"));
		subjectWorker.add(new Worker(3, "조차장"));
		
		Subject<Student> subjectStudent = new Subject<Student>(3, "학셍 전필수업");	// 학생수업 객체
		subjectStudent.add(new Student(1, "이학생"));
		subjectStudent.add(new HighStudent(2, "오학생"));
		subjectStudent.add(new Student(3, "김학생"));
		
		
		
		
		manager.registerCourse(subjectPerson);	// 공학수학 코스 등록
		manager.registerCourserForWorker(subjectWorker);	// 공학수학 코스 등록
		manager.registerCourserForStudent(subjectStudent);	// 공학수학 코스 등록
		
		
		
	}
}
