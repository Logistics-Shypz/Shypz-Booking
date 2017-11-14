package com.shypz.shypzbooking.DAO;

import org.springframework.data.repository.CrudRepository;

import com.shypz.shypzbooking.pojo.Booking;

public interface BookingDAO extends CrudRepository<Booking,Long> {

}
