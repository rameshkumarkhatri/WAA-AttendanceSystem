package edu.mum.waa.tmattendanceservice.adapters;

import edu.mum.waa.tmattendanceservice.domain.Role;
import edu.mum.waa.tmattendanceservice.domain.User;

public class UserAuthPair {
	private User user;
	private Role role;

	public UserAuthPair(User user, String roleName) {
		super();
		this.user = user;
		this.role = new Role();
		this.role.setUserName(user.getUserName());
		this.role.setRole(roleName);
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

}
