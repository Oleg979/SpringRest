package api.posts;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import api.users.User;

@Entity
public class Post {
	private String title;
	private String text;
	@Id
	private String id;
	@ManyToOne
	private User user;
	
	
	public Post(String title, String text, String id, String userId) {
		super();
		this.title = title;
		this.text = text;
		this.id = id;
		this.user = new User("", "", userId);
	}
	public Post() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
