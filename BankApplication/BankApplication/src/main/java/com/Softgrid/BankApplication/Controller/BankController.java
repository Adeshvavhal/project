package com.Softgrid.BankApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Softgrid.BankApplication.Model.User;
import com.Softgrid.BankApplication.Service.UserService;

@RestController
@RequestMapping("/Bank")
public class BankController {

	@Autowired
	 private UserService userservice;

	
	public User Login(@RequestParam String username, @RequestParam String password ) {
		
		
		
		return null;
		
	}
	
	
}
