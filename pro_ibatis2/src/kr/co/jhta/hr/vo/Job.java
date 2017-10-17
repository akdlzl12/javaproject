package kr.co.jhta.hr.vo;

public class Job {
	
	private Employee jobId;
	private String jobTitle;
	private int minSalary;
	private int maxSalary;
	
	public Job() {}
	
	public Employee getJobId() {
		return jobId;
	}
	public void setJobId(Employee jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}
	public int getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}
}
