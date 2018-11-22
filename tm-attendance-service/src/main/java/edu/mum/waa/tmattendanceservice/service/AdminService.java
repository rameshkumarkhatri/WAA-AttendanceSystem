package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.Admin;

public interface AdminService {
	Admin createAdmin(Admin admin);

	Admin readAdmin(long adminId);

	Admin updateAdmin(Admin admin);

	Admin deleteAdmin(long adminId);
}
