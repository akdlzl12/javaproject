package kr.co.jhta.school.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.RegistrationDao;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Registration;
import kr.co.jhta.school.vo.Student;

public class RegistrationApp {
	public static void main(String[] args) throws SQLException {
		RegistrationDao registrationDao = new RegistrationDao();
		Registration registrationObject = new Registration();
		
		// 지정된 학생의 수강신청정보 조회
		List<Registration> registrationArr1 = registrationDao.getRegistrationsByStudent(1700001);
		for (Registration registration : registrationArr1) {
			System.out.println(registration.getScore());
			System.out.println(registration.getCourse().getNo());
			System.out.println(registration.getStudent().getNo());
		}
		
		System.out.println("---------------------------------------------------------------");
		
		// 지정된 과정의 수강신청정보 조회
		List<Registration> registrationArr2 = registrationDao.getRegistrationsByCourse(1000);
		for (Registration registration : registrationArr2) {
			System.out.println(registration.getScore());
			System.out.println(registration.getCourse().getNo());
			System.out.println(registration.getStudent().getNo());
		}
		
		System.out.println("---------------------------------------------------------------");
		
		// 수강신청정보 저장
		/*Course course = new Course();
		course.setNo(1000);
		Student student = new Student();
		student.setNo(1700001);
		
		registrationObject.setCourse(course);
		registrationObject.setStudent(student);
		registrationObject.setScore("A");
		registrationDao.addRegistration(registrationObject);*/
	}
}
