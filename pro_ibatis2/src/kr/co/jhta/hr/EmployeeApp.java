package kr.co.jhta.hr;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.hr.dao.EmployeeDao;
import kr.co.jhta.hr.util.IbatisUtils;
import kr.co.jhta.hr.vo.Employee;

public class EmployeeApp {
	public static void main(String[] args) throws SQLException {
		EmployeeDao dao = new  EmployeeDao();
		
		/*List<Employee> employee = dao.getAllEmployees();
		System.out.println("전체 사원수: " + employee.size());*/
		
		Employee emp1 = dao.getEmployeeById(101);
		System.out.println(emp1.getFirstName());
		System.out.println(emp1.getLastName());
	}
}
