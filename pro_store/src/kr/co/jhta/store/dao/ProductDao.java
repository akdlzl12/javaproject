package kr.co.jhta.store.dao;

import java.sql.SQLException;
import java.util.List;

import Utils.IbatisUtils;
import kr.co.jhta.store.vo.Product;

public class ProductDao {
	
	// 새 상품 추가
	public void addProduct(Product product) throws SQLException {
		IbatisUtils.getSqlMapClient().insert("addProduct", product);
	} 
	
	// 모든 상품 조회
	@SuppressWarnings("unchecked")
	public List<Product> getAllproducts() throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("getAllproducts");
	}
	
	// 상품이름으로 조회
	@SuppressWarnings("unchecked")
	public List<Product> searchProductsByName(String productName) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("searchProductsByName", productName);
	}
	
	// 상품 번호로 조회
	public Product searchProductByNo(int productNo) throws SQLException {
		return (Product) IbatisUtils.getSqlMapClient().queryForObject("searchProductByNo", productNo);
	}
	
	// 재고 변경하기
	public void updateProduct(Product product) throws SQLException {
		IbatisUtils.getSqlMapClient().update("updateProduct", product);
	}
}
