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
@RequestMapping("/locations.do")
public class LocationsController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String users(final Model model) {
		List<User> users = userService.listAllUsers();
		model.addAttribute("users", users);
		return "locations";
	}
}