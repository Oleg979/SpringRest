package api.posts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public List<Post> getAllPosts(String id) {
		List<Post> posts = new ArrayList<>();
		postRepository.findByUserId(id).forEach(posts::add);
		return posts;
	}
	
	public Post getPost(String id) {
		return postRepository.findById(id).get();
	}

	public void addPost(Post post) {
		postRepository.save(post);
	}

	public void updatePost(Post post) {
		postRepository.save(post);
	}

	public void deletePost(String id) {
		postRepository.deleteById(id);
	}
}
