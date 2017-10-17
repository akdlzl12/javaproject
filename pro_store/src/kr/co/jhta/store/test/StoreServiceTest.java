package kr.co.jhta.store.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import kr.co.jhta.store.dao.OrderDao;
import kr.co.jhta.store.dao.ProductDao;
import kr.co.jhta.store.vo.Order;
import kr.co.jhta.store.vo.Product;
import service.StoreService;

public class StoreServiceTest {
	
	@Test
	public void testOrder() throws SQLException {
		ProductDao productDao = new ProductDao();
		OrderDao orderDao = new OrderDao();
		StoreService service = new StoreService();
		
		try {
			Product product = productDao.searchProductByNo(1000);
			List<Order> prevOrderList = orderDao.searchOrderByUser("1");
			
			service.orderProduct("1", 1000, 10);
			
			List<Order> currentOrderList = orderDao.searchOrderByUser("1");
			Product currentProduct = productDao.searchProductByNo(1000);
			
			Assert.assertEquals(currentOrderList.size(), prevOrderList.size() + 1);
			Assert.assertEquals(currentProduct.getQty(), product.getQty() - 10);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
