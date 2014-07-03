package com.netpalese.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netpalese.domain.entity.User;
import com.netpalese.service.UserService;

@Controller
@RequestMapping("/home.do")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(final Model model) {
		List<User> users = userService.listAllUsers();
		model.addAttribute("users", users);
		return "home";
	}
}