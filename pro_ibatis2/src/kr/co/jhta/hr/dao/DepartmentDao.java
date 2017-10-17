package kr.co.jhta.hr.dao;

import java.sql.SQLException;

import kr.co.jhta.hr.util.IbatisUtils;
import kr.co.jhta.hr.vo.Department;

public class DepartmentDao {
	public void addDepartment(Department department) throws SQLException {
		IbatisUtils.getSqlMapClient().insert("addDepartment", department);
	}
	
	public Department getDepartmentById(int departmentId) throws SQLException {
		return (Department) IbatisUtils.getSqlMapClient().queryForObject("getDepartmentById", departmentId);
	}
}
