package chat;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ClientThread extends Thread {
	private BufferedReader in;
	private JTextArea area;
	
	
	
	
	public ClientThread(BufferedReader in, JTextArea area) {
		
		this.in = in;
		this.area = area;
	}
	
	public void run() {
		try {
			while(true) {
				// 메세지 수신: 서버 -> 클라이언트
				String message = in.readLine();
				
				
				area.append(message + System.lineSeparator());
				area.setCaretPosition(area.getText().length());
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "서버와 연결이 끊어졌습니다.", "연결 에러", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
}
