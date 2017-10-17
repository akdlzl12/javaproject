package example3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HumanResourceRepository {
	private List<HumanResource> repo = new ArrayList<>();
	
	public HumanResourceRepository() throws IOException {
		
		load();
	}
	
	private void load() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Temp\\IBM_HR_Training_2014-17.txt"));
		
		String record = null;
		reader.readLine(); 		// 첫번째줄 읽고 버린다.
		
		while((record = reader.readLine()) != null) {
			String[] items = record.split(",");
			
			HumanResource hr = new HumanResource();
			hr.setYear(stringToTint(items[0]));
			hr.setOrganization(items[1]);
			hr.setDepartment(items[2]);
			hr.setPosition(items[3]);
			hr.setPositionCount(stringToTint(items[4]));
			hr.setPlannedPositionCount(stringToTint(items[5]));
			
			repo.add(hr);
			
		}
		System.out.println(repo.size() + "건의 자료 로딩완료");
		reader.close();
	}
	
	private int stringToTint(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	public List<HumanResource> searchRecordsByOrganization(String organization) {
		ArrayList<HumanResource> list = new ArrayList<>();
		
		for (HumanResource hr : repo) {
			if(hr.getOrganization().toLowerCase().contains(organization.toLowerCase())) {
				list.add(hr);
			}
		}
		
		return list;
	}
	
	public List<HumanResource> searchRecordsByDepartment(String department) {
		ArrayList<HumanResource> list = new ArrayList<>();
		
		return null;
	}
	
	public List<HumanResource> searchRecordsByPosition(String position) {
		ArrayList<HumanResource> list = new ArrayList<>();
		
		return null;
	}
}
