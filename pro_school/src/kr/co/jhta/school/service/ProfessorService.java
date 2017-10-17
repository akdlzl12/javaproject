package kr.co.jhta.school.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Student;

public class ProfessorService {
	
	// 신규 개설과정 등록기능
	public void addCourse(Course course) throws SQLException {
		
	}
	
	// 해당 교수가 개설한 과정조회하기
	public List<Course> getCourses(int profNo) throws SQLException {
		return null;
	}
	
	// 해당과정에 수강신청한 학생 조회
	public List<Student> getStudentsForCourse(int courseNo) throws SQLException {
		return null;
	}
}
