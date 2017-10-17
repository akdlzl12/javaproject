package example6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDamo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		User user = new User();
		user.setUserId("hong");
		user.setEmail("gildong@gmail.com");
		user.setPassword("zxcv1234");
		
		Car car = new Car();
		car.setYear(2017);
		car.setName("티볼리");
		car.setCompany("쌍용자동차");
		car.setPrice(20000000);
		
		user.setCar(car);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Temp\\user.sav"));
		
		oos.writeObject(user);
		
		oos.close();
	}
}
