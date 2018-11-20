package com.cs.attendance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.attendance.domain.User;
import com.cs.attendance.repository.UserRepository;
import com.cs.attendance.service.UserService;

@Service
//@Transactional
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public User loginUser(String email, String password) {

		return userRepo.login(email, password);
		
		
	}
	
	@Override
	public User loginUser(String email) {

		return userRepo.login(email);
		
		
	}
	
	public List<User> getUsers(){
		return (List<User>) userRepo.findAll();
		
	}
	
	public User save(User user) {
		return userRepo.save(user);
	}

}
