package com.shypz.shypzbooking.pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="User_Bookings",uniqueConstraints = {
		@UniqueConstraint(columnNames = "User_Booking_Id")})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Booking_Id")
	private long userBookingQuoteId;
	@Column(name="User_Type",nullable=false)
	private String userType;
	@Column(name="User_Source_Location",nullable=false)
	private String userSourceLocation;
	@Column(name="User_Destination_Location",nullable=false)
	private String userDestinationLocation;
	@Column(name="User_Time_To_Shift",nullable=false)
	private String userTimeToShift;
	@Column(name="User_Property_Is_Apartment",nullable=false)
	private Boolean userPropertyIsApartment;
	@Column(name="User_Property_Is_Bunglow",nullable=false)
	private Boolean userPropertyIsBunglow;
	@Column(name="User_Property_Is_Packing_Required_Source",nullable=false)
	private Boolean userPropertyIsPackingRequiredSource;
	@Column(name="User_Property_Is_Loading_Required_Source",nullable=false)
	private Boolean userPropertyIsLoadingRequiredSource;
	@Column(name="User_Property_Is_Elevator_Available_Source",nullable=false)
	private Boolean userPropertyIsElevatorAvailableSource;
	@Column(name="User_Property_Is_Unpacking_Required_Destination",nullable=false)
	private Boolean userPropertyIsUnpackingRequiredDestination;
	@Column(name="User_Property_Is_Unloading_Required_Destination",nullable=false)
	private Boolean userPropertyIsUnloadingRequiredDestination;
	@Column(name="User_Property_Is_Elevator_Required_Destination",nullable=false)
	private Boolean userPropertyIsElevatorRequiredDestination;
	
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Booking(long userBookingQuoteId, String userType, String userSourceLocation, String userDestinationLocation,
			String userTimeToShift, Boolean userPropertyIsApartment, Boolean userPropertyIsBunglow,
			Boolean userPropertyIsPackingRequiredSource, Boolean userPropertyIsLoadingRequiredSource,
			Boolean userPropertyIsElevatorAvailableSource, Boolean userPropertyIsUnpackingRequiredDestination,
			Boolean userPropertyIsUnloadingRequiredDestination, Boolean userPropertyIsElevatorRequiredDestination) {
		super();
		this.userBookingQuoteId = userBookingQuoteId;
		this.userType = userType;
		this.userSourceLocation = userSourceLocation;
		this.userDestinationLocation = userDestinationLocation;
		this.userTimeToShift = userTimeToShift;
		this.userPropertyIsApartment = userPropertyIsApartment;
		this.userPropertyIsBunglow = userPropertyIsBunglow;
		this.userPropertyIsPackingRequiredSource = userPropertyIsPackingRequiredSource;
		this.userPropertyIsLoadingRequiredSource = userPropertyIsLoadingRequiredSource;
		this.userPropertyIsElevatorAvailableSource = userPropertyIsElevatorAvailableSource;
		this.userPropertyIsUnpackingRequiredDestination = userPropertyIsUnpackingRequiredDestination;
		this.userPropertyIsUnloadingRequiredDestination = userPropertyIsUnloadingRequiredDestination;
		this.userPropertyIsElevatorRequiredDestination = userPropertyIsElevatorRequiredDestination;
	}
	
	
	public long getUserBookingQuoteId() {
		return userBookingQuoteId;
	}
	public void setUserBookingQuoteId(long userBookingQuoteId) {
		this.userBookingQuoteId = userBookingQuoteId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserSourceLocation() {
		return userSourceLocation;
	}
	public void setUserSourceLocation(String userSourceLocation) {
		this.userSourceLocation = userSourceLocation;
	}
	public String getUserDestinationLocation() {
		return userDestinationLocation;
	}
	public void setUserDestinationLocation(String userDestinationLocation) {
		this.userDestinationLocation = userDestinationLocation;
	}
	public String getUserTimeToShift() {
		return userTimeToShift;
	}
	public void setUserTimeToShift(String userTimeToShift) {
		this.userTimeToShift = userTimeToShift;
	}
	public Boolean getUserPropertyIsApartment() {
		return userPropertyIsApartment;
	}
	public void setUserPropertyIsApartment(Boolean userPropertyIsApartment) {
		this.userPropertyIsApartment = userPropertyIsApartment;
	}
	public Boolean getUserPropertyIsBunglow() {
		return userPropertyIsBunglow;
	}
	public void setUserPropertyIsBunglow(Boolean userPropertyIsBunglow) {
		this.userPropertyIsBunglow = userPropertyIsBunglow;
	}
	public Boolean getUserPropertyIsPackingRequiredSource() {
		return userPropertyIsPackingRequiredSource;
	}
	public void setUserPropertyIsPackingRequiredSource(Boolean userPropertyIsPackingRequiredSource) {
		this.userPropertyIsPackingRequiredSource = userPropertyIsPackingRequiredSource;
	}
	public Boolean getUserPropertyIsLoadingRequiredSource() {
		return userPropertyIsLoadingRequiredSource;
	}
	public void setUserPropertyIsLoadingRequiredSource(Boolean userPropertyIsLoadingRequiredSource) {
		this.userPropertyIsLoadingRequiredSource = userPropertyIsLoadingRequiredSource;
	}
	public Boolean getUserPropertyIsElevatorAvailableSource() {
		return userPropertyIsElevatorAvailableSource;
	}
	public void setUserPropertyIsElevatorAvailableSource(Boolean userPropertyIsElevatorAvailableSource) {
		this.userPropertyIsElevatorAvailableSource = userPropertyIsElevatorAvailableSource;
	}
	public Boolean getUserPropertyIsUnpackingRequiredDestination() {
		return userPropertyIsUnpackingRequiredDestination;
	}
	public void setUserPropertyIsUnpackingRequiredDestination(Boolean userPropertyIsUnpackingRequiredDestination) {
		this.userPropertyIsUnpackingRequiredDestination = userPropertyIsUnpackingRequiredDestination;
	}
	public Boolean getUserPropertyIsUnloadingRequiredDestination() {
		return userPropertyIsUnloadingRequiredDestination;
	}
	public void setUserPropertyIsUnloadingRequiredDestination(Boolean userPropertyIsUnloadingRequiredDestination) {
		this.userPropertyIsUnloadingRequiredDestination = userPropertyIsUnloadingRequiredDestination;
	}
	public Boolean getUserPropertyIsElevatorRequiredDestination() {
		return userPropertyIsElevatorRequiredDestination;
	}
	public void setUserPropertyIsElevatorRequiredDestination(Boolean userPropertyIsElevatorRequiredDestination) {
		this.userPropertyIsElevatorRequiredDestination = userPropertyIsElevatorRequiredDestination;
	}
	
	
	
	
	
	
	
	
	
	

}
