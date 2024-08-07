package com.Softgrid.BankApplication.Service;

import com.Softgrid.BankApplication.Model.UserModel;

public interface UserService {

	 UserModel findByUsername(String username);
}
