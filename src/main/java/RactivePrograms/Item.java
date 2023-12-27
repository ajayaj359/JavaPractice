package RactivePrograms;

import java.util.List;

public class Item {
	
	private int id;
    private List<User> users;
    private String role;
    
	public Item(int id, List<User> users, String role) {
		super();
		this.id = id;
		this.users = users;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", users=" + users + ", role=" + role + "]";
	}
    
    

}
