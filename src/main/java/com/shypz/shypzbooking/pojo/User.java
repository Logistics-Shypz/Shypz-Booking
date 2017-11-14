package com.shypz.shypzbooking.pojo;

import java.util.List;

import com.shypz.shypzbooking.pojo.Address;

public class User {
	
	
	private long id;
	private String username;
	private String userEmail;
	private String user_Password;
	private String user_Mobile;
	private List<Address> address;
	private String userotp;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(long id, String username, String userEmail, String user_Password, String user_Mobile,
			List<com.shypz.shypzbooking.pojo.Address> address, String userotp) {
		super();
		this.id = id;
		this.username = username;
		this.userEmail = userEmail;
		this.user_Password = user_Password;
		this.user_Mobile = user_Mobile;
		this.address = address;
		this.userotp = userotp;
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



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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



	public String getUserotp() {
		return userotp;
	}



	public void setUserotp(String userotp) {
		this.userotp = userotp;
	}



	@Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", address='" + address.toString() + '\'' +
                '}';
    }
	
	

}
