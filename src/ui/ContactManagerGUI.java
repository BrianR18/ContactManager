package ui;

import model.ContactManager;
import model.Contact;

import java.io.File;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;

public class ContactManagerGUI {
	@FXML private Pane mainPane;
	@FXML private TextField tfName;
	@FXML private TextField tfEmail;
	@FXML private TableView<Contact> table;
	@FXML private TableColumn<Contact,String> num;
	@FXML private TableColumn<Contact,String> name;
	@FXML private TableColumn<Contact,String> email;
	private ContactManager contacts;
	
	public ContactManagerGUI() {
		contacts = new ContactManager();
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
		initializeContactList();
	}//End changeSceneAddContact
	@FXML
	public void saveContact(){
		Alert info = new Alert(null);
		info.setTitle("Status");
		if(!tfName.getText().equals("") && !tfEmail.getText().equals("")){
			contacts.addContact(tfName.getText(),tfEmail.getText());
			tfName.setText("");
			tfEmail.setText("");
			info.setAlertType(AlertType.INFORMATION);
			info.setContentText("The contact has been added successfully.");
		}//End if
		else {
			info.setAlertType(AlertType.ERROR);
			info.setContentText("Error, the fields are void.");
		}//End else
		info.setHeaderText(null);
		info.showAndWait();
	}//End saveContact
	
	private void initializeContactList(){
		ObservableList<Contact> contactList = FXCollections.observableArrayList(contacts.getContacts());
		table.setItems(contactList);
		 name.setCellValueFactory(new PropertyValueFactory<Contact,String>("name"));
		 email.setCellValueFactory(new PropertyValueFactory<Contact,String>("email"));
	}//End initializaContactList
	@FXML
	public void importData(){
		
	}
	@FXML
	public void exportData(){
		
	}//End exportData
	
	private File chooseFile(){
		FileChooser file = new FileChooser();
		
	}//End chooseFile
}//End ContactManagerGUI
