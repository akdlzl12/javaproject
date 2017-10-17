package example4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			
			while(true) {
				Socket socket = server.accept();
				
				ServerTherad t = new ServerTherad(socket);
				t.start();		
			}
		} catch (IOException e) {
			System.exit(-1);
		}
	}
}
