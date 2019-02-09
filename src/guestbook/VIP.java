package guestbook;

public class VIP implements Guest{
	private String name; 
	
	public VIP(String name) {
		this.name= name;
	}
	
	public String getGuestListing() {
		return "VIP: " + name;
	}
	
	public String toString() {
		return name;
		
	}
	
}
