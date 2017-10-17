package kr.co.jhta.hr.service;

import java.sql.SQLException;

import kr.co.jhta.hr.dao.DepartmentDao;
import kr.co.jhta.hr.dao.EmployeeDao;
import kr.co.jhta.hr.dao.jobDao;
import kr.co.jhta.hr.vo.Department;
import kr.co.jhta.hr.vo.Employee;

public class HumanResourceService {
	
	private DepartmentDao deptDao = new DepartmentDao();
	private EmployeeDao empDao = new EmployeeDao();
	private jobDao jD = new jobDao();
	
	// 부서정보와 그 부서의 관리자에 대한 정보를 같이 반환하는 메소드
	public Department getDetailDepartment(int departmentId) throws SQLException {
		
		// 부서 정보 조회 (부서아이디, 부서이름, 관리자 사원아이디, 위치아이디)
		Department department = deptDao.getDepartmentById(departmentId);
		
		if(department == null) {
			return null;
		}
		
		// 관리자의 사원정보 조회
		int employeeId = department.getManager().getEmployeeId();
		Employee employee = empDao.getEmployeeById(employeeId);
		
		// 상세 사원정보가 들어있는 employee객체를 Department에 저장
		department.setManager(employee);
		
		return department;
	}
	
	
}
