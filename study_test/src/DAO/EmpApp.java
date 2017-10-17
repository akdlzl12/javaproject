package DAO;

import java.sql.SQLException;

public class EmpApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DAO d = new DAO();
		Employees emp = d.findDepartment("Sales");
		
	}
}
