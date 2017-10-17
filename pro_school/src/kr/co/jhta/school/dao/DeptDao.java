package kr.co.jhta.school.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.util.IbatisUtils;
import kr.co.jhta.school.vo.Dept;

public class DeptDao {
	
	// 모든 부서정보 조회
	@SuppressWarnings("unchecked")
	public List<Dept> getAllDepts() throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getAllDepts");
	}
	
	// 지정된 부서번호에 해당하는 부서정보 조회
	public Dept getDeptByNo(int deptNo) throws SQLException {
		return (Dept) IbatisUtils.getSqlMapClient().queryForObject("getDeptByNo", deptNo);
	}
}
