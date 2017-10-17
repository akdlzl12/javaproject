package example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class EmployeeTableMode1 extends AbstractTableModel {

	private List<Employee> data = new ArrayList<>();
	private String[] columnNames = {"사원번호", "이름", "전화번호", "급여"};
	
	public void setData(List<Employee> data) {
		this.data = data;
	}
	
	public void clearData() {
		data.clear();
	}
	
	public String getColumnName(int column) {
		return columnNames[column];
	}
	
	@Override
	public int getRowCount() {
		return data.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object value = null;
		
		Employee emp = data.get(rowIndex);
		if(columnIndex == 0) {
			value = emp.getEmployeeId();
		}else if(columnIndex == 1) {
			value = emp.getFirstName();
		}else if(columnIndex == 2) {
			value = emp.getPhoneNumber();
		}else if(columnIndex == 3) {
			value = emp.getSalary();
		}else {
			value = "";
		}
		return value;
	}

	
	
}
