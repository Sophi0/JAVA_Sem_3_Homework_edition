package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
		if(inputMsg != null && inputMsg.length() > 3 && inputMsg.matches("[A-Za-z\b@#!%^&*]{8,}$")){ 
			msg = inputMsg;
		}
		else {
			msg = "-----";
		} 
	}
	
	public void setDateTime() {
		 dateTime = LocalDateTime.now();  
	}
	
	public void setCountOfLikes() {
		countOfLikes = 0;
	}
	
	public void increaseLikes() {
		countOfLikes++;
	}
	
	//3.constructors
	//no-args
	public Post() {
		setMsg("Test msg");
		setDateTime();
	}
	
	//args
	public Post(String msg) {
		setMsg(msg);
	}
	
	//4/toString
	//23/03/2023 13:57:30 -> mana zina(3)
	public String toString() {
	return dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")) 
			+ "-> " + msg + " (" + countOfLikes + ") ";
	}
	
}