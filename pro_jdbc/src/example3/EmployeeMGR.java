package example3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.io.BufferedReader;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class EmployeeMGR extends JFrame{
	
	private EmployeeDAO dao = new EmployeeDAO();
	
	
	private JTextField field = new JTextField();
	private JButton button = new JButton("조회");
	private EmployeeTableMode1 model = new EmployeeTableMode1();
	private JTable table = new JTable(model);
	
	public EmployeeMGR() {
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(new JLabel("	이름	"), BorderLayout.WEST);
		panel.add(field, BorderLayout.CENTER);
		panel.add(button, BorderLayout.EAST);
		
		this.add(panel, BorderLayout.NORTH);
		this.add(new JScrollPane(table), BorderLayout.CENTER);
		
		this.setBounds(100, 100, 600, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener((e) -> {
			try {
				// model에 저장된 기존 데이터 삭제하기
				model.clearData();
				
				// 입력필드의 값 읽어오기
				String searchName = field.getText(); 
				
				// 데이터베이스에서 직원정보 조회
				List<Employee> results =  dao.searchEmployeesByFirstName(searchName);
				
				// model에 조회된 결과 담기
				model.setData(results);
				
				// 데이터가 변경되었다는 사실을 알림
				model.fireTableDataChanged();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "조회 실패", "에러", JOptionPane.ERROR_MESSAGE);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new EmployeeMGR();
	}
}
