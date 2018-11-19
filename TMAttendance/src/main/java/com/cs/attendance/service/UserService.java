package com.cs.attendance.service;

import com.cs.attendance.domain.User;

public interface UserService {
	
	public User loginUser(String email, String password);
}
