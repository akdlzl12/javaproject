package chat;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class Client extends JFrame {
	private JTextArea area = new JTextArea();
	private JTextField field = new JTextField();
	private JButton btn = new JButton("전송");
	
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public Client() throws Exception {
		init();
		connect();
	}
	
	private void init() {
		area.setEditable(false);

		JPanel panel = new JPanel(new BorderLayout());
		panel.add(field, BorderLayout.CENTER);
		panel.add(btn, BorderLayout.EAST);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel2.add(new JLabel("1703기 채팅방"));
		
		add(panel2, BorderLayout.NORTH);
		add(new JScrollPane(area), BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		
		setBounds(100, 100, 400, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		field.addActionListener(e -> sendMessage());
		btn.addActionListener(e -> sendMessage());
		
	}
	
	private void sendMessage() {
		try {
			String text = field.getText().trim();
			if(!text.isEmpty()) {
				if(text.contains("/")) {
					String[] items = text.split("/");
					out.println("S:" + items[0] + ":" + items[1]);
				}else {
					out.println("M: " + text);
				}
				
			}
			
			field.setText("");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(this, "서버와 연결이 끊어졌습니다.", "연결 에러", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void connect() throws IOException {
		socket = new Socket("192.168.10.88", 9999);
		out = new PrintWriter(socket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		out.println("I: 폭풍저그 홍진호가 간다~"); 
		
		ClientThread t = new ClientThread(in, area);
		t.start();
	}
	
	public static void main(String[] args) throws Exception {
		new Client();
	}
}
