package kr.co.jhta.hr;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.hr.dao.jobDao;
import kr.co.jhta.hr.vo.Job;

public class jobApp {
	public static void main(String[] args) throws SQLException {
		jobDao jobDao = new jobDao();
		List<Job> job = jobDao.lookupJobIdInformation("IT_PROG");
		for (Job job2 : job) {
			System.out.println(job2.getJobId().getEmployeeId());
			System.out.println(job2.getJobId().getFirstName());

		}
	}
}
