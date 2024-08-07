package com.Softgrid.BankApplication.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="My_userregister")
public class UserRegister {

	private int id;
	private String firstname;
	private String lastname;
	private String mobileno;
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "UserRegister [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", mobileno="
				+ mobileno + ", email=" + email + "]";
	}	
}
