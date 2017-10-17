package sample5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ProductMgr {
	ArrayList<Product> productArr = new ArrayList<>();
	
	
	// 상품정보를 전달받아서 productList에 상품을 등록하는 기능
		public void addProductList(Product p) {
			productArr.add(p);
		}
	
	// productList에 저장된 모든 상품정보를 화면에 출력하는 기능
		public void printProductList() {
			for (Product product : productArr) {
				System.out.println("상품번보: " + product.getNo() + "상품이름: " + product.getName() + "상품종류: " + product.getCategory() + "상품가격: " + product.getPrice() + "판매개시일: " + product.getPubdate() + "절판여부: " + product.isSoldOut());
			}
			
		}
	
	
	// 상품번호를 전달받아서 productList에서 그 상품번호에 해당하는 상품정보 하나를 반환하는 기능
		public Product informationProductList(int no) {
			for (Product product : productArr) {
				if(product.getNo() == no) {
					return product;
				}
				
			}
			return null;
			
		}
	
	
	// 상품종류를 전달받아서 productList에서 그 상품종류에 해당하는 모든 상품정보를 반환하는 기능
		public ArrayList<Product> kindProductList(String s) {
			
			ArrayList<Product> result = new ArrayList<>();
			for (Product product : productArr) {
				if(product.getCategory().equals(s)) {
					result.add(product);
				}
			}
			return result;
			
		}
	
	
	// productList에서 현재 판매중인 모든 상품정보를 반환하는 기능
		public ArrayList<Product> saleProductList() {
			ArrayList<Product> result2 = new ArrayList<>();
			
			for (Product product : productArr) {
				if(product.isSoldOut() == false) {
					result2.add(product);
				}
			}
			return result2;
		}
		
		
	// 최소가격/최대가격을 전달받아서 그 가격 구간에 속하는 모든 상품 정보를 반환하는 기능
		public ArrayList<Product> maxMinProductList(int max, int min) {
			ArrayList<Product> result3 = new ArrayList<>();
			for (Product product : productArr) {
				if(min < Integer.parseInt(product.getPrice()) && max > Integer.parseInt(product.getPrice())) {
					result3.add(product);
					return result3;
				}
			}
			return null;
		}
		
	// 상품이름을 전달받아서 그 이름이 들어가 있는 모든 상품정보를 반환하는 기능
		public Product nameProductList(String name) {
			for (Product product : productArr) {
				if(product.getName().equals(name)) {
					return product;
				}
			}
			return null;
		}
	
	// 날짜를 전달받아서 그 날짜 이후로 입고된 모든 상품정보를 반환하는 기능
		public ArrayList<Product> warehousingProductList(String date) throws ParseException {
			ArrayList<Product> result4 = new ArrayList<>();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse(date);
			System.out.println(d);
			for (Product product : productArr) {
				if(product.getPubdate().getTime() >= d.getTime()) {
					result4.add(product);
					
				}
			}
			return result4;
		}	
		
}
