package kr.co.jhta.school.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Dept;

public class CommonService {
	
	// 지정된 학과가 개설한 과정 조회기능
	public List<Course> getCoursesByDept(int deptNo) throws SQLException {
		return null;
	}
	
	// 모든 학과 조회기능
	public List<Dept> getDepts() throws SQLException {
		return null;
	}
	
	
}
