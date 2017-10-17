package example2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JobDAO {
	// 새로운 Job을 저장하는 기능
	public void addJob(Job job) throws SQLException {
		
	}
	// jobId에 해당하는 job정보를 삭제하는 기능
	public void removeJob(String jobId) throws SQLException {
		
	}
	// jobId에 해당하는 job정보를 조회해서 반환하는 기능
	public Job findJob(String jobId) throws SQLException, ClassNotFoundException {
		Job job = null;
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT job_id, job_title, min_salary, max_salary ");
		sb.append("FROM jobs ");
		sb.append("WHERE job_id = '"+jobId+"' ");
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "zxcv1234");
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sb.toString());
		while(rs.next()) {
			job = new Job();
			String id = rs.getString("job_id");
			String title = rs.getString("job_title");
			int min = rs.getInt("min_salary");
			int max = rs.getInt("max_salary");
			
			job.setId(id);
			job.setTitle(title);
			job.setMinSalary(min);
			job.setMaxSalary(max);
			

		}
		
		rs.close();
		stmt.close();
		con.close();
		
		return job;
	}
	
	// 모든 job정보를 조회해서 반환하는 기능
	public List<Job> findAllJobs() throws Exception {
		List<Job> results = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT job_id, job_title, min_salary, max_salary ");
		sb.append("FROM jobs ");
		sb.append("ORDER BY job_id asc");
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "zxcv1234");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sb.toString());
		
		while(rs.next()) {
			Job job = new Job();
			job.setId(rs.getString("job_id"));
			job.setTitle(rs.getString("job_title"));
			job.setMinSalary(rs.getInt("min_salary"));
			job.setMaxSalary(rs.getInt("max_salary"));
			
			results.add(job);
		
		}
		
		rs.close();
		stmt.close();
		con.close();
		
		return results;
		
	}
}
