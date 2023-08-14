package com.takeo.service;

import java.util.List;
import java.util.Optional;

import com.takeo.entity.Admin;

public interface AdminService {
	
	public Admin createAdmin(Admin admin);
	public Optional<Admin> getAdminById(long id);
	List<Admin> getAllAdmins();
	public Admin updateAdmin(Admin admin);
	public boolean deleteAdmin(long id);
	List<Admin> getAdminByUsername(Admin admin);
	//public boolean verifyUsernameAndPassword(String username, String password);

}
