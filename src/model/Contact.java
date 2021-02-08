package model;

public class Contact {
	private String name;
	private String email;
	
	public Contact(){
		name = new String();
		email = new String();
	}//End constructor
	
	public Contact(String n, String e){
		name = n;
		email = e;
	}//End constructor
	
	public void setName(String name){
		this.name = name;
	}//End setName.
	public String getName(){
		return name;
	}
	public void setEmail(String email){
		this.email = email;
	}//End setName.
	public String getEmail(){
		return email;
	}
}
