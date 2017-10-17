package sample4;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainController {
	
	@FXML
	private void clickedBtn1() {
		showAlert(AlertType.INFORMATION, "첫번째 버튼이 클릭되었습니다.");
	}
	
	@FXML
	private void clickedBtn2() {
		showAlert(AlertType.WARNING, "두번째 버튼이 클릭되었습니다.");
	}
	
	@FXML
	private void clickedBtn3() {
		showAlert(AlertType.ERROR, "세번째 버튼이 클릭되었습니다.");
	}
	
	@SuppressWarnings("unused")
	private void showAlert(AlertType alertType, String message) {
		Alert alert = new Alert(alertType);
		alert.setTitle("안내창");
		alert.setHeaderText("버튼 클릭 안내");
		alert.setContentText(message);
		alert.showAndWait();
	}
}
