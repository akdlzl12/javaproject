package example3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	// 사원번호로 조회하기 - 1건 반환값 = Employee
	public Employee findEmployeeById(int employeeId) throws SQLException {
		Employee employee = null;

		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * ");
		sb.append("FROM HR.employees ");
		sb.append("WHERE employee_id = ?");

		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		pstmt.setInt(1, employeeId);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			employee = new Employee();
			employee.setEmployeeId(rs.getInt("employee_id"));
			employee.setFirstName(rs.getString("first_name"));
			employee.setLastName(rs.getString("last_name"));
			employee.setEmail(rs.getString("email"));
			employee.setPhoneNumber(rs.getString("phone_number"));
			employee.setHireDatel(rs.getDate("hire_date"));
			employee.setSalary(rs.getDouble("salary"));
			employee.setCommissionPct(rs.getDouble("commission_pct"));
			employee.setManagerId(rs.getInt("manager_id"));
			employee.setDepartmentId(rs.getInt("department_id"));

		}

		rs.close();
		pstmt.close();
		con.close();

		return employee;

	}

	// 부서번호로 조회하기 - 여러 건 반환값 = List<Employee>
	public List<Employee> searchEmployeesByDeptId(int deptId) throws SQLException {
		List<Employee> results = new ArrayList<>();

		return results;
	}

	// 급여로 조회하기 - 여러 건 반환값 = List<Employee>
	public List<Employee> searchEmployeesBySalary(double min, double max) throws SQLException {
		List<Employee> results = new ArrayList<>();

		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * ");
		sb.append("FROM HR.employees ");
		sb.append("WHERE salary >= ? and salary <= ? ");
		sb.append("ORDER BY salary asc");

		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		pstmt.setDouble(1, min);
		pstmt.setDouble(2, max);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			Employee employee = new Employee();
			employee.setEmployeeId(rs.getInt("employee_id"));
			employee.setFirstName(rs.getString("first_name"));
			employee.setLastName(rs.getString("last_name"));
			employee.setEmail(rs.getString("email"));
			employee.setPhoneNumber(rs.getString("phone_number"));
			employee.setHireDatel(rs.getDate("hire_date"));
			employee.setSalary(rs.getDouble("salary"));
			employee.setCommissionPct(rs.getDouble("commission_pct"));
			employee.setManagerId(rs.getInt("manager_id"));
			employee.setDepartmentId(rs.getInt("department_id"));

			results.add(employee);

		}

		rs.close();
		pstmt.close();
		con.close();

		return results;
	}

	// 직종으로 조회하기 - 여러 건 반환값 = List<Employee>
	public List<Employee> searchEmployeesByJobId(int jobId) throws SQLException {
		List<Employee> results = new ArrayList<>();

		return results;
	}

	// 이름으로 조회하기 - 여러 건 반환값 = List<Employee>
	public List<Employee> searchEmployeesByFirstName(String firstName) throws SQLException {
		List<Employee> results = new ArrayList<>();

		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * ");
		sb.append("FROM HR.employees ");
		sb.append("WHERE lower(first_name) like '%' || ? || '%' ");
		sb.append("ORDER BY first_name");

		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		pstmt.setString(1, firstName);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			Employee employee = new Employee();
			employee.setEmployeeId(rs.getInt("employee_id"));
			employee.setFirstName(rs.getString("first_name"));
			employee.setLastName(rs.getString("last_name"));
			employee.setEmail(rs.getString("email"));
			employee.setPhoneNumber(rs.getString("phone_number"));
			employee.setHireDatel(rs.getDate("hire_date"));
			employee.setSalary(rs.getDouble("salary"));
			employee.setCommissionPct(rs.getDouble("commission_pct"));
			employee.setManagerId(rs.getInt("manager_id"));
			employee.setDepartmentId(rs.getInt("department_id"));

			results.add(employee);

		}

		rs.close();
		pstmt.close();
		con.close();

		return results;
	}

	// 매니저번호 조회하기 - 여러 건 반환값 = List<Employee>
	public List<Employee> searchEmployeesByManagerId(int managerId) throws SQLException {
		List<Employee> results = new ArrayList<>();

		return results;
	}
}
