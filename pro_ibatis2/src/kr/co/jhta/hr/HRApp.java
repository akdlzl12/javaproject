package kr.co.jhta.hr;

import java.sql.SQLException;

import kr.co.jhta.hr.service.HumanResourceService;
import kr.co.jhta.hr.vo.Department;

public class HRApp {
	public static void main(String[] args) throws SQLException {
		HumanResourceService service = new HumanResourceService();
		
		Department department = service.getDetailDepartment(10);
		System.out.println("부서번호: " + department.getId());
		System.out.println("부서이름: " + department.getName());
		System.out.println("관리자 사원번호: " + department.getManager().getEmployeeId());
		System.out.println("관리자 이름: " + department.getManager().getFirstName());
		System.out.println("관리자 핸드폰번호: " + department.getManager().getPhoneNumber());
		System.out.println("관리자 직종: " + department.getManager().getJobId());
	}
}
