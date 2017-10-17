package kr.co.jhta.school.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.CourseDao;
import kr.co.jhta.school.dao.RegistrationDao;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Registration;

public class StudentService {
	
	private CourseDao courseDao = new CourseDao();
	private RegistrationDao registrationDao = new RegistrationDao();
	
	// 수강 취소
	public void cancleCourse(Registration registration) throws SQLException {
		
	}
	
	// 수강신청
	public void requestCourse(Registration registration) throws SQLException {
		
		CourseDao courseDao = new CourseDao();
		
		registration.getStudent().getNo();
		Course course = courseDao.getCourse(registration.getCourse().getNo());
		
		course.setRegNum(course.getRegNum()+1);
		course.setNo(course.getNo());
		
		courseDao.updateCourseRegNumUp(course);
		
		
		
		
		// 1000번에 해당하는 course정보를 반환 
		
		//해당 과정 조회
		
		//정원/신청자수 체크

		//수강신청 정보 등록
		
		//신청자 수 변경
	}
	
	// 현재 수강중인 과목 조회
	public List<Course> getCurrentRegistedCourses(int studNo) throws SQLException {
		return null;
		
	}
	
	
	
}
