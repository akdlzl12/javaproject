package sample5;

import java.text.ParseException;
import java.util.Date;

public class ProductApp {
	public static void main(String[] args) throws ParseException {
		
		ProductMgr mgr = new ProductMgr();
		
		Product clothesP1 = new Product(1, "옷", "줄무늬 와이셔츠", "30000", new Date(), false);
		Product clothesP2 = new Product(2, "옷", "스프라이트 와이셔츠", "15000", new Date(), true);
		Product clothesP3 = new Product(3, "옷", "후드티", "20000", new Date(), false);
		Product clothesP4 = new Product(4, "옷", "맨투맨", "10000", new Date(), true);
		Product clothesP5 = new Product(5, "옷", "청바지", "50000", new Date(), false);
		Product appliancesP1 = new Product(1, "냉장고", "LG디오스", "3000000", new Date(), false);
		Product appliancesP2 = new Product(2, "Tv", "삼성LCD와일드모니터", "2000000", new Date(), true);
		Product appliancesP3 = new Product(3, "공기청정기", "샤오미", "1500000", new Date(), false);
		
		mgr.addProductList(clothesP1);
		mgr.addProductList(clothesP2);
		mgr.addProductList(clothesP3);
		mgr.addProductList(clothesP4);
		mgr.addProductList(clothesP5);
		mgr.addProductList(appliancesP1);
		mgr.addProductList(appliancesP2);
		mgr.addProductList(appliancesP3);
		
		// mgr.printProductList();
		System.out.println(mgr.informationProductList(1).getName());
		System.out.println(mgr.kindProductList("옷").toString());
		System.out.println(mgr.saleProductList());
		mgr.warehousingProductList("2017-05-22");
		
		
	}
}
