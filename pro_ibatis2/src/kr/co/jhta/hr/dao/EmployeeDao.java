package kr.co.jhta.hr.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.hr.util.IbatisUtils;
import kr.co.jhta.hr.vo.Employee;

public class EmployeeDao {
	
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getAllEmployees");
	}
	
	public Employee getEmployeeById(int employeeId) throws SQLException {
		return (Employee)IbatisUtils.getSqlMapClient().queryForObject("getEmployeeById", employeeId);
	}
}
