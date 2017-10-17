package kr.co.jhta.school.app;

import java.sql.SQLException;

import kr.co.jhta.school.service.StudentService;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Registration;
import kr.co.jhta.school.vo.Student;

public class StudentServiceApp {
	public static void main(String[] args) throws SQLException {
		StudentService studentService = new StudentService();
		Registration registration = new Registration();
		Course course = new Course();
		Student student = new Student();
		
		course.setNo(1000);
		student.setNo(1700001);
		
		registration.setStudent(student);
		registration.setCourse(course);
		studentService.requestCourse(registration);
	}
}
