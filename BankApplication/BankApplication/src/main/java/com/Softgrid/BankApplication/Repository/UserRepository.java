package com.Softgrid.BankApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Softgrid.BankApplication.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

//	UserModel findByUsername(String username);

}
