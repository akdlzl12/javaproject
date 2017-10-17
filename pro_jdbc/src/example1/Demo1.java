package example1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// java - database연동 절차
		/*
		 * 1. JDBC 드라이버를 메모리에 로딩하기
		 * 2. 데이터베이스와 연결하기
		 * 3. SQL구문을 전송하는 객체 획득하기
		 * 4. SQL을 데이터베이스로 보내서 실행시키기
		 * 5. SQL 실행결과 처리하기
		 * 6. 데이터베이스와 연결 해제하기
		 * */
		
		// 1. jdbc 드라이버를 메모리에 로딩하고 드라이버레지스트리에 등록하기
		Class.forName("oracle.jdbc.OracleDriver");
		
		// 2. DriverManager를 사용해서 DB에 연결하기
		// DriverManager는 드라이버 관리 기능을 제공하는 클래스다.
		// 드라이버의 등록, 조회 등의 서비스를 제공한다.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "HR";
		String password = "zxcv1234";
		Connection connection = DriverManager.getConnection(url, user, password);
		
		// 3. SQL구문을 DB로 전송해주는 객체(Statement) 획득하기
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select department_id, department_name, manager_id FROM HR.departments");
		 
		while(rs.next()) {
			int id = rs.getInt("department_id");
			int maangerId = rs.getInt("manager_id");
			String name = rs.getString("department_name");
			
			System.out.println(id + "\t" + maangerId + "\t" + name);
		}
		rs.close();
		stmt.close();
		connection.close();
		
		
	}
}
