package model.users;

import model.Page;
import model.Post;
import model.PostType;
import service.MainService;

public abstract class User extends GuestUser { //ar abstract nedrikst izveidot objektus
	//1.variables
	private String username;
	private String encodedPassword;
	private String name; //for Business User it will be name of owner
	private String surname;
	
	//2.set and get
	public String getUsername() {
		return username;
	}
	public void setUsername(String inputUsername) {
		if(inputUsername != null && inputUsername.matches("[a-z0-9.]{8,20}")) {;
			username = inputUsername;
		}
		else {
			username = "default.user";
		}
	}
	
	public String getEncodedPassword() {
		return encodedPassword;
	}
	
	public void setEncodedPassword(String inputEncodedPassword) {
		if(encodedPassword != null && encodedPassword.matches("[a-z0-9.]{8,20}")) {
			encodedPassword = inputEncodedPassword;
		}
		else {
			encodedPassword = "defaultPassword";
		}
	}
	
	//TODO verification in setName and setSurname
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	//3.constructors
	//no-args
	public User() {
		super();
		setUsername("default.user");
		setEncodedPassword("defaultPassword");
		setName("DefaultName");
		setSurname("DefaultSurname");
	}
	
	//args
	public User(String name, String surname, String username, String password) {
		super();
		setName(name);
		setSurname(surname);
		setUsername(username);
		setEncodedPassword(password);
	}
	
	public String toString() {
		return "RU No." + getGenerateId() 
		+ ": " + name + " " + surname + ", " + username;
	}
	
	public boolean login() {
		for(User temp:MainService.allRegisterdUsers) {
			if(temp.getUsername().equals(username) 
					&& temp.getEncodedPassword().equals(encodedPassword)) {
				return true;
			}
		}
		return false;
	}
	
	public void followPage(Page page) throws Exception {
		if(page == null) {
			throw (new Exception("Page not found"));
		}
		page.addFollower(this);
	}
	
	//TODO unfollow page -> page.removefollower(this)
	
	public abstract void createPost(Post post, PostType type);
	
}
