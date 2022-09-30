package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethod;

public class SearchHotel extends ReusableMethod {

	public SearchHotel() {
		PageFactory.initElements(driver, this);	}

	@FindBy(id="location")
	private WebElement dbnlocation;

	@FindBy(id="hotels")
	private WebElement dbnhotels;

	@FindBy(id="room_type")
	private WebElement dbnroom_type;

	@FindBy(id="room_nos")
	private WebElement dbnroom_nos;

	@FindBy(id="datepick_in")
	private WebElement dbndatepick_in;

	@FindBy(id="datepick_out")
	private WebElement dbndatepick_out;

	@FindBy(id="adult_room")
	private WebElement dbnadult_room;

	@FindBy(id="child_room")
	private WebElement dbnchild_room;

	@FindBy(id="Submit")
	private WebElement dbnSubmit;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement txtselect;
	
	@FindBy(id="checkin_span")
	private WebElement dateCheckin;
	
	@FindBy(id="checkout_span")
	private WebElement dateCheckOut;
	
	@FindBy(id="location_span")
	private WebElement locationerror;
	
	public WebElement getTxtselect() {
		return txtselect;
	}

	public WebElement getDateCheckin() {
		return dateCheckin;
	}

	public WebElement getDateCheckOut() {
		return dateCheckOut;
	}

	public WebElement getLocationerror() {
		return locationerror;
	}

	public WebElement getDbnlocation() {
		return dbnlocation;
	}

	public WebElement getDbnhotels() {
		return dbnhotels;
	}

	public WebElement getDbnroom_type() {
		return dbnroom_type;
	}

	public WebElement getDbnroom_nos() {
		return dbnroom_nos;
	}

	public WebElement getDbndatepick_in() {
		return dbndatepick_in;
	}

	public WebElement getDbndatepick_out() {
		return dbndatepick_out;
	}

	public WebElement getDbnadult_room() {
		return dbnadult_room;
	}

	public WebElement getDbnchild_room() {
		return dbnchild_room;
	}

	public WebElement getDbnSubmit() {
		return dbnSubmit;
	}

	public void searchhotel(String location, String hotels, String roomType, String roomNos, String datePickIn, String datePickOut, String adultRoom,
			String childRoom) {

		selectVisible(dbnlocation, location);
		selectVisible(dbnhotels, hotels);
		selectVisible(dbnroom_type, roomType);
		selectVisible(dbnroom_nos, roomNos);
		clear(getDbndatepick_in());
		enterText(dbndatepick_in, datePickIn);
		clear(getDbndatepick_out());
		enterText(dbndatepick_out, datePickOut);
		selectVisible(dbnadult_room, adultRoom);
		selectVisible(dbnchild_room, childRoom);
		Click(dbnSubmit);
	}

	public void searchhotel(String location, String roomNos, String datePickIn, String datePickOut, String adultRoom) {
		selectVisible(dbnlocation, location);
		selectVisible(dbnroom_nos, roomNos);
		enterText(dbndatepick_in, datePickIn);
		enterText(dbndatepick_out, datePickOut);
		selectVisible(dbnadult_room, adultRoom);
		Click(dbnSubmit);
	}
	public void searchhotel() {
		Click(dbnSubmit);

	}
}