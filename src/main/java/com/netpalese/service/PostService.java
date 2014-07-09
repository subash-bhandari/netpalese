package com.netpalese.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netpalese.controller.model.PostDetail;
import com.netpalese.domain.entity.Category;
import com.netpalese.domain.entity.Post;
import com.netpalese.domain.entity.PostContent;
import com.netpalese.domain.entity.User;
import com.netpalese.repository.CategoryRepository;
import com.netpalese.repository.PostRepository;
import com.netpalese.repository.UserRepository;

@Service
public class PostService extends AbstractService {

	@Autowired
	private PostRepository postRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Post> getPostsRecentFirst() {
		return postRepository.getPostsRecentFirst();
	}
	
	public void createPost(PostDetail postDetail) {
		User author = userRepository.getByUsername(getUsername());
		
		Post post = new Post();
		post.setTitle(postDetail.getTitle());
		Date timestamp = new Date();
		post.setCreatedAt(timestamp);
		post.setUpdatedAt(timestamp);
		post.setAuthor(author);
		postRepository.save(post);
		
		PostContent postContent = new PostContent();
		postContent.setContent(postDetail.getContent());
		post.setPostContent(postContent);
		postContent.setPost(post);
		postRepository.save(postContent);
		
		List<Category> existingCategories = categoryRepository.getCategories(postDetail.getCategories());
		post.setCategories(existingCategories);
		List<String> newCategoryNames = new ArrayList<String>(postDetail.getCategories());
		for(Category existingCategorie : existingCategories) {
			newCategoryNames.remove(existingCategorie.getCategory());
		}
		for(String newCategoryName : newCategoryNames) {
			Category newCategory = new Category();
			newCategory.setCategory(newCategoryName);
			postRepository.save(newCategory);
			post.addCategory(newCategory);
		}
	}
}
