package com.SenovaProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SenovaProject.Model.ApiResponse;
import com.SenovaProject.Model.LoginReturn;
import com.SenovaProject.Model.UserAccountDetails;
import com.SenovaProject.Repositoty.UserRepo;

@RestController
@CrossOrigin

public class LoginController {

	@Autowired
	UserRepo userRepo;
	
	@RequestMapping("getName{id}")
	public String[] getName(@PathVariable int id) {
		UserAccountDetails user= userRepo.findById(id).get();
		String[] sa=new String[1];
		sa[0]=user.getName();
		return sa;
	}

	@RequestMapping("log")
	public LoginReturn login(@RequestBody String[] sa) {

		if (sa == null)
			return new LoginReturn(-1, -1, "Currepted Data");

		String username = sa[0];

		if (username == null || username.length() < 1)
			return new LoginReturn(-1, -1, "Enter UserName");

		String password = sa[1];
		if (password == null || password.length() < 1)
			return new LoginReturn(-1, -1, "Enter Password");

		int count = userRepo.countByUserName(username);

		if (count == 0)
			return new LoginReturn(-1, -1, "Wrong UserName");

		if (count > 1)
			return new LoginReturn(-1, -1, "User Already Present");

		UserAccountDetails user = userRepo.findByUserName(username);

		if (user.getPassword().equals(password)) {
			return new LoginReturn(user.getId(), user.getAccountType(), null);
		} else
			return new LoginReturn(-1, -1, "Wrong Password");
	}
	
	@PostMapping("register")
    public ApiResponse registerUser(@RequestBody UserAccountDetails user) {
        int isUser = userRepo.countByUserName(user.getUserName());
        if (isUser >= 1) {
            return new ApiResponse(0, "Username already exists");
        } else {
            userRepo.save(user);
            return new ApiResponse(1, "User registered successfully");
        }
    }
}
