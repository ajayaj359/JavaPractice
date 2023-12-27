package RactivePrograms;

public class User {
	
	private String name;
    private String occupation;
    
	public User(String name, String occupation) {
		super();
		this.name = name;
		this.occupation = occupation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", occupation=" + occupation + "]";
	}

    
    
}
