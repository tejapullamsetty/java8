package com.javaeight.example.optional;

import java.util.Optional;

public class User {

	private String name;
	private String userName;
	private int id;
	

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<String> getUserName() {
		return Optional.ofNullable(userName);
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(String name, String userName, int id) {
		super();
		this.name = name;
		this.userName = userName;
		this.id = id;
	}

}
