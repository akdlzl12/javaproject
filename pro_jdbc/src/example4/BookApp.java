package example4;

import java.sql.SQLException;

public class BookApp {
	public static void main(String[] args) throws SQLException {
		BookDao dao = new BookDao();
		Book book = new Book();
		book.setTitle("JAP 프로그래밍입문");
		book.setAuthor("최범균");
		book.setPublisher("가메출판사");
		book.setPrice(28000);
		
		dao.addBook(book);
	}
}
