package example5;

import java.io.IOException;

public class RentalApp {
	public static void main(String[] args) throws IOException {
		RentalService service = new RentalService();
		
		
		//service.searchByRentalDate("2017/07/04");
		
		//service.searchByTitle("톰캣");
		//service.searchByUsername("홍길동");
		service.back(1499157707808L);
		service.displayAll();
		service.store();
		
		
	}
}
