package kr.co.jhta.store.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.store.dao.OrderDao;
import kr.co.jhta.store.dao.ProductDao;
import kr.co.jhta.store.dao.UserDao;
import kr.co.jhta.store.vo.Order;
import kr.co.jhta.store.vo.Product;
import kr.co.jhta.store.vo.User;

public class OrderApp {
	public static void main(String[] args) throws SQLException {
		Order order = new Order();
		OrderDao orderDao = new OrderDao();
		User user = new User();
		Product product = new Product();
		UserDao userDao = new UserDao();
		ProductDao productDao = new ProductDao();
		
		
		// 1번 문제 : 새로운 주문정보 저장
		/*user = userDao.searchUserById("3");
		product = productDao.searchProductByNo(1000);
		
		order.setUser(user);
		order.setProduct(product);
		order.setQty(5);
		orderDao.addOrder(order);*/
		
		// 2번문제 : 주문자 아이디로 주문정보 조회\

		/*String userId = userDao.searchUserById("1").getId();
		System.out.println(userId);
		List<Order> orderArr1 = orderDao.searchOrderByUser(userId);
		for (Order order2 : orderArr1) {
			System.out.println(order2.getNo());
			System.out.println(order2.getUser().getId());
			System.out.println(order2.getProduct().getNo());
			System.out.println(order2.getQty());
			System.out.println(order2.getRegdate());
			
		}*/
		
		// 3번문제 : 상품번호로 주문정보 조회
		/*product = productDao.searchProductByNo(1000);
		List<Order> orderArr2 = orderDao.searchOrdersByProductNo(product.getNo());
		for (Order order2 : orderArr2) {
			System.out.println(order2.getNo());
			System.out.println(order2.getUser().getId());
			System.out.println(order2.getProduct().getNo());
			System.out.println(order2.getQty());
			System.out.println(order2.getRegdate());
		}*/
		
		// 4번문제 : 주문날짜로 주문정보 조회
		
		/*List<Order> orderArr3 = orderDao.searchOrdersByDate("2017/07/21");
		for (Order order2 : orderArr3) {
			System.out.println(order2.getNo());
			System.out.println(order2.getUser().getId());
			System.out.println(order2.getProduct().getNo());
			System.out.println(order2.getQty());
			System.out.println(order2.getRegdate());
		}*/
		
		
		
	}
}
