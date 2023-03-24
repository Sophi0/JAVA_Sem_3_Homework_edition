package model;

import java.time.LocalDateTime;

public class Post {
	//1.variables
	private String msg;
	private LocalDateTime dateTime;
	//TODO need to change to ArrayList of User, which set the like to this post
	public int countOfLikes;
	
	//2.get and set
	public String getMsg() {
		return msg;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public int getCountOfLikes() {
		return countOfLikes;
	}
	
	
	public void setMsg(String inputMsg) {
		if(inputMsg != null && inputMsg.matches("[A-Za-z\b@#!%^&*]{8,}$")){ 
			msg = inputMsg;
		}
		else {
			msg = "Unknown";
		} 
	}
	
	public void setDateTime() {
		 dateTime = LocalDateTime.now();  
	}
	
	public void setCountOfLikes() {
		countOfLikes = 0;
	}
	
	//3.constructors
	//no-args
	public Post() {
		setMsg("Unknown");
		setDateTime();
		setCountOfLikes();
	}
	
	//args
	public Post(String msg, LocalDateTime date, int countOfLikes) {
		setMsg(msg);
		setDateTime();
		setCountOfLikes();
	}
	
	//toString
	public String toString() {
	return "" + "Message: " + msg + ", " + "date: " + dateTime + ", " + "count of likes: " + countOfLikes;
	}
	
}