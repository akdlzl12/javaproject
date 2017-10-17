package example3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "zxcv1234");
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
