package com.netpalese.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netpalese.controller.model.PostDetail;
import com.netpalese.service.PostService;

@Controller
@RequestMapping("/createpost.do")
public class CreatePostController {
	
	@Autowired
	private PostService postService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String createPost(final Model model) {
		String title = "This is where you give your post a title.";
		String content = "This is just a sample post content.";
		PostDetail pd = new PostDetail();
		pd.setTitle(title);
		pd.setContent(content);
		model.addAttribute("postDetail", pd);
		return "createpost";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String createPost(@Valid @ModelAttribute("postDetail") PostDetail postDetail, BindingResult br, final Model model) {
		if(br.hasErrors()) {
			return "createpost";
		}
		postService.createPost(postDetail);
		return "redirect:posts.do";
	}
}