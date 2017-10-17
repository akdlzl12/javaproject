package example3;

import java.io.IOException;
import java.util.List;

public class HumanResourceApp {
	public static void main(String[] args) throws IOException {
		HumanResourceRepository repository = new HumanResourceRepository();
		
		List<HumanResource> result = repository.searchRecordsByOrganization("Asia Pacific");
		System.out.println("조회건수: " + result.size());
	}
}
