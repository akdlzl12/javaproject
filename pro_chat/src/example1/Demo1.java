package example1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo1 extends JFrame {
	// FFrame은 타이틀바, 최소화/최대화/닫기, 윈도우가 갖추고 있는 클래스다.
	
	JButton btn = new JButton("버튼");
	
	public Demo1() {
		
		// 타이틀 지정
		setTitle("처음으로 만들어 보는 윈도우");
		
		add(btn);
		
		// 위치, 사이즈 지정하기
		setBounds(500, 200, 400, 300);
		
		// 화면에 표시하기
		setVisible(true);
		
		// 닫기버튼 누르면 프로그램이 종료되도록 하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		
	}
}
