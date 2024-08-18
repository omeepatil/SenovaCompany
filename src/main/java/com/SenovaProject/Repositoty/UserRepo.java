package com.SenovaProject.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;


import com.SenovaProject.Model.UserAccountDetails;

public interface UserRepo extends JpaRepository<UserAccountDetails, Integer>{

	int countByUserName(String username);
	UserAccountDetails findByUserName(String username);
}
