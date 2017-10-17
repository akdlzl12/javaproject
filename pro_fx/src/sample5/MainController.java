package sample5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class MainController {
	
	@FXML private ComboBox<String> deptComboBox;
	@FXML private Button searachBtn;
	
	@FXML
	private void initialize() throws Exception {
		List<String> deptList = Arrays.asList("전자공학과", "기계공학과", "환경공학과", "토목공학과", "건축공학과");
		ObservableList<String> data = FXCollections.observableArrayList();
		data.addAll(deptList);
		deptComboBox.setItems(data);
		deptComboBox.getSelectionModel().selectFirst();
		
		searachBtn.setOnAction(e -> {
			String value = deptComboBox.getSelectionModel().getSelectedItem();
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("확인");
			alert.setContentText("선택된 학과: " + value);
			alert.showAndWait();
		});
	}
	
}
