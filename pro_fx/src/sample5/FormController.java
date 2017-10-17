package sample5;


import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FormController {
	
	@FXML private TextField idField;
	@FXML private PasswordField pwdField;
	
	private Stage primaryStage;
	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;	
	}
	
	@FXML
	private void clickedLoginBtn() throws IOException {
		String userId = idField.getText();
		String userPwd = pwdField.getText();
		
		if("hong".equals(userId) && "zxcv1234".equals(userPwd)) {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(FormController.class.getResource("MainUI.fxml"));
			AnchorPane mainLayout = loader.load();
			Scene scene = new Scene(mainLayout);
			
			primaryStage.setScene(scene);
			
		}else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("경고");
				alert.setHeaderText("로그인 실패");
				alert.setContentText("아이디 혹은 비밀번호가 올바르지 않습니다.");
				
				alert.showAndWait();
		}
	}
}
