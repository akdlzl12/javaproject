package example3;

public class HumanResource {
	

	
	private int year;
	private String organization; 
	private String department;
	private String position;
	private int positionCount;
	private int plannedPositionCount;
	
	public HumanResource(int year, String organization, String department, String position, int positionCount,
			int plannedPositionCount) {
		super();
		this.year = year;
		this.organization = organization;
		this.department = department;
		this.position = position;
		this.positionCount = positionCount;
		this.plannedPositionCount = plannedPositionCount;
	}
	
	public HumanResource() {
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPositionCount() {
		return positionCount;
	}

	public void setPositionCount(int positionCount) {
		this.positionCount = positionCount;
	}

	public int getPlannedPositionCount() {
		return plannedPositionCount;
	}

	public void setPlannedPositionCount(int plannedPositionCount) {
		this.plannedPositionCount = plannedPositionCount;
	}

		
	
}
