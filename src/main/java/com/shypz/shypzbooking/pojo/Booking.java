package com.shypz.shypzbooking.pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="User_Bookings",uniqueConstraints = {
		@UniqueConstraint(columnNames = "User_Booking_Id")})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Booking {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Booking_Id")
	private String userBookingQuoteId;
	@Column(name="User_Type",nullable=false)
	private String userType;
	@Column(name="User_Source_Location",nullable=false)
	private String userSourceLocation;
	@Column(name="User_Destination_Location",nullable=false)
	private String userDestinationLocation;
	@Column(name="User_Time_To_Shift",nullable=false)
	private String userTimeToShift;
	@Column(name="User_Source_Property_Type",nullable=false)
	private String userSourcePropertyType;
	@Column(name="User_Destination_Property_Type",nullable=false)
	private String userDestinationPropertyType;
	@Column(name="User_Source_Property_Floor_Num",nullable=false)
	private long userSourcePropertyFloorNum;
	@Column(name="User_Destination_Property_Floor_Num",nullable=false)
	private long userDestinationPropertyFloorNum;
	@Column(name="User_Property_Is_Packing_Required_Source",nullable=false)
	private String userPropertyIsPackingRequiredSource;
	@Column(name="User_Property_Is_Loading_Required_Source",nullable=false)
	private String userPropertyIsLoadingRequiredSource;
	@Column(name="User_Property_Is_Elevator_Available_Source",nullable=false)
	private String userPropertyIsElevatorAvailableSource;
	@Column(name="User_Property_Is_Unpacking_Required_Destination",nullable=false)
	private String userPropertyIsUnpackingRequiredDestination;
	@Column(name="User_Property_Is_Unloading_Required_Destination",nullable=false)
	private String userPropertyIsUnloadingRequiredDestination;
	@Column(name="User_Property_Is_Elevator_Required_Destination",nullable=false)
	private String userPropertyIsElevatorRequiredDestination;
	@Column(name="User_Id",nullable=false)
	private long userId;
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Booking(String userBookingQuoteId, String userType, String userSourceLocation, String userDestinationLocation,
			String userTimeToShift, String userSourcePropertyType, String userDestinationPropertyType,
			long userSourcePropertyFloorNum, long userDestinationPropertyFloorNum,
			String userPropertyIsPackingRequiredSource, String userPropertyIsLoadingRequiredSource,
			String userPropertyIsElevatorAvailableSource, String userPropertyIsUnpackingRequiredDestination,
			String userPropertyIsUnloadingRequiredDestination, String userPropertyIsElevatorRequiredDestination,
			long userId) {
		super();
		this.userBookingQuoteId = userBookingQuoteId;
		this.userType = userType;
		this.userSourceLocation = userSourceLocation;
		this.userDestinationLocation = userDestinationLocation;
		this.userTimeToShift = userTimeToShift;
		this.userSourcePropertyType = userSourcePropertyType;
		this.userDestinationPropertyType = userDestinationPropertyType;
		this.userSourcePropertyFloorNum = userSourcePropertyFloorNum;
		this.userDestinationPropertyFloorNum = userDestinationPropertyFloorNum;
		this.userPropertyIsPackingRequiredSource = userPropertyIsPackingRequiredSource;
		this.userPropertyIsLoadingRequiredSource = userPropertyIsLoadingRequiredSource;
		this.userPropertyIsElevatorAvailableSource = userPropertyIsElevatorAvailableSource;
		this.userPropertyIsUnpackingRequiredDestination = userPropertyIsUnpackingRequiredDestination;
		this.userPropertyIsUnloadingRequiredDestination = userPropertyIsUnloadingRequiredDestination;
		this.userPropertyIsElevatorRequiredDestination = userPropertyIsElevatorRequiredDestination;
		this.userId = userId;
	}


	public String getUserBookingQuoteId() {
		return userBookingQuoteId;
	}


	public void setUserBookingQuoteId(String userBookingQuoteId) {
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


	public String getUserSourcePropertyType() {
		return userSourcePropertyType;
	}


	public void setUserSourcePropertyType(String userSourcePropertyType) {
		this.userSourcePropertyType = userSourcePropertyType;
	}


	public String getUserDestinationPropertyType() {
		return userDestinationPropertyType;
	}


	public void setUserDestinationPropertyType(String userDestinationPropertyType) {
		this.userDestinationPropertyType = userDestinationPropertyType;
	}


	public long getUserSourcePropertyFloorNum() {
		return userSourcePropertyFloorNum;
	}


	public void setUserSourcePropertyFloorNum(long userSourcePropertyFloorNum) {
		this.userSourcePropertyFloorNum = userSourcePropertyFloorNum;
	}


	public long getUserDestinationPropertyFloorNum() {
		return userDestinationPropertyFloorNum;
	}


	public void setUserDestinationPropertyFloorNum(long userDestinationPropertyFloorNum) {
		this.userDestinationPropertyFloorNum = userDestinationPropertyFloorNum;
	}


	public String getUserPropertyIsPackingRequiredSource() {
		return userPropertyIsPackingRequiredSource;
	}


	public void setUserPropertyIsPackingRequiredSource(String userPropertyIsPackingRequiredSource) {
		this.userPropertyIsPackingRequiredSource = userPropertyIsPackingRequiredSource;
	}


	public String getUserPropertyIsLoadingRequiredSource() {
		return userPropertyIsLoadingRequiredSource;
	}


	public void setUserPropertyIsLoadingRequiredSource(String userPropertyIsLoadingRequiredSource) {
		this.userPropertyIsLoadingRequiredSource = userPropertyIsLoadingRequiredSource;
	}


	public String getUserPropertyIsElevatorAvailableSource() {
		return userPropertyIsElevatorAvailableSource;
	}


	public void setUserPropertyIsElevatorAvailableSource(String userPropertyIsElevatorAvailableSource) {
		this.userPropertyIsElevatorAvailableSource = userPropertyIsElevatorAvailableSource;
	}


	public String getUserPropertyIsUnpackingRequiredDestination() {
		return userPropertyIsUnpackingRequiredDestination;
	}


	public void setUserPropertyIsUnpackingRequiredDestination(String userPropertyIsUnpackingRequiredDestination) {
		this.userPropertyIsUnpackingRequiredDestination = userPropertyIsUnpackingRequiredDestination;
	}


	public String getUserPropertyIsUnloadingRequiredDestination() {
		return userPropertyIsUnloadingRequiredDestination;
	}


	public void setUserPropertyIsUnloadingRequiredDestination(String userPropertyIsUnloadingRequiredDestination) {
		this.userPropertyIsUnloadingRequiredDestination = userPropertyIsUnloadingRequiredDestination;
	}


	public String getUserPropertyIsElevatorRequiredDestination() {
		return userPropertyIsElevatorRequiredDestination;
	}


	public void setUserPropertyIsElevatorRequiredDestination(String userPropertyIsElevatorRequiredDestination) {
		this.userPropertyIsElevatorRequiredDestination = userPropertyIsElevatorRequiredDestination;
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}

	
	

}
