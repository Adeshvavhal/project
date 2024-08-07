package com.Softgrid.BankApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Softgrid.BankApplication.Model.UserRegister;
import com.Softgrid.BankApplication.Service.UserRegisterService;

@RestController
@RequestMapping("/Bankk")
public class UserRegisterController {

	 @Autowired
	 private UserRegisterService urs;
	
	 @PostMapping("/register")
	 public UserRegister registerUser(@RequestBody UserRegister ur) { 
		return urs.registerUser(ur);
		 
	 }
}
