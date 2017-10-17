package example4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDao {
	
	String insertSQL = "insert into tb_books(no,title,author,publisher,price,pubdate,discount)"
						 + "values (book_seq.nextval, ?,?,?,?,sysdate,'N')";
	
	String deleteSQL = "delete from tb_books "
						+ "where no = ? ";
	
	public void addBook(Book book) throws SQLException {
		Connection con = DBUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSQL);
		pstmt.setString(1, book.getTitle());
		pstmt.setString(2, book.getAuthor());
		pstmt.setString(3, book.getPublisher());
		pstmt.setInt(4, book.getPrice());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
	
	public void deleteBookByNo(int no) throws SQLException {
		Connection con = DBUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSQL);
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
}
