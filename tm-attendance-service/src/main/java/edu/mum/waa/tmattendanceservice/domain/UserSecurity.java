package edu.mum.waa.tmattendanceservice.domain;

import org.springframework.security.core.authority.AuthorityUtils;

public class UserSecurity extends org.springframework.security.core.userdetails.User {

	

	private static final long serialVersionUID = 1L;
	User user;

	public UserSecurity(User user) {
		super(user.getUserName(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public String getId() {
		return user.getUserId();
	}

	public String getRole() {
		return user.getRole();
	}

}
