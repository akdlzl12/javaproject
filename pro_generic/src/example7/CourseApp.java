package example7;

public class CourseApp {
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정", 10);
		Course<Worker> workerCourse = new Course<>("직장인 과정", 10);
		Course<Student> studentCourse = new Course<>("학생 과정", 10);
		Course<CollegeStudent> collCourse = new Course<>("대학생 과정", 10);
		
		CourseManagement mgr = new CourseManagement();
		mgr.registerCourse(personCourse);
		mgr.registerCourse(workerCourse);
		mgr.registerCourse(studentCourse);
		mgr.registerCourse(collCourse);
		
	}
}
