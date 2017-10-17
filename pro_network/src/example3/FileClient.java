package example3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.10.88", 9999);
		
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		DataInputStream in = new DataInputStream(socket.getInputStream());
		
		// 다운로드할 파일명을 서버로 보내기
		out.println("c.zip");
		
		// 서버가 보낸 데이터 받기
		// 파일명 받기
		String filename = in.readUTF();
		System.out.println("파일명: " + filename);
		
		// 파일 사이즈 받기
		long filesize = in.readLong();
		System.out.println("파일 사이즈: " + filesize);
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\" + filename);
		int value = 0;
		int readBytes = 0;
		int prevStatus = 0;
		while((value = in.read()) != -1) {
			fos.write(value);
			readBytes++;
			int status = (int) ((readBytes/(double) filesize) * 10);
			if(status > prevStatus) {
				System.out.print("+");
				prevStatus = status;
			}
		}
		
		fos.close();
		System.out.println("파일 다운로드 완료!");
		socket.close();
		
	}
}
