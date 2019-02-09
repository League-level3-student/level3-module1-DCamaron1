package guestbook;

public class Regular implements Guest{
	private String name;
	
	public Regular(String name) {
		this.name=name;
	}
	
	public String getGuestListing() {
		return name;
	}

	public String toString() {
		return name;
	}
}
