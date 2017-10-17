package example3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1 {
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("C:\\Temp\\IBM_HR_Training_2014-17.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String rec1 = br.readLine();
		String rec2 = br.readLine();
		
		
		br.close();
	}
}
