package model;

import java.util.ArrayList;
public class ContactManager {
	private ArrayList<Contact> contacts;
	
	public ContactManager(){
		contacts = new ArrayList<Contact>();
	}//End Constructor
	public void addContact(String name, String email) {
		contacts.add(new Contact(name,email));
	}//End addContact
	
	public ArrayList<Contact> getContacts(){
		return contacts;
	}//End getContacts
}
