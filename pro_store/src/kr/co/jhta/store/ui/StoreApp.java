package kr.co.jhta.store.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import kr.co.jhta.store.dao.OrderDao;
import kr.co.jhta.store.dao.ProductDao;
import kr.co.jhta.store.dao.UserDao;
import kr.co.jhta.store.vo.Order;
import kr.co.jhta.store.vo.Product;
import kr.co.jhta.store.vo.User;
import service.StoreService;

public class StoreApp {
		
	private Scanner scanner = new Scanner(System.in);
	private StoreService service = new StoreService();
	ProductDao productDao = new ProductDao(); 
	OrderDao orderDao = new OrderDao();
	UserDao userDao = new UserDao();
	
	
	// title
	public void start() throws Exception  {
		System.out.println("=================================");
		System.out.println("| 편의점 관리 프로그램              |");
		System.out.println("=================================");
		
		home();
	}
	
	// 홈
	public void home() throws Exception {
		System.out.println("\n");
		System.out.println("--------------------------------------");
		System.out.println("| 1.조회	    2.주문    3.등록    0.종료 |");
		System.out.println("--------------------------------------");
		
		System.out.print("선택> ");
		int menuNo = scanner.nextInt();
		
		if (menuNo == 1) {
			search();
		} else if (menuNo == 2) {
			order();
			home();
		} else if (menuNo == 3) {
			add();
		} else if (menuNo == 0) {
			System.exit(-1);
		}
	}
	// 조회
	private void search() throws Exception {
		System.out.println("\n");
		System.out.println("------------------------------------------");
		System.out.println("| 1.사용자조회  2.상품조회  3.주문조회  0.홈 |");
		System.out.println("------------------------------------------");
		
		System.out.print("선택> ");
		int menuNo = scanner.nextInt();
		
		if (menuNo == 1) {
			searchUser();
			search();
		} else if (menuNo == 2) {
			searchProduct();
			search();
		} else if (menuNo == 3) {
			searchOrder();
			search();
		} else if (menuNo == 0) {
			home();
		} 
	}
	
	// 사용자 조회
	private void searchUser() throws SQLException {
		System.out.println("\n[사용자 조회]\n");
		
		System.out.print("사용자 이름> ");
		String username = scanner.next();
		
		// TODO 입력된 이름의 사용자정보를 모두 조회해서 화면에 표시하기
		List<User> users = service.searchUser(username);
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-10s%-10s%-20s\n", "아이디", "이름", "전화번호");
		System.out.println("--------------------------------------------------------------------");
		for (User user : users) {
			System.out.printf("%-10s%-10s%-20s\n", user.getId(), user.getName(), user.getPhone());
		}
		
		
	}
	// 상품조회
	private void searchProduct() throws SQLException {
		System.out.println("\n[상품 조회]\n");
		
		System.out.print("상품 이름> ");
		String productName = scanner.next();
		
		// TODO 입력된 상품이름의 상품정보를 모두 조회해서 화면에 표시하기
		List<Product> productArr = productDao.searchProductsByName(productName);
		
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-10s%-10s%-20s\n", "번호", "이름", "가격");
		System.out.println("--------------------------------------------------------------------");
		
		for (Product product : productArr) {
			System.out.printf("%-10s%-10s%-20s\n", product.getNo(), product.getName(), product.getPrice());
		}
		
	}
	// 주문조회
	private void searchOrder() throws SQLException {
		System.out.println("\n[주문 조회]\n");
		
		System.out.print("사용자 아이디> ");
		String userId = scanner.next();
		
		// TODO 입력된 사용자의 주문정보를 모두 조회해서 화면에 표시하기
		List<Order> orderArr = orderDao.searchOrderByUser(userId);
		
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-10s%-10s%-20s\n", "아이디", "번호", "수량");
		System.out.println("--------------------------------------------------------------------");
		
		for (Order order : orderArr) {
			System.out.printf("%-10s%-10s%-20s\n", order.getUser().getId(), order.getNo(), order.getQty());
		}
	}
	
	// 주문
	private void order() throws Exception {
		System.out.println("\n[상품 주문]\n");
		
		System.out.println("유저 아이디");
		String userId = scanner.next();
		
		System.out.println("품번");
		int productNo = scanner.nextInt();
		
		System.out.println("수량");
		int qty = scanner.nextInt();
		
		service.orderProduct(userId, productNo, qty);
		// TODO 주문하기
	}
	
	// 등록
	private void add() throws Exception {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("| 1.사용자등록 2.상품등록 0.홈");
		System.out.println("---------------------------");
		
		System.out.print("선택> ");
		int menuNo = scanner.nextInt();
		
		if (menuNo == 1) {
			addUser();
			add();
		} else if (menuNo == 2) {
			addProduct();
			add();
		} else if (menuNo == 0) {
			home();
		} 
	}
	// 사용자 등록
	public void addUser() throws SQLException {
		User user = new User();
		System.out.println("\n[사용자 등록]\n");
		
		// TODO 새로운 사용자 등록
		System.out.println("유저 아이디를 입력하세요.");
		user.setId(scanner.next());
		
		System.out.println("이름을 입력하세요");
		user.setName(scanner.next());
		
		System.out.println("이메일을 입력하세요.");
		user.setEmail(scanner.next());
		
		System.out.println("핸드폰번호를 입력하세요");
		user.setPhone(scanner.next());
		
		service.addNewUser(user);
		
		System.out.println("사용자 등록이 완료되었습니다.");
	}
	// 상품 등록
	public void addProduct() throws SQLException {
		System.out.println("\n[상품 등록]\n");
		
		// TODO 새로운 상품 등록
		Product product = new Product();
		
		System.out.println("상품이름을 입력하세요.");
		product.setName(scanner.next());
		
		System.out.println("상품의 기업을 입력하세요.");
		product.setMaker(scanner.next());
		
		System.out.println("가격을 입력하세요.");
		product.setPrice(scanner.nextLong());
		
		System.out.println("상품개수를 입력하세요");
		product.setQty(scanner.nextInt());
		
		service.addNewProduct(product);
		System.out.println("상품등록이 완료되었습니다.");
	}
	
	public static void main(String[] args) throws Exception  {
		new StoreApp().start();
	}
}
