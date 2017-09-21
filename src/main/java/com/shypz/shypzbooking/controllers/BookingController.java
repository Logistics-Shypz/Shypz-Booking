package com.shypz.shypzbooking.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shypz.shypzbooking.UserService;
import com.shypz.shypzbooking.pojo.User;

@RestController
public class BookingController {
	
	
	public static final Logger log = LoggerFactory.getLogger(BookingController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/bookings/{userid}")
	public String getBooking(@PathVariable long userid){
		
		User u = userService.getUserWithId(userid);
		
		log.info(u.getUser_Email());;
		
		return "Booking microservice working fine";
	}

}
