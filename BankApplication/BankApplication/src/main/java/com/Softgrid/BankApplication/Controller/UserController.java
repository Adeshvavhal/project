package com.Softgrid.BankApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Softgrid.BankApplication.Model.UserModel;
import com.Softgrid.BankApplication.Service.UserService;

@RestController
@RequestMapping("/Bank")
public class UserController {

	@Autowired
	 private UserService userservice;

	@RequestMapping("/Login")
	public UserModel Login(@RequestParam String username, @RequestParam String password ) {
		
		UserModel user = userservice.findByUsername(username);
		if(user != null && user.getPassword().equals(username)) {
		
		return user;
		}
	
		throw new RuntimeException(" Invalid username or password");
	}
}
