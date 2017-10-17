package example4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Job {
	
	public void fileupload(DataInputStream in, DataOutputStream out) throws IOException {
		String filename = in.readUTF();
		long filesize = in.readLong();
		
		System.out.println("업로드된 파일명: " + filename);
		System.out.println("업로드된 파일 사이즈: " + filesize);
		
		FileOutputStream fos = new FileOutputStream(new File("C:\\Temp", filename));
		byte[] buf = new byte[1024*8];
		int len = 0;
		while((len = in.read(buf)) != 1) {
			fos.write(buf, 0, len);
		}
		fos.close();
	} 
	
	public void fileDownload(DataInputStream in, DataOutputStream out) throws IOException {
		String filename = in.readUTF();
		File file = new File("C:\\Temp", filename);
		
		out.writeUTF("D");
		out.writeUTF("Success");
		
		out.writeUTF(filename);
		out.writeLong(file.length());
		
		FileInputStream fis = new FileInputStream(file);
		byte[] buf = new byte[1024*8];
		int len = 0;
		while((len = fis.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		fis.close();
	}
	
	public String[] filelist() {
		File dir = new File("C:\\Temp");
		return dir.list();
	}
}
