package com.takeo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.entity.Admin;
import com.takeo.service.impl.AdminServiceImpl;

@RestController
@RequestMapping("/")
public class AdminController {
	
	@Autowired
	private AdminServiceImpl adminService;
	
	@PostMapping("/register")
	public ResponseEntity<Admin> register(@Valid  @RequestBody  Admin admin)
	{
		
		Admin msg=adminService.createAdmin(admin);
		
		return ResponseEntity.ok(HttpStatus.OK).ok(msg);
		
	}
	
	@GetMapping("/viewall")
	public List<Admin> getallAdmins()
	{
		List<Admin> getallAdmin=adminService.getAllAdmins();
		return getallAdmin;
		
	}
	/*
	@GetMapping("/viewadmin")
	public List<Admin> AdminNames(Admin admin)
	{
		List<Admin> viewAdminName= adminService.getAdminByUsername(admin);
		return viewAdminName;
	}
	*/
	
	@PutMapping("/update")
	public Admin updateAdmininfo(@RequestBody Admin admin)
	{
		Admin updateAdmin=adminService.updateAdmin(admin);
		return updateAdmin;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Admin> deleteAdmin(@PathVariable long id)
	{
		boolean deleteadmin=adminService.deleteAdmin(id);
		
		if(deleteadmin)
			return ResponseEntity.noContent().build();
		else
		return ResponseEntity.notFound().build();
	}

}
