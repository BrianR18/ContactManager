package ui;

import model.Contact;
import java.util.ArrayList;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class ContactManagerGUI {
	private ArrayList<Contact> contacts;
	@FXML private Pane mainPane;
	
	public ContactManagerGUI() {
		contacts = new ArrayList<Contact>();
	}//End constructor.
	@FXML
	public void showSceneAddContact(ActionEvent event) throws IOException{
		Parent addContactScene = FXMLLoader.load(getClass().getResource("addContactWindow.fxml"));
		mainPane.getChildren().setAll(addContactScene);
	}//End changeSceneAddContact
	@FXML
	public void showSceneContactList(ActionEvent event) throws IOException{
		Parent addContactScene = FXMLLoader.load(getClass().getResource("ContactListWindow.fxml"));
		mainPane.getChildren().setAll(addContactScene);
	}//End changeSceneAddContact
}
