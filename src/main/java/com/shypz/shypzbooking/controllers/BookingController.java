package com.shypz.shypzbooking.controllers;

import org.hibernate.id.UUIDGenerator;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shypz.shypzbooking.UserService;
import com.shypz.shypzbooking.pojo.Booking;
import com.shypz.shypzbooking.pojo.User;
import com.shypz.shypzbooking.services.BookingService;

@CrossOrigin(origins="*")
@RestController
public class BookingController {
	
	
	public static final Logger log = LoggerFactory.getLogger(BookingController.class);
	
	@Autowired
	UserService userService;
	
	@Autowired
	private BookingService bookingService;
	
	@RequestMapping("/bookings/{userid}")
	public String getBooking(@PathVariable long userid){
		
		User u = userService.getUserWithId(userid);
		
		log.info(u.getUserEmail());
		
		return "Booking microservice working fine";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/bookings")
	public ResponseEntity<JSONObject> createBooking(@RequestBody Booking booking){
		
		JSONObject booking_obj = new JSONObject();
		
		long current_mills = System.currentTimeMillis();
		String quote_id = "SH" + current_mills;
		booking.setUserBookingQuoteId(quote_id);
		Booking b = bookingService.addBookings(booking);
		
		if(b != null){
			
			
			booking_obj.put("success_code", 1);
			booking_obj.put("message", "booking Added Successfully");
			booking_obj.put("booking_quote_id", b.getUserBookingQuoteId());
			return new ResponseEntity<JSONObject>(booking_obj,HttpStatus.OK);
		}else{
			booking_obj.put("success_code", 0);
			booking_obj.put("message", "Unable to add booking successfully");
			return new ResponseEntity<JSONObject>(booking_obj,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
		
		
	}

}
