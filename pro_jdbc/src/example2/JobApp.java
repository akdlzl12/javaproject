package example2;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class JobApp {
	public static void main(String[] args) throws Exception {
		
		
		
		JobDAO dao = new JobDAO();
		Job job1 = dao.findJob("IT_PROG");
		System.out.println(job1);
		
		List<Job> job2 = dao.findAllJobs();
		System.out.print(job2);
	}
}
