package model.users;

public class GuestUser {
	private long generatedId;
	private static long idCounter = 0;
	
	
	public long getGenerateId() {
		return generatedId;
	}
	
	public void setGenerateId() {
		this.generatedId = idCounter++;
	}
	
	public GuestUser() {
		setGenerateId();
	}
	
	public String toString() {
		return "GU No.: " + generatedId;
	}
	
	//TODO add find functions
}
