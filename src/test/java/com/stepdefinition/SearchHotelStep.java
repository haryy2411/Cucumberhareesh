package com.stepdefinition;

import org.junit.Assert;

import com.baseclass.ReusableMethod;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * 
 * @author Hareesh K
 * @Description to perform search hotel in Adactin Hotel page
 * @Date 08/07/2022
 *
 */

public class SearchHotelStep extends ReusableMethod{
	PageObjectManager pom = new PageObjectManager();
	/**
	 * 
	 * @description User should enter all fields in search
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param roomNos
	 * @param datePickIn
	 * @param datePickOut
	 * @param adultRoom
	 * @param childRoom
	 * @Date 08/07/2022
	 */
	@When("User should enter all fields in search hotel {string},{string},{string},{string},{string},{string},{string},{string} and click search")
	public void userShouldEnterAllFieldsInSearchHotelAndClickSearch(String location, String hotels, String roomType, String roomNos, String datePickIn, String datePickOut, String adultRoom, String childRoom)
	{
		pom.getSearchHotel().searchhotel(location, hotels, roomType, roomNos, datePickIn, datePickOut, adultRoom, childRoom);
	}
	/**
	 * @Description User should verify after search whether it is navigating to select hotel page 
	 * @param expectedSelectHotelMessage
	 * @Date 08/07/2022
	 */
	@Then("User should verify after search whether it is navigating to select hotel page {string}")
	public void userShouldVerifyAfterSearchWhetherItIsNavigatingToSelectHotelPage(String expectedSelectHotelMessage) {

		Assert.assertEquals(expectedSelectHotelMessage, getText(pom.getSearchHotel().getTxtselect()));
	}

	/**
	 * @Description User should enter mandatory fields in search hotel
	 * @param location
	 * @param roomNos
	 * @param datePickIn
	 * @param datePickOut
	 * @param adultRoom
	 * @Date 08/07/2022
	 */

	@When("User should enter mandatory fields in search hotel {string},{string},{string},{string},{string} and click search")
	public void userShouldEnterMandatoryFieldsInSearchHotelAndClickSearch(String location, String roomNos, String datePickIn, String datePickOut, String adultRoom) {
		pom.getSearchHotel().searchhotel(location, roomNos, datePickIn, datePickOut, adultRoom);
	}

	/**
	 * @Description User should verify after search, date error message
	 * @param expectedDateInErrorMessage
	 * @param expectedDateOutErrorMessage
	 * @Date 08/07/2022
	 */
	@Then("User should verify after search, date error message {string},{string}")
	public void userShouldVerifyAfterSearchDateErrorMessage(String expectedDateInErrorMessage, String expectedDateOutErrorMessage) {


		Assert.assertEquals(expectedDateInErrorMessage, getText(pom.getSearchHotel().getDateCheckin()));
		Assert.assertEquals(expectedDateOutErrorMessage, getText(pom.getSearchHotel().getDateCheckOut()));

	}

	/**
	 * @Description User should not enter any field in search hotel page and click search
	 * @Date 08/07/2022
	 */
	@When("User should not enter any field in search hotel page and click search")
	public void userShouldNotEnterAnyFieldInSearchHotelPageAndClickSearch() {
		pom.getSearchHotel().searchhotel();
	}

	/**
	 * @Description User should verify error message after search in search hotel
	 * @param expectedSearchHotelErrorMessage
	 */
	@Then("User should verify error message after search in search hotel{string}")
	public void userShouldVerifyErrorMessageAfterSearchInSearchHotel(String expectedSearchHotelErrorMessage) {

		Assert.assertEquals(expectedSearchHotelErrorMessage, getText(pom.getSearchHotel().getLocationerror()));
	}

}
