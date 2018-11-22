package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.Role;

public interface RoleService {
	Role createRole(Role role);

	Role readRole(String roleId);

	Role updateRole(Role role);

	Role deleteRole(String roleId);
}
