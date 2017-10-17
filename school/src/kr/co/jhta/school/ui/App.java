package kr.co.jhta.school.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(App.class.getResource("LoginForm.fxml"));
		AnchorPane layout = loader.load();
		
		LoginFormComtroller comtroller = loader.getController();
		comtroller.setPrimaryStage(primaryStage);
		
		Scene scene = new Scene(layout);
		primaryStage.setTitle("학사관리 프로그램 - 로그인");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
