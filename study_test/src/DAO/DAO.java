package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



	public class DAO {
		
		
		int a = 0;
		
		public Employees findDepartment(String dpartment_name) throws SQLException, ClassNotFoundException {
			Employees employees = null;
			
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT A.EMPLOYEE_ID, A.FIRST_NAME, A.SALARY ");
			sb.append("FROM HR.EMPLOYEES A, HR.DEPARTMENTS B ");
			sb.append("WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID " );
			sb.append("AND B.DEPARTMENT_NAME = '"+dpartment_name+"' ");
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "zxcv1234");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				
				employees = new Employees();
				
				int id = rs.getInt("EMPLOYEE_ID");
				String name = rs.getString("FIRST_NAME");
				int salary = rs.getInt("SALARY");
				
				employees.setEmployess_id(id);
				employees.setFirst_name(name);
				employees.setSalary(salary);
				
				System.out.println(++a + "번 " + employees.toString());
				

			}
			
			
			
			rs.close();
			stmt.close();
			con.close();
			
			return employees;
	}
}