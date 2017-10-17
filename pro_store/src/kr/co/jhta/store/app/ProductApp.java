package kr.co.jhta.store.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.store.dao.ProductDao;
import kr.co.jhta.store.vo.Product;

public class ProductApp {
	public static void main(String[] args) throws SQLException {
		ProductDao productDao = new ProductDao();
		Product product = new Product();
		
		// 1번문제 : 새로운 상품 등록
		/*product.setName("오버워치");
		product.setMaker("블리자드");
		product.setPrice(36000);
		product.setQty(1);
		productDao.addProduct(product);*/
		
		// 2번문제 : 등록된 모든 상품 조회
		/*List<Product> productArr = productDao.getAllproducts();
		for (Product product2 : productArr) {
			System.out.println(product2.getNo());
			System.out.println(product2.getName());
			System.out.println(product2.getMaker());
			System.out.println(product2.getPrice());
			System.out.println(product2.getQty());
			System.out.println(product2.getRegdate());
			
		}*/
		
		// 3번문제 : 상품이름으로 상품 조회
		/*List<Product> productsArr2 = productDao.searchProductsByName("배틀그라운드");
		for (Product product2 : productsArr2) {
			System.out.println(product2.getNo());
			System.out.println(product2.getName());
			System.out.println(product2.getMaker());
			System.out.println(product2.getPrice());
			System.out.println(product2.getQty());
			System.out.println(product2.getRegdate());
			
		}*/
		
		// 4번문제 : 상품번호로 상품 조회
		/*product = productDao.searchProductByNo(1000);
		System.out.println(product.getNo());
		System.out.println(product.getName());
		System.out.println(product.getMaker());
		System.out.println(product.getPrice());
		System.out.println(product.getQty());
		System.out.println(product.getRegdate());*/
		
		// 5번문제 : 상품의 재고 변경
		
		product.setQty(2);
		product.setName("오버워치");
		productDao.updateProduct(product);
	}
}
