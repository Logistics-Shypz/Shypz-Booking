package com.shypz.shypzbooking.pojo;

import java.util.List;

public class UserJSONResponse {
	
	
	private long code;
	private User User;
	private String message;
	
	
	public UserJSONResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserJSONResponse(long code, User user, String message) {
		super();
		this.code = code;
		this.User = user;
		this.message = message;
	}


	public long getCode() {
		return code;
	}


	public void setCode(long code) {
		this.code = code;
	}


	public User getUser() {
		return User;
	}


	public void setUser(User user) {
		this.User = user;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
	
	
	
	

}
