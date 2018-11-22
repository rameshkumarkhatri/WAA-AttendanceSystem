package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.User;

public interface UserService {
	User createUser(User user);

	User readUser(String userId);

	User updateUser(User user);

	User deleteUser(String userId);
	
	User findByUserName(String userName);
}
