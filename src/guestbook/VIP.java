package guestbook;

public class VIP implements Guest{
	String name; 
	
	public VIP(String name) {
		this.name= "VIP: " + name;
	}
	
	@Override
	public String getGuestListing() {
		
		return null;
	}
	
	public String toString() {
		return name;
		
	}
	
}
