package kr.co.jhta.school.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.util.IbatisUtils;
import kr.co.jhta.school.vo.Subject;

public class SubjectDao {

	// 모든 과목정보 조회
	@SuppressWarnings("unchecked")
	public List<Subject> getAllSubject() throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getAllSubject");
	}
	
	// 지정된 부서번호에 해당하는 학과의 과목정보 조회
	@SuppressWarnings("unchecked")
	public List<Subject> getSubjectsByDept(int deptNo) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getSubjectsByDept", deptNo);
	}
	
	// 지정된 과목번헤에 해당하는 과목정보 조회
	public Subject getSubjectByNo(int subjectNo) throws SQLException {
		return (Subject) IbatisUtils.getSqlMapClient().queryForObject("getSubjectByNo", subjectNo);
	}
}
