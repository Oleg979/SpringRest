package api.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	private String name;
	private String pass;
	@Id
	private String id;
	
	public User(String name, String pass, String id) {
		super();
		this.name = name;
		this.pass = pass;
		this.id = id;
	}
	public User() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}
