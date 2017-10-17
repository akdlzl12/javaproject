package kr.co.jhta.store.dao;

import java.sql.SQLException;
import java.util.List;

import Utils.IbatisUtils;
import kr.co.jhta.store.vo.User;

public class UserDao {
	
	// 새로운 사용자 추가
	public void addUser(User user) throws SQLException {
		IbatisUtils.getSqlMapClient().insert("addUser", user);
	}
	
	// 모든 사용자 조회
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getAllUsers");
	}
	
	// 사용자 이름으로 조회
	@SuppressWarnings("unchecked")
	public List<User> searchUserByName(String userName) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("searchUserByName", userName);
	}
	
	// 사용자 아이디로 조회
	public User searchUserById(String userId) throws SQLException {
		return (User) IbatisUtils.getSqlMapClient().queryForObject("searchUserById", userId);
	}
	
}
