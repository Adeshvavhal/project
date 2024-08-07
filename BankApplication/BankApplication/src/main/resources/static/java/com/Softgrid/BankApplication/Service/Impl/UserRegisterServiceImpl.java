package com.Softgrid.BankApplication.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Softgrid.BankApplication.Model.UserRegister;
import com.Softgrid.BankApplication.Repository.UserRegisterRepository;
import com.Softgrid.BankApplication.Service.UserRegisterService;

@Service 
public class UserRegisterServiceImpl implements UserRegisterService {

	@Autowired
    private UserRegisterRepository urr;
	
	
	@Override
	public UserRegister registerUser(UserRegister ur) {
		return urr.save(ur);
	}

	
}
