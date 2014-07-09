package com.netpalese.service;

import java.security.Principal;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public abstract class AbstractService {
	
	protected String getUsername() {
		Principal principal = SecurityContextHolder.getContext().getAuthentication();
		return principal.getName();
	}

}
