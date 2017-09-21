package com.shypz.shypzbooking.pojo;

import java.util.List;

public class User {
	
	
	private long id;
	private String username;
	private String user_Email;
	private String user_Password;
	private String user_Mobile;
	private List<Address> address;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String username, String user_Email, String user_Password, String user_Mobile,
			List<Address> address) {
		super();
		this.id = id;
		this.username = username;
		this.user_Email = user_Email;
		this.user_Password = user_Password;
		this.user_Mobile = user_Mobile;
		this.address = address;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public String getUser_Password() {
		return user_Password;
	}
	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}
	public String getUser_Mobile() {
		return user_Mobile;
	}
	public void setUser_Mobile(String user_Mobile) {
		this.user_Mobile = user_Mobile;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	@Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", address='" + address.toString() + '\'' +
                '}';
    }
	
	

}
