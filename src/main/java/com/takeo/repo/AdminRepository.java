package com.takeo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.takeo.entity.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, Long> {
	

	List<Admin> getAdminByUsername(Admin admin);

	//public Admin verifyUsernameAndPassword(String username, String password);
	

}
