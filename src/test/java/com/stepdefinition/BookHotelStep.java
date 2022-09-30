package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.baseclass.ReusableMethod;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @Description perform Book a hotel in Adactin Hotel page
 * @author Hareesh K
 * @Date 08/07/2022
 */
public class BookHotelStep extends ReusableMethod {
	PageObjectManager pom = new PageObjectManager();
/**
 * @Description User should book a hotel
 * @param firstName
 * @param lastName
 * @param address
 * @param dataTable
 * @Date 08/07/2022
 */
	@When("User should book a hotel {string},{string} and {string}")
	public void userShouldBookAHotelAnd(String firstName, String lastName, String address,
			io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(2);
		String cardno = map.get("cardno");
		String cardType = map.get("cardType");
		String cardMonth = map.get("cardMonth");
		String cardyear = map.get("cardyear");
		String cardCvv = map.get("cardCvv");

		pom.getBookAHotel().BookPage(firstName, lastName, address, cardno, cardType, cardMonth, cardyear, cardCvv);
	}
/**
 * @Description User should verify after book now whether it is navigating to booking confirmation page
 * @param expectedBookingMessage
 * @Date 08/07/2022
 */
	@Then("User should verify after book now whether it is navigating to booking confirmation page {string}")
	public void userShouldVerifyAfterBookNowWhetherItIsNavigatingToBookingConfirmationPage(
			String expectedBookingMessage) {

		Assert.assertEquals("Verify booking message", expectedBookingMessage,
				getText(pom.getBookAHotel().getTxtconfirmation()));

	}
/**
 * @Description User should not enter any field in book a hotel page and click book now
 * @Date 08/07/2022
 * 
 */
	@When("User should not enter any field in book a hotel page and click book now")
	public void userShouldNotEnterAnyFieldInBookAHotelPageAndClickBookNow() {
		pom.getBookAHotel().BookClickpage();
	}

	/**
	 * @Description User should verify error mgs in Book a Hotel page after book noow
	 * @param expectedFirstNameErrorMessage
	 * @param expectedLastNameErrorMessage
	 * @param expectedAddressErrorMessage
	 * @param expectedCardNumberErrorMessage
	 * @param expectedCardTypeErrorMessage
	 * @param expectedExpiryMonthErrorMessage
	 * @param expectedCvvErrorMessage
	 * @Date 08/07/2022
	 */
	@Then("User should verify error mgs in Book a Hotel page after book noow {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyErrorMgsInBookAHotelPageAfterBookNoowAnd(String expectedFirstNameErrorMessage,
			String expectedLastNameErrorMessage, String expectedAddressErrorMessage,
			String expectedCardNumberErrorMessage, String expectedCardTypeErrorMessage,
			String expectedExpiryMonthErrorMessage, String expectedCvvErrorMessage) {

		Assert.assertEquals("verify", expectedFirstNameErrorMessage, getText(pom.getBookAHotel().getTxtfirstnamenew()));
		Assert.assertEquals("verify", expectedLastNameErrorMessage, getText(pom.getBookAHotel().getTxtlastnamenew()));
		Assert.assertEquals("verify", expectedAddressErrorMessage, getText(pom.getBookAHotel().getTxtaddressnew()));
		Assert.assertEquals("verify", expectedCardNumberErrorMessage, getText(pom.getBookAHotel().getTxtcardnonew()));
		Assert.assertEquals("verify", expectedCardTypeErrorMessage, getText(pom.getBookAHotel().getTxtcctypenew()));
		Assert.assertEquals("verify", expectedExpiryMonthErrorMessage, getText(pom.getBookAHotel().getTxtexpirynew()));
		Assert.assertEquals("verify", expectedCvvErrorMessage, getText(pom.getBookAHotel().getTxtcvvnew()));
	}

}
