package example1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo5 extends JFrame {
	JButton redbtn = new JButton("빨강");
	JButton greenbtn = new JButton("초록");
	JButton yellowbtn = new JButton("노랑");
	
	JPanel redPanel = new JPanel();
	JPanel greenPanel = new JPanel();
	JPanel yellowPanel = new JPanel();
	
	CardLayout cardLayout = new CardLayout();
	
	JPanel centerPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	
	public Demo5() {
		redPanel.setBackground(Color.RED);
		greenPanel.setBackground(Color.GREEN);
		yellowPanel.setBackground(Color.YELLOW);
		
		centerPanel.setLayout(cardLayout);
		centerPanel.add("red", redPanel);
		centerPanel.add("green", greenPanel);
		centerPanel.add("yellow", yellowPanel);
		
		buttonPanel.add(redbtn);
		buttonPanel.add(greenbtn);
		buttonPanel.add(yellowbtn);
		
		add(centerPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.NORTH);
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Demo5();
	}
}
