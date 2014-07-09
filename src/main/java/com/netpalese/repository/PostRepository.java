package com.netpalese.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.netpalese.domain.entity.Post;

@Repository
public class PostRepository extends AbstractRepository<Post> {
	
	public List<Post> getPostsRecentFirst() {
		return executeNamedQuery("getPostsRecentFirst");
	}
	
}
