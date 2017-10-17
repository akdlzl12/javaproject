package kr.co.jhta.school.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.StudentDao;
import kr.co.jhta.school.vo.Student;

public class StudentApp {
	public static void main(String[] args) throws SQLException {
		StudentDao studentDao = new StudentDao();
		Student student = new Student();
		// 모든학생정보 조회
		List<Student> studentArr = studentDao.getAllStudents();
		for (Student students : studentArr) {
			System.out.println(students.getNo());
			System.out.println(students.getName());
			System.out.println(students.getGrade());
			System.out.println(students.getDept().getNo());
			System.out.println(students.getProfessor().getNo());
		}
		
		System.out.println("--------------------------------------------------------------------------");
		
		// 지정된 학생번호에 해당하는 학생정보 조회
		student = studentDao.getStudentByNo(1700001);
		System.out.println(student.getNo());
		System.out.println(student.getName());
		System.out.println(student.getGrade());
		System.out.println(student.getDept().getNo());
		System.out.println(student.getProfessor().getNo());
		
		System.out.println("--------------------------------------------------------------------------");
		
		// 지정된 교수번호의 교수가 지도하는 학생정보 조회
		List<Student> studentArr2 = studentDao.getStudentsByProfessor(11002);
		for (Student student2 : studentArr2) {
			System.out.println(student2.getNo());
			System.out.println(student2.getName());
			System.out.println(student2.getGrade());
			System.out.println(student2.getDept().getNo());
			System.out.println(student2.getProfessor().getNo());
		}
		
		System.out.println("--------------------------------------------------------------------------");
		
		// 지정된 학과번호에 소속된 학생정보 조회
		List<Student> studentArr3 = studentDao.getStudentsByDept(3);
		for (Student student2 : studentArr3) {
			System.out.println(student2.getNo());
			System.out.println(student2.getName());
			System.out.println(student2.getGrade());
			System.out.println(student2.getDept().getNo());
			System.out.println(student2.getProfessor().getNo());
		}
	}
}
