package kr.co.jhta.school.ui;



import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import oracle.net.aso.s;

public class LoginFormComtroller {
	
	@FXML private TextField studNoField;
	@FXML private TextField profNoField;
	@FXML private Button studViewBtn;
	@FXML private Button studAddBtn;
	@FXML private Button profViewBtn;
	@FXML private Button profAddBtn;
	
	private Stage primaryStage;
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	@FXML
	public void initialize() throws Exception {
		
		studViewBtn.setOnAction(e -> {
			
		});
		
		studAddBtn.setOnAction(e -> {
			try {
				FXMLLoader loader = new FXMLLoader(LoginFormComtroller.class.getResource("StudentAddForm.fxml"));
				AnchorPane layout = loader.load();
				StudentAddFormController controller = loader.getController();
				controller.setLoginedStudentNo(Integer.parseInt(studNoField.getText()));
				
				Scene scene = new Scene(layout);
				primaryStage.setTitle("학사관리프로그램 - 수강신청");
				primaryStage.setScene(scene);
				
			} catch (IOException e2) {
				e2.printStackTrace();
				System.exit(-1);
			}
			
			
		});
		
		profViewBtn.setOnAction(e -> {
			
		});
		
		profAddBtn.setOnAction(e -> {
			
		});
	}
	
}
