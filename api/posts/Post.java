package api.posts;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import api.users.User;

@Entity
public class Post {
	private String name;
	private String pass;
	@Id
	private String id;
	@ManyToOne
	private User user;
	
	
	public Post(String name, String pass, String id, String userId) {
		super();
		this.name = name;
		this.pass = pass;
		this.id = id;
		this.user = new User("", "", userId);
	}
	public Post() {
		
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
