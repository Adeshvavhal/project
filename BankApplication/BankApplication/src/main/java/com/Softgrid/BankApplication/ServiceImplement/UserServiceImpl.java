package com.Softgrid.BankApplication.ServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Softgrid.BankApplication.Model.User;
import com.Softgrid.BankApplication.Repository.UserRepository;
import com.Softgrid.BankApplication.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepo;
	
	
	@Override
	public User findByUsername(String username) {
		
		 return userrepo.findByUsername(username);
	}	
}
