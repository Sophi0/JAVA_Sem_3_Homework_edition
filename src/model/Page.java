package model;

import java.util.ArrayList;

import model.users.User;

public class Page {
	//1.variables
	private String title;
	private String description;
	private ArrayList<User> followers = new ArrayList<>(); 
	private ArrayList<Post> postsInPage = new ArrayList<>();
	
	//2.get and set
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String inputTitle) {
		if(inputTitle != null && inputTitle.length() > 4 && inputTitle.length() < 31) {
			title = inputTitle;
		}
		else {
			title = "---TITLE---";
		}
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String inputDescription) {
		if(inputDescription != null && inputDescription.length() > 10 && inputDescription.length() < 31) {
			description = inputDescription;
		}
		else {
			description = "---DESCRIPTION---";
		}
	}
	
	public ArrayList<User> getFollowers(){
		return followers;
	}
	
	public void addFollower(User follower) {
		if(!followers.contains(follower)) {
			followers.add(follower);
		}
	}
	
	public void removeFollower(User unFollower) {
		if(followers.contains(unFollower)) {
			followers.remove(unFollower);
		}
	}
}
