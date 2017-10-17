package example7;

public class CourseManagement {
	public void registerCourse(Course<?> c) {
		
	}
	
	public void registerCourseForWorkerOrPerson(Course<? super Worker> c) {
		
	}
	
	public void registerCourseForStudent(Course<? extends Student> s) {
		
	}
}
