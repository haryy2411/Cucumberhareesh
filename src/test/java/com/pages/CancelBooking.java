package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethod;

public class CancelBooking extends ReusableMethod {
	public CancelBooking() {
		PageFactory.initElements(driver, this);	
		}

	@FindBy(id="order_id_text")
	private WebElement txtboxcancel;

	@FindBy(id="search_hotel_id")
	private WebElement gosearch;

	@FindBy(id="check_all")
	private WebElement Checkall;

	@FindBy(xpath="//input[contains(@name,'btn_id_')]")
	private WebElement cancel;

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedIternary;
	
	@FindBy(id="search_result_error")
	private WebElement txtcancelerror;
	
	public WebElement getTxtcancelerror() {
		return txtcancelerror;
	}

	public WebElement getTxtboxcancel() {
		return txtboxcancel;
	}

	public WebElement getGosearch() {
		return gosearch;
	}

	public WebElement getCheckall() {
		return Checkall;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getBookedIternary() {
		return bookedIternary;
	}

	public void bookingcancel(String orderId) throws InterruptedException {
		Click(getBookedIternary());
		enterText(getTxtboxcancel(), orderId);
		Click(getGosearch());
		Click(getCheckall());
		Click(getCancel());
		Alert();
	}


}
