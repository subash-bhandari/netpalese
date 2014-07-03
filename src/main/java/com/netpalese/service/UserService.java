package com.netpalese.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netpalese.domain.entity.Authority;
import com.netpalese.domain.entity.User;
import com.netpalese.repository.UserRepository;

@Service
public class UserService extends AbstractService {
	

	@Autowired
	private UserRepository userRepository;
	
	public List<User> listAllUsers() {
		return userRepository.getAll();
	}
	
	public void createUser(User user) {
		user.setEnabled(true);
		Authority authority = new Authority();
		authority.setAuthority("ROLE_USER");
		authority.setUser(user);
		user.addAuthority(authority);
		userRepository.save(user);
		userRepository.save(authority);
	}
}
