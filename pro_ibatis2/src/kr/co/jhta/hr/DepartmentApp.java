package kr.co.jhta.hr;

import java.sql.SQLException;

import kr.co.jhta.hr.dao.DepartmentDao;
import kr.co.jhta.hr.dao.EmployeeDao;
import kr.co.jhta.hr.vo.Department;
import kr.co.jhta.hr.vo.Employee;

public class DepartmentApp {
	public static void main(String[] args) throws SQLException {
		EmployeeDao empDao = new EmployeeDao();
		DepartmentDao deptDao = new DepartmentDao();
		
		/*// 101번 사원정보가 들어있는 employee 객체
		Employee employee = empDao.getEmployeeById(101);
		
		// 새 부서정보 설정
		Department department = new Department();
		department.setName("교육팀");
		department.setManager(employee);
		
		// 새 부서정보저장
		deptDao.addDepartment(department);*/
		
		Department department = deptDao.getDepartmentById(290);
		System.out.println(department.getId());
		System.out.println(department.getName());
		System.out.println(department.getManager().getEmployeeId());
		
		
		
	}
}
