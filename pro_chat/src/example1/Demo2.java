package example1;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Demo2 extends JFrame{
	JButton btn1 =  new JButton("1");
	JButton btn2 =  new JButton("2");
	JButton btn3 =  new JButton("3");
	JButton btn4 =  new JButton("4");
	JButton btn5 =  new JButton("5");
	JButton btn6 =  new JButton("6");
	JButton btn7 =  new JButton("7");
	JButton btn8 =  new JButton("8");
	
	public Demo2() {
		add(btn1, BorderLayout.CENTER);
		add(btn2, BorderLayout.NORTH);
		
		add(btn4, BorderLayout.WEST);
		add(btn5, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		panel.add(btn3);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		add(panel, BorderLayout.SOUTH);
		
		setBounds(100,100,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Demo2();
	}

}
