package sample;

import java.awt.print.Book;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import vo.BookVO;

public class IbatisSample {
	public static void main(String[] args) throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlMapClient sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
		
		/*sqlMapClient.delete("deleteAllbooks");
		
		BookVO book = new BookVO();
		book.setTitle("기사단장 죽이기 1");
		book.setAuthor("무라카미 하루키");
		book.setPublisher("문학동네");
		book.setPrice(14670);
		
		sqlMapClient.insert("addBook", book);
		
		sqlMapClient.delete("deleteBookByNo", 2);*/
		
		// BookVO book = (BookVO)sqlMapClient.queryForObject("getBookByNo", 21);
		
		/*List<BookVO> books = sqlMapClient.queryForList("getBooksByPublisher", "한빛미디어");
		for (BookVO bookVO : books) {
			System.out.println(bookVO.toString());
		}*/
		
		HashMap<String, Object> map = (HashMap<String, Object>) sqlMapClient.queryForObject("getJobById", "IT_PROG");
		System.out.println(map);
	}
}
