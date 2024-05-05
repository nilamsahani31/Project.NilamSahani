package com.guru.Hotel.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.*;

@Entity
public class BookTable {
	
	private String name;
	
	@Id
	private String email;
	private String datetime;
	private String people;
	private String request;
	
	

	public BookTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public BookTable(String name, String email, String datetime, String people, String request) {
		super();
		this.name = name;
		this.email = email;
		this.datetime = datetime;
		this.people = people;
		this.request = request;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}



	@Override
	public String toString() {
		return "BookTable [name=" + name + ", email=" + email + ", datetime=" + datetime + ", people=" + people
				+ ", request=" + request + "]";
	}
	
}
