package kr.co.jhta.school.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.CourseDao;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Registration;
import kr.co.jhta.school.vo.Student;

public class CourseApp {
	public static void main(String[] args) throws SQLException {
	
		CourseDao courseDao = new CourseDao();
		
		// 모든 개설과정 조회
		/*List<Course> courseArr = courseDao.getAllCourses();
		for (Course course : courseArr) {
			System.out.println(course.getNo());
			System.out.println(course.getRoom());
			System.out.println(course.getQuota());
			System.out.println(course.getRegNum());
			System.out.println(course.getSubject().getNo());
			System.out.println(course.getProfessor().getNo());
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		// 지정된 부서의 개설과정 조회
		List<Course> courseArr2 = courseDao.getCoursesByDept(1);
		for (Course course : courseArr2) {
			System.out.println(course.getNo());
			System.out.println(course.getRoom());
			System.out.println(course.getQuota());
			System.out.println(course.getRegNum());
			System.out.println(course.getSubject().getNo());
			System.out.println(course.getProfessor().getNo());
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		// 지정된교수번호의 교수가 개설한 개설과정 조회
		List<Course> courseArr3 = courseDao.getCoursesByProfessor(11001);
		for (Course course : courseArr3) {
			System.out.println(course.getNo());
			System.out.println(course.getRoom());
			System.out.println(course.getQuota());
			System.out.println(course.getRegNum());
			System.out.println(course.getSubject().getNo());
			System.out.println(course.getProfessor().getNo());
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		Course course = courseDao.getCourse(1000);
			System.out.println(course.getNo());
			System.out.println(course.getRoom());
			System.out.println(course.getQuota());
			System.out.println(course.getRegNum());
			System.out.println(course.getSubject().getNo());
			System.out.println(course.getProfessor().getNo());*/
			
		System.out.println("------------------------------------------------------------------------");
		
		/*Registration registration = new Registration();
		Course course2 = new Course();
		Student student = new Student();
		student.setNo(1700001);
		course2.setNo(1000);
		registration.setCourse(course2);
		registration.setStudent(student);
		
		courseDao.updateCourseRegNumUp(registration);*/
	}
}
