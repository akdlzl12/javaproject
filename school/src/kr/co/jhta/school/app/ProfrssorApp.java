package kr.co.jhta.school.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.ProfrssorDao;
import kr.co.jhta.school.vo.Professor;

public class ProfrssorApp {
	public static void main(String[] args) throws SQLException {
		ProfrssorDao profrssorDao = new ProfrssorDao();
		Professor professor = new Professor();
		
		// 지정된 부서번호에 소속된 교수정보 조회
		List<Professor> professorArr1 =  profrssorDao.getProfessorsByDept(2);
		for (Professor professor1 : professorArr1) {
			System.out.println(professor1.getNo());
			System.out.println(professor1.getName());
			System.out.println(professor1.getPostion());
			System.out.println(professor1.getDept().getNo());
		}
		
		System.out.println("--------------------------------------------------------------------------");
		
		// 지정된 교수번호에 해당하는 교수정보 조회
		professor = profrssorDao.getProfessor(11002);
		System.out.println(professor.getNo());
		System.out.println(professor.getName());
		System.out.println(professor.getPostion());
		System.out.println(professor.getDept().getNo());
	}
}
