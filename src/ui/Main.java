package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}//End main
	@Override
	public void start(Stage window) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
		Scene scene = new Scene(root,null);
		window.setTitle("Contact Manager");
		window.setScene(scene);
		window.show();
	}//End start

}
