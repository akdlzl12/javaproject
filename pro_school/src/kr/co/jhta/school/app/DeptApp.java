package kr.co.jhta.school.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.DeptDao;
import kr.co.jhta.school.vo.Dept;

public class DeptApp {
	public static void main(String[] args) throws SQLException {
		DeptDao deptDao = new DeptDao();
		Dept dept = new Dept();
		// 모든 부서정보 조회
		List<Dept> deptArr1 = deptDao.getAllDepts();
		for (Dept dept1 : deptArr1) {
			System.out.println(dept1.getNo());
			System.out.println(dept1.getName());
		}
		
		// 지정된 부서번호에 해당하는 부서정보 조회
		dept = deptDao.getDeptByNo(3);
		System.out.println(dept.getNo());
		System.out.println(dept.getName());
	}
}
