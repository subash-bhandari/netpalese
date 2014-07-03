package com.netpalese.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netpalese.repository.UserRepository;

@Service
public class AuthAuthService extends AbstractService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	
}
