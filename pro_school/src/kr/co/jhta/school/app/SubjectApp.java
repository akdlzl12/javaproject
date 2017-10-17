package kr.co.jhta.school.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.SubjectDao;
import kr.co.jhta.school.vo.Subject;

public class SubjectApp {
	public static void main(String[] args) throws SQLException {
		SubjectDao subjectDao = new SubjectDao();
		
		// 모든 과목정보 조회
		List<Subject> subjectArr1 = subjectDao.getAllSubject();
		for (Subject subject : subjectArr1) {
			System.out.println(subject.getNo());
			System.out.println(subject.getName());
			System.out.println(subject.getType());
			System.out.println(subject.getDept().getNo());
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		// 지정된 부서번호에 해당하는 학과의 과목정보 조회
		List<Subject> subjectArr2 = subjectDao.getSubjectsByDept(1);
		for (Subject subject : subjectArr2) {
			System.out.println(subject.getNo());
			System.out.println(subject.getName());
			System.out.println(subject.getType());
			System.out.println(subject.getDept().getNo());
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		// 지정된 과목번헤에 해당하는 과목정보 조회
		Subject subject = subjectDao.getSubjectByNo(1000);
		System.out.println(subject.getNo());
		System.out.println(subject.getName());
		System.out.println(subject.getType());
		System.out.println(subject.getDept().getNo());
		
	}
}
