package kr.co.jhta.school.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.util.IbatisUtils;
import kr.co.jhta.school.vo.Registration;

public class RegistrationDao {

	// 지정된 학생의 수강신청정보 조회
	@SuppressWarnings("unchecked")
	public List<Registration> getRegistrationsByStudent(int studNo) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getRegistrationsByStudent", studNo);
	}
	
	// 지정된 과정의 수강신청정보 조회
	@SuppressWarnings("unchecked")
	public List<Registration> getRegistrationsByCourse(int courseNo) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getRegistrationsByCourse", courseNo);
	}
	
	// 수강신청정보 저장
	public void addRegistration(Registration registration) throws SQLException {
		IbatisUtils.getSqlMapClient().insert("addRegistration", registration);
	}
}
