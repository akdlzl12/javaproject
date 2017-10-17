package example6;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException,  ClassNotFoundException {
		Socket socket = new Socket("192.168.10.88", 8888);
		
		OutputStream os = socket.getOutputStream();
		InputStream is= socket.getInputStream();
		
		os.write('a');
		os.flush();
		
		
		
		ObjectInputStream ois = new ObjectInputStream(is);
		User user = (User) ois.readObject();
		System.out.println(user);
	}
}
