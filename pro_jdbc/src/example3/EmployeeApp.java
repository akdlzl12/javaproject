package example3;

import java.util.List;

public class EmployeeApp {
	public static void main(String[] args) throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
//		
//		try {
//			Employee emp1 = dao.findEmployeeById(210);
//			System.out.println(emp1.toString());
//			System.out.println();
//		} catch (NullPointerException e) {
//			System.out.println("값이없습니다. 다시한번 입력해 주세요.");
//			System.out.println();
//		}
		
		
//		List<Employee> resultArr = dao.searchEmployeesBySalary(3000, 6000);
//		for (Employee employee : resultArr) {
//			System.out.println(employee.toString());
//			
//		}
//		System.out.println();
		
		List<Employee> resultArr2 = dao.searchEmployeesByFirstName("steven");
		for (Employee employee : resultArr2) {
			System.out.println(employee.toString());
		}
		
		
		
		
	}
}
