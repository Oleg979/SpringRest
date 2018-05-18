package api.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import api.users.User;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/users/{id}/posts")
	public List<Post> getAllPosts(@PathVariable String id) {
		return postService.getAllPosts(id);
	}
	
	@GetMapping("/users/{userId}/posts/{id}")
	public Post getPost(@PathVariable String id) {
		return postService.getPost(id);
	}
	
	@PostMapping("/users/{userId}/posts")
	public void addPost(@RequestBody Post post, @PathVariable String userId) {
		post.setUser(new User("", "", userId));
		postService.addPost(post);
	}
	
	@PutMapping("/users/{userId}/posts/{id}")
	public void updatePost(@RequestBody Post post, @PathVariable String id, @PathVariable String userId) {
		post.setUser(new User("", "", userId));
		postService.updatePost(post);
	}
	
	@DeleteMapping("/users/{userId}/posts/{id}")
	public void deletePost(@PathVariable String id) {
		postService.deletePost(id);
	}
	
	
}
