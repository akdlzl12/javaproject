package service;

import java.sql.SQLException;
import java.util.List;
 
import kr.co.jhta.store.dao.OrderDao;
import kr.co.jhta.store.dao.ProductDao;
import kr.co.jhta.store.dao.UserDao;
import kr.co.jhta.store.vo.Order;
import kr.co.jhta.store.vo.Product;
import kr.co.jhta.store.vo.User;
 
public class StoreService {
 
	private UserDao userDao = new UserDao();
	private ProductDao productDao = new ProductDao();
	private OrderDao orderDao = new OrderDao();
	
	//새 사용자 등록 서비스
	public void addNewUser(User user) throws SQLException {
		if (userDao.searchUserById(user.getId()) != null) {
			System.err.println("[" + user.getId()+"] 는 이미 사용중인 아이디입니다.");
			return;
		}
		userDao.addUser(user);
	}
	
	// 새 상품 등록 서비스
	public void addNewProduct(Product product) throws SQLException {
		productDao.addProduct(product);
	}
	// 고객 조회 서비스
	public List<User> searchUser(String userName) throws SQLException {
		return userDao.searchUserByName(userName);
	}
	
	// 상품 조회 서비스
	public List<Product> searchProduct() throws SQLException {
		return productDao.getAllproducts();
		
	}
	public List<Product> searchProduct(String productName) throws SQLException {
		return productDao.searchProductsByName(productName);
	}
		
	//주문서비스
	public void orderProduct(String userId, int productNo, int qty) throws SQLException {
		
		User user = userDao.searchUserById(userId);
		Product product = productDao.searchProductByNo(productNo);
		if(qty > product.getQty()) {
			System.err.println("재고가 부족합니다.");
			return;
		}
		Order order =  new Order();
		order.setUser(user);
		order.setProduct(product);
		order.setQty(qty);
		//주문정보저장
		orderDao.addOrder(order);
		product.setQty(product.getQty() - qty);
		productDao.updateProduct(product);
		System.out.println("주문이 완료되었습니다.");
	}
}
