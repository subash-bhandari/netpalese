package com.netpalese.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netpalese.domain.entity.Post;
import com.netpalese.service.PostService;

@Controller
@RequestMapping("/posts.do")
public class PostsController {
	
	@Autowired
	private PostService postService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getPostsRecentFirst(final Model model) {
		List<Post> posts = postService.getPostsRecentFirst();
		model.addAttribute("posts", posts);
		return "posts";
	}
}