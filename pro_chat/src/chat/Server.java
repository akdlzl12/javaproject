package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class Server {
	
	private Set<ServerThread> set = new HashSet<>();
	
	@SuppressWarnings("resource")
	public Server() {
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("Server started ...");
			
		} catch (IOException e) {
			System.out.println("Server Error - init");
			System.exit(-1);
		}
		
		while(true) {
			
			try {
				System.out.println("Waiting for connect ...");
				Socket socket = serverSocket.accept();
				
				ServerThread t = new ServerThread(socket, set);
				set.add(t);
				t.start();
				
			} catch (IOException e) {
				
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Server();
	}
}
