package model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
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
	
	public void importContactData(File contactData) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(contactData));
		String line = br.readLine();
		while(line!=null){
		   String[] parts = line.split(";");
		   addContact(parts[0],parts[1]);
		   line = br.readLine();
		}
		br.close();
	}
	
	public void exportContactData(File contactData) throws IOException{
		PrintWriter pw = new PrintWriter(contactData);
	    for(int i=0;i<contacts.size();i++){
	      Contact myContact = contacts.get(i);
	      pw.println(myContact.getName()+";"+myContact.getEmail());
	    }
	    pw.close();
	}//End exportData
}
