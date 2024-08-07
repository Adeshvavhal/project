package com.Softgrid.BankApplication.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Softgrid.BankApplication.Model.UserModel;
import com.Softgrid.BankApplication.Repository.UserRepository;
import com.Softgrid.BankApplication.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepo;
	
	
	@Override
	public UserModel findByUsername(String username) {
		
		 return userrepo.findByUsername(username);
	}	
}
