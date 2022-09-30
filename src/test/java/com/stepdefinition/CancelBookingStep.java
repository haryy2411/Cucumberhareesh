package com.stepdefinition;

import org.junit.Assert;

import com.baseclass.ReusableMethod;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Hareesh K
 * @Description perform cancel booking in adactin hotel
 * @Date 08/07/2022
 *
 */
public class CancelBookingStep extends ReusableMethod {
	PageObjectManager pom = new PageObjectManager();
	/**
	 * @Description User should cancel booking
	 * @throws InterruptedException
	 * @Date 08/07/2022
	 */
	@When("User should cancel booking")
	public void userShouldCancelBooking() throws InterruptedException {
		String getorderid = pom.getBookingConfirmation().getorderid();
		pom.getCancelBooking().bookingcancel(getorderid);
	}
/**
 * @Description User should verify after cancel {string} message in booked itinerary page
 * @param expErrorMsg
 * @Date 08/07/2022
 */
	@Then("User should verify after cancel {string} message in booked itinerary page")
	public void userShouldVerifyAfterCancelMessageInBookedItineraryPage(String expErrorMsg) {
		
		Assert.assertEquals(expErrorMsg, getText(pom.getCancelBooking().getTxtcancelerror()));
	}
/**
 * @Description User should cancel the booked order id
 * @param orderId
 * @throws InterruptedException
 * @Date 08/07/2022
 */
	@When("User should cancel the booked order id {string}")
	public void userShouldCancelTheBookedOrderId(String orderId) throws InterruptedException {
		pom.getCancelBooking().bookingcancel(orderId);

	}
}
