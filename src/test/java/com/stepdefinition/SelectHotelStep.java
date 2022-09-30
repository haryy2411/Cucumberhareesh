package com.stepdefinition;

import org.junit.Assert;

import com.baseclass.ReusableMethod;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @Description to perform Select Hotel in Adactin hotel page
 * @author Hareesh K
 * @Date 08/07/2022
 *
 *
 */
public class SelectHotelStep extends ReusableMethod {

	PageObjectManager pom = new PageObjectManager();
	/**
	 * @Description User should select the hotel and click continue
	 * @Date 08/07/2022
	 */
	@When("User should select the hotel and click continue")
	public void userShouldSelectTheHotelAndClickContinue() {
		pom.getSelectHotel().selecthotel();
	}
	/**
	 * @Description User should verify after continue whether it is navigating to book a hotel page
	 * @param expectedBookHotelMessage
	 */
	@Then("User should verify after continue whether it is navigating to book a hotel page {string}")
	public void userShouldVerifyAfterContinueWhetherItIsNavigatingToBookAHotelPage(String expectedBookHotelMessage) {


		Assert.assertEquals("verify BookHotel",expectedBookHotelMessage, getText(pom.getSelectHotel().getTxtBookA()));
	}
	/**
	 * @Description User should not select the hotel and click continue
	 * @Date 08/07/2022
	 * 
	 */

	@When("User should not select the hotel and click continue")
	public void userShouldNotSelectTheHotelAndClickContinue() {
		pom.getSelectHotel().clickcontinue();
	}
	/**
	 * @Description User should verify error message in select hotel after continue
	 * @param expectedSelecthotelErrorMessage
	 * @Date 08/07/2022
	 */
	@Then("User should verify error message in select hotel after continue {string}")
	public void userShouldVerifyErrorMessageInSelectHotelAfterContinue(String expectedSelecthotelErrorMessage) {			

		Assert.assertEquals("Verify error", expectedSelecthotelErrorMessage, getText(pom.getSelectHotel().getTxtcontinue()));
	}



}
