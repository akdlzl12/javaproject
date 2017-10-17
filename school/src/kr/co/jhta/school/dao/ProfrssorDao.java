package kr.co.jhta.school.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.util.IbatisUtils;
import kr.co.jhta.school.vo.Professor;

public class ProfrssorDao {
	
	// 지정된 부서번호에 소속된 교수정보 조회
	@SuppressWarnings("unchecked")
	public List<Professor> getProfessorsByDept(int deptNo) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getProfessorsByDept", deptNo);
	}
	
	// 지정된 교수번호에 해당하는 교수정보 조회
	public Professor getProfessor(int profNo) throws SQLException {
		return (Professor) IbatisUtils.getSqlMapClient().queryForObject("getProfessor", profNo);
	}
}
