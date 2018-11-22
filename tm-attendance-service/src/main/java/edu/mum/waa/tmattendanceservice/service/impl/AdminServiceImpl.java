package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.adapters.UserAdapater;
import edu.mum.waa.tmattendanceservice.domain.Admin;
import edu.mum.waa.tmattendanceservice.domain.User;
import edu.mum.waa.tmattendanceservice.repository.AdminRepository;
import edu.mum.waa.tmattendanceservice.service.AdminService;
import edu.mum.waa.tmattendanceservice.service.RoleService;
import edu.mum.waa.tmattendanceservice.service.UserService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;

	@Override
	public Admin createAdmin(Admin admin) {
		User user = UserAdapater.getUser(admin);
		userService.createUser(user);
		return adminRepository.save(admin);
	}

	@Override
	public Admin readAdmin(long adminId) {
		return adminRepository.findById(adminId).get();
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public Admin deleteAdmin(long adminId) {
		Admin admin = readAdmin(adminId);
		adminRepository.delete(admin);
		return admin;
	}

}
