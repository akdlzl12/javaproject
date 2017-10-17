package kr.co.jhta.store.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.store.dao.UserDao;
import kr.co.jhta.store.vo.User;

public class UserApp {
	public static void main(String[] args) throws SQLException {
		User user = new User();
		UserDao userDao = new UserDao();
		
		// 1번문제 : 새로운 사용자 등록
		
		/*user.setId("3");
		user.setName("김유신");
		user.setPhone("010-3333-4444");
		user.setEmail("kim@naver.com");
		userDao.addUser(user);*/
		
		// 2번문제 : 모든 사용자 조회
		/*List<User> userArr1 = userDao.getAllUsers();
		for (User user2 : userArr1) {
			System.out.println(user2.getId());
			System.out.println(user2.getName());
			System.out.println(user2.getPhone());
			System.out.println(user2.getEmail());
			System.out.println(user2.getRegdate());
		}*/
		
		// 3번문제 : 이름으로 사용자 조회
		/*List<User> userArr2 = userDao.searchUserByName("김유신");
		for (User user2 : userArr2) {
			System.out.println(user2.getId());
			System.out.println(user2.getName());
			System.out.println(user2.getPhone());
			System.out.println(user2.getEmail());
			System.out.println(user2.getRegdate());
		}*/
		
		// 4번문제 : 아이디로 사용자 조회
		/*user = userDao.searchUserById("2");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPhone());
		System.out.println(user.getEmail());
		System.out.println(user.getRegdate());
		*/
	}
}
