package com.cs.attendance.service;

import java.util.List;

import com.cs.attendance.domain.User;

public interface UserService {
	
	public User loginUser(String email, String password);
	public User loginUser(String email);
	public List<User> getUsers();
	public User save(User user);
}
