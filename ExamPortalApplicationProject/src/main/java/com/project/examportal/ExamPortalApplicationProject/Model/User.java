package com.project.examportal.ExamPortalApplicationProject.Model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	private String username;
	private String password;
	private String mobno;
	@Id
	private String emailid;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String mobno, String emailid) {
		super();
		this.username = username;
		this.password = password;
		this.mobno = mobno;
		this.emailid = emailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mobno=" + mobno + ", emailid=" + emailid
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		User other = (User) obj;
		return  other.getPassword().equals(this.password);
		}
	
	
	

}
