package kr.co.jhta.hr.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.hr.util.IbatisUtils;
import kr.co.jhta.hr.vo.Job;

public class jobDao {
	
	@SuppressWarnings("unchecked")
	public List<Job> lookupJobIdInformation(String jobId) throws SQLException {
		return IbatisUtils.getSqlMapClient().queryForList("lookupJobIdInformation",	jobId);
	}
}
