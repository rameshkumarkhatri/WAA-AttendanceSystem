package com.cs.attendance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.attendance.domain.User;
import com.cs.attendance.repository.UserRepository;
import com.cs.attendance.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	
//	@Autowired
//	UserRepository userRepo;
	
	@Override
	public User loginUser(String email, String password) {

//		return userRepo.login(email, password);
		return null;
		
		
	}

}
