package com.example.beautybunch.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads")
public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long User_id;
	
	private String User_Name;
	private String Email;
	private long Password;
	public long getUser_id() {
		return User_id;
	}
	public void setUser_id(long user_id) {
		User_id = user_id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPassword() {
		return Password;
	}
	public void setPassword(long password) {
		Password = password;
	}
	public Lead(long user_id, String user_Name, String email, long password) {
		super();
		User_id = user_id;
		User_Name = user_Name;
		Email = email;
		Password = password;
	}
	public Lead() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Lead [User_id=" + User_id + ", User_Name=" + User_Name + ", Email=" + Email + ", Password=" + Password
				+ "]";
	}
	
	
}
