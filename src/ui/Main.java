package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	private ContactManagerGUI CMG;
	
	public Main(){
		CMG = new ContactManagerGUI();
	}//End constructor
	public static void main(String[] args) {
		launch(args);
	}//End main
	@Override
	public void start(Stage window) throws Exception {
		FXMLLoader fxml = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
		fxml.setController(CMG);
		Parent root = fxml.load();
		Scene scene = new Scene(root,null);
		window.setTitle("Contact Manager");
		window.setScene(scene);
		window.show();
		CMG.showSceneAddContact(null);
	}//End start

}
