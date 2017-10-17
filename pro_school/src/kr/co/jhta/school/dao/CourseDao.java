package kr.co.jhta.school.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.util.IbatisUtils;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Registration;

public class CourseDao {
	
	// 모든 개설과정 조회
	@SuppressWarnings("unchecked")
	public List<Course> getAllCourses() throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getAllCourses");
	}
	
	// 지정된 부서의 개설과정 조회
	@SuppressWarnings("unchecked")
	public List<Course> getCoursesByDept(int deptNo) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getCoursesByDept", deptNo);
	}
	
	// 지정된교수번호의 교수가 개설한 개설과정 조회
	@SuppressWarnings("unchecked")
	public List<Course> getCoursesByProfessor(int profNo) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getCoursesByProfessor", profNo);
	}
	
	// 지정된 과정번호의 개설과정 조회
	public Course getCourse(int courseNo) throws SQLException {
		return (Course) IbatisUtils.getSqlMapClient().queryForObject("getCourse", courseNo);
	}
	
	// 수강인원 증가/감소
	public void updateCourseRegNumUp(Course course) throws SQLException {
		IbatisUtils.getSqlMapClient().update("updateCourseRegNumUp", course);
	}
}
