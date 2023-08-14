package com.takeo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takeo.entity.Admin;
import com.takeo.repo.AdminRepository;
import com.takeo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepo;

	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Admin ad=adminRepo.save(admin);
		
		if(ad != null)
			return ad;
		else
		return null;
	}

	@Override
	public Optional<Admin> getAdminById(long id) {
		// TODO Auto-generated method stub
		Optional<Admin> ad=adminRepo.findById(id);
		
		if(ad != null)
			return ad;
		else
		return null;
	}

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		List<Admin> ad=adminRepo.findAll();
		
		return ad;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Admin ad=adminRepo.save(admin);
		
		if(ad != null)
			return ad;
		else
		return null;
		
		
	}

	@Override
	public boolean deleteAdmin(long id) {
		
		
		Optional<Admin> admin= adminRepo.findById(id);
		Admin ad = admin.get();
		boolean flag=false;
		
		if(admin != null)
			adminRepo.deleteById(id);
		flag=true;
		
		
		return false;

	}
	
	
	@Override
	public List<Admin> getAdminByUsername(Admin admin) {
		// TODO Auto-generated method stub
		List<Admin> admin1 = adminRepo.getAdminByUsername(admin);
		
		if(admin != null)
			return admin1;
		else
		return null;
	}

/*	
	public boolean verifyUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		Admin admin2= adminRepo.verifyUsernameAndPassword(username, password);
		
		if(admin2 != null && admin2.getPassword().equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
*/
	

}
