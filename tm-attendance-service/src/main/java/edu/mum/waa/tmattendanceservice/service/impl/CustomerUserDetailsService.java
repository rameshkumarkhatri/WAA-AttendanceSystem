package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.domain.User;
import edu.mum.waa.tmattendanceservice.domain.UserSecurity;
import edu.mum.waa.tmattendanceservice.service.UserService;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

	@Autowired
	UserService userService;

	@Autowired
	BCryptPasswordEncoder encoder;

	@Bean
	public static BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	public CustomerUserDetailsService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserSecurity loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userService.findByUserName(userName); 
		user.setPassword(encoder.encode(user.getPassword())); 
		return new UserSecurity(user);
	}

}
