package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.domain.Role;
import edu.mum.waa.tmattendanceservice.repository.RoleRepository;
import edu.mum.waa.tmattendanceservice.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Role readRole(String roleId) {
		return roleRepository.findById(roleId).get();
	}

	@Override
	public Role updateRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Role deleteRole(String roleId) {
		Role role = readRole(roleId);
		roleRepository.delete(role);
		return role;
	}

}
