package com.shypz.shypzbooking.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.shypz.shypzbooking.DAO.BookingDAO;
import com.shypz.shypzbooking.pojo.Booking;


@Service
public class BookingService {
	
	public static final Logger log = LoggerFactory.getLogger(BookingService.class);
	
	@Autowired
	private BookingDAO bookingdao;
	
	private JdbcTemplate jdbctemplate;

	public Booking addBookings(Booking booking) {
		// TODO Auto-generated method stub
		/*if(booking == null){
			return false;
		}
		else{
			*/
			booking = bookingdao.save(booking);
			log.info("Booking persisted in database");
			return booking;
			//return true;
		//}
	}
	
	

}
