package guestbook;

public class Regular implements Guest{
	String name;
	
	public Regular(String name) {
		this.name=name;
	}
	
	@Override
	public String getGuestListing() {
		return null;
	}

	public String toString() {
		return name;
	}
}
