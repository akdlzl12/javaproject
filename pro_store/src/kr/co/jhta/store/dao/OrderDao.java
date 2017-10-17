package kr.co.jhta.store.dao;

import java.sql.SQLException;
import java.util.List;

import Utils.IbatisUtils;
import kr.co.jhta.store.vo.Order;

public class OrderDao {
	
	// 새로운 주문정보 저장
	public void addOrder(Order order) throws SQLException {
		IbatisUtils.getSqlMapClient().insert("addOrder", order);
	}
	
	// 주문자 아이디로 주문정보 조회
	@SuppressWarnings("unchecked")
	public List<Order> searchOrderByUser(String userId) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("searchOrderByUser", userId);
	}
	
	// 상품번호로 주문정보 조회
	@SuppressWarnings("unchecked")
	public List<Order> searchOrdersByProductNo(int productNo) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("searchOrdersByProductNo", productNo);
	}
	
	// 주문날짜로 주문정보 조회
	@SuppressWarnings("unchecked")
	public List<Order> searchOrdersByDate(String dateString) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("searchOrdersByDate", dateString);
	} 
}
