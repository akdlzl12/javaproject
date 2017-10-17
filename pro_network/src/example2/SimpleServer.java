package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		System.out.println("Server started ...");
		// accept()는 클라이언트의 연결요청이 오면 그 요청을 수락하고
		// 연결요청을 보낸 클라이언트와 통신하는 새로운 소켓객체를 만들어서 반환한다. 
		// accept()는 blocking 메소드다. 클라이언트의 연결요청이 올 때까지 실행이 지연된다.
		while(true) {
		System.out.println("Waition for connection ...");
		Socket socket = server.accept();
		String clientIpAddress = socket.getInetAddress().getHostAddress();
		System.out.println("접속한 클라이언트 ip: " + clientIpAddress);
		
		// 클라이언트와 데어터 교환을 하기위해 스트림 만들기
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		
		// 클라이언트가 보낸 메세지 수신하기
		// 클라이언트가 메세지를 보낼때 까지 대기한다.
		String message = in.readLine();
		System.out.println("[" + clientIpAddress + "]" + message);
		
		// 클라이언트로 응답메세지 송신하기
		out.println("[서버응답]" + message);
		
			if(message.equals("꺼져")) {
				break;
			}
		}
		
		
	}
}
