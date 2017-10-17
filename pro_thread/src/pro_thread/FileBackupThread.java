package pro_thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileBackupThread extends Thread {
	
	private String filename;
	
	public FileBackupThread(String filename) {
		super();
		this.filename = filename;
	}


	public void run() {
		try {
			FileInputStream fis = new FileInputStream("src/pro_thread/commons-beanutils-1.9.3.jar");
			FileOutputStream fos = new FileOutputStream("src/pro_thread/" + filename);
			int value = 0;
			while ((value = fis.read()) != -1) {
				fos.write(value);
				
			}
			
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
