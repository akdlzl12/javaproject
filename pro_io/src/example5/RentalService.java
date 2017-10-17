package example5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalService {
	
	List<Rental> repo = new ArrayList<>();
	
	
	// 대여 기능
	public void rent(Rental rental) {
		
	}
	
	// 전달받은 책제목과 일치하는 대여정보를 화면에 표시한다.
	// repo에 저장된 Rental정보 중에서 제목과 일치하고 대여중인 정보를 화면에 표시한다.
	public void searchByTitle(String title) {
		
		for (Rental rental : repo) {
			if(rental.getTitle().contains(title)) {
				System.out.println("Rental [no=" + rental.getNo() + ", title=" + rental.getTitle() + ", username=" + rental.getUsername() + ", rentDate=" + rental.getRentDate()
						+ ", backDate=" + rental.getBackDate() + ", back=" + rental.getback() + "]");
				System.out.println(rental);
			}
		}
	}
	
	// 전달받은 고객과 일치하는 대여정보를 화면에 표시한다.
	// repo에 저장된 Rental정보 중에서 고객명과 일치하고 대여중인 정보를 화면에 표시한다.
	public void searchByUsername(String username) {
		for (Rental rental : repo) {
			if(rental.getUsername().contains(username)) {
				System.out.println("Rental [no=" + rental.getNo() + ", title=" + rental.getTitle() + ", username=" + rental.getUsername() + ", rentDate=" + rental.getRentDate()
						+ ", backDate=" + rental.getBackDate() + ", back=" + rental.getback() + "]");
			}
		}
	}
	
	// 전달받은 날짜에 대여된 대여정보를 화면에 표시한다.
	// repo에 저장된 Rental정보 중에서 대여날짜와 일치하고 대여중인 정보를 화면에 표시한다.
	public void searchByRentalDate(String strDate) {
		for (Rental rental : repo) {
			if(rental.getRentDate().contains(strDate)) {
				System.out.println("Rental [no=" + rental.getNo() + ", title=" + rental.getTitle() + ", username=" + rental.getUsername() + ", rentDate=" + rental.getRentDate()
						+ ", backDate=" + rental.getBackDate() + ", back=" + rental.getback() + "]");
			}
		}
	}
	
	// 전달받은 대여번호와 일치하는 대여정보를 찾아서 반납처리한다.
	// repo에 저장된 Rental정보 중에서 대여번호와 일치하는 대여정보의 반납여부를 1로 변경한다.
	public void back(long rentNo) {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		for (Rental rental : repo) {
			if(rentNo == rental.getNo()) {
				rental.setBack(1);
				rental.setBackDate(sdf.format(d));
			}
		}
	}
	
	// repo에 저장된 Rental정보 중에서 모든 대여정보를 화면에 표시한다.
	public void displayAll() {
		for (Rental rental : repo) {
			System.out.println("Rental [no=" + rental.getNo() + ", title=" + rental.getTitle() + ", username=" + rental.getUsername() + ", rentDate=" + rental.getRentDate()
					+ ", backDate=" + rental.getBackDate() + ", back=" + rental.getback() + "]");		
			
		}
	}
	
	public RentalService() throws IOException {
		load();
	}
	
	
	private long stringlong(String str) {
		try {
			return Long.parseLong(str);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	private int stringInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	// 파일로 저장된 대여정보를 읽어서 repo에 저장한다.
	public void load() throws IOException {
		
		InputStreamReader fr = new InputStreamReader(new FileInputStream("C:\\Temp\\rentalInfomation.txt"), "euc-kr");
		BufferedReader br = new BufferedReader(fr);
		
		
		String record = null;
		
		while((record = br.readLine()) != null) {
			String[] strArr = record.split(",");
			
			Rental rental = new Rental();
			
			rental.setNo(stringlong(strArr[0]));
			rental.setTitle(strArr[1]);
			rental.setUsername(strArr[2]);
			rental.setRentDate(strArr[3]);
			rental.setBack(stringInt(strArr[4]));
			try {
				rental.setBackDate(strArr[5]);
			} catch (Exception e) {
				rental.setBackDate("0");
			}
			
			
					
			repo.add(rental);
			
			
		}
		
		br.close();
		
	}
	
	// repo에 저장된 대여정보를 파일에 저장한다.
	public void store() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Temp\\rentalInfomation.txt"), "euc-kr");
		PrintWriter pw = new PrintWriter(osw, true);
		for (Rental rental : repo) {
			pw.println(rental.getNo() + "," + rental.getTitle() + "," + rental.getUsername() + "," + rental.getRentDate() + "," + rental.getBackDate() + "," + rental.getback());
		}
		pw.close();
		
		
	}
	// 대여 정보를 전달받아서 저장하는 기능
	
	
	// 조회 기능
	// 책제목을 전달받아서 대여 정보를 출력하는 기능
	// 고객명을 전달받아서 대여 정보를 출력하는 기능
	// 날짜를 전달받아서 대여 정보를 출력하는 기능
	
	
	// 반납 기능
	// 대여번호를 전달받아서 반납처리 하는 기능
	
	
	// 파일 저장 기능
	// 모든 대여정보를 파일로 저장하는 기능
	
	
	// 파일 읽기 기능
	// 객체생성시 파일로 저장된 모든 대여정보를 읽어오는 기능
	
	
}
