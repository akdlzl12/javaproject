package example1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.lang.reflect.Field;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo6 extends JFrame{
	
	JButton btn = new JButton("버튼");
	JTextField field = new JTextField(20);
	JTextArea area = new JTextArea(3, 20);
	JComboBox<String> comboBox = new JComboBox<>(new String[] {"서울", "인천", "경기"});
	JCheckBox checkBox = new JCheckBox("야구");
	JRadioButton radio1 = new JRadioButton("남자");
	JRadioButton radio2 = new JRadioButton("여자");
	
	JButton btn1 = new JButton("찾아보기");
	JButton btn2 = new JButton("색상표");
	
	
	public Demo6() {
		setLayout(new FlowLayout());
		
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		
		add(btn);
		add(field);
		add(area);
		add(comboBox);
		add(checkBox);
		add(radio1);
		add(radio2);
		add(btn1);
		add(btn2);
		
		JFileChooser fileChooser = new JFileChooser();
		JColorChooser colorChooser = new JColorChooser();
		btn1.addActionListener(e -> fileChooser.showOpenDialog(this));
		btn2.addActionListener(e -> colorChooser.showDialog(this, "색상표", Color.BLACK));
		
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Demo6();
	}
}
