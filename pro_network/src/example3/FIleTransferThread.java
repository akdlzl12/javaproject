package example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;


public class FIleTransferThread extends Thread{
	
	private Socket socket;
	
	private BufferedReader in;
	private DataOutputStream out;
	
	public FIleTransferThread(Socket socket) {	
		this.socket = socket;
	}

	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new DataOutputStream(socket.getOutputStream());
			
			
				String filename = in.readLine();
				System.out.println("요청파일명: " + filename);
				
				File file = new File("C:\\Temp", filename);
				out.writeUTF(file.getName());
				out.writeLong(file.length());
				
				FileInputStream fis = new FileInputStream(file);
				int value = 0;
				while((value = fis.read()) != -1) {
					out.write(value);
				}
				fis.close();


		} catch (IOException e) {
			System.out.println("[" + socket.getInetAddress().getHostAddress() + "]");
		}
	}
}
