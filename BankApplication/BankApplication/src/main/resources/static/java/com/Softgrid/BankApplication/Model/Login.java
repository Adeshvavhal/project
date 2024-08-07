package com.Softgrid.BankApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "My_Login")
public class Login {

	private String Username;
	private String Password;
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		return "Login [Username=" + Username + ", Password=" + Password + "]";
	}
	
}
