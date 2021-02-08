package ui;

//import model.Contact;
//import java.util.ArrayList;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ContactManagerGUI {
	//private ArrayList<Contact> contacts;
	@FXML private Pane mainPane;
	@FXML private TextField tfName;
	@FXML private TextField tfEmail;
	
	public ContactManagerGUI() {
		//contacts = new ArrayList<Contact>();
	}//End constructor.
	@FXML
	public void showSceneAddContact(ActionEvent event) throws IOException{
		FXMLLoader fxml = new FXMLLoader(getClass().getResource("addContactWindow.fxml"));
		fxml.setController(this);
		Parent addContactScene = fxml.load();
		mainPane.getChildren().setAll(addContactScene);
	}//End changeSceneAddContact
	@FXML
	public void showSceneContactList(ActionEvent event) throws IOException{
		FXMLLoader fxml = new FXMLLoader(getClass().getResource("ContactListWindow.fxml"));
		fxml.setController(this);
		Parent contactListScene = fxml.load();
		mainPane.getChildren().setAll(contactListScene);
	}//End changeSceneAddContact
	@FXML
	public void saveContact(){
		
	}//End saveContact
}
