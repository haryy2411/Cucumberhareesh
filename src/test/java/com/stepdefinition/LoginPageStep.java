package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.ReusableMethod;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Hareesh K
 * @Description Creating methods to perform loginpage
 * @Date 08/07/2022
 *
 */
public class LoginPageStep extends ReusableMethod{

	PageObjectManager pom = new PageObjectManager();
	
	@Given("User is on Adactin Hotel login page")
	public void userIsOnAdactinHotelLoginPage() {
		
	}
/**
 * @Description User should enter and click Login
 * @param userName
 * @param password
 * @throws IOException
 * @Date 08/07/2022
 */
	@When("User should enter {string} , {string} and click login")
	public void userShouldEnterAndClickLogin(String userName, String password) throws IOException {
		
		pom.getLoginPage().login(getpropertyfilevalue("userName"),getpropertyfilevalue("password"));
		
	//	pom.getLoginPage().login(userName,password);
		
	}
	
	/**
	 * @Description User Should Enter And Press Enter
	 * @param userName
	 * @param password
	 * @throws AWTException
	 * @throws IOException
	 * @Date 08/07/2022
	 */

	@When("User should enter {string} , {string} and press enter")
	public void userShouldEnterAndPressEnter(String userName, String password) throws AWTException, IOException {
		pom.getLoginPage().loginWithEnter(getpropertyfilevalue("userName"),getpropertyfilevalue("password"));
	}
/**
 * @description User should verify after login contains 
 * @param expectedErrorMessage
 * @Date 08/07/2022
 */
	@Then("User should verify after login contains {string}")
	public void userShouldVerifyAfterLoginContains(String expectedErrorMessage) {
		WebElement invalidtxt = pom.getLoginPage().getInvalidtxt();
		
		Assert.assertTrue(invalidtxt.getText().contains(expectedErrorMessage));
			
	}

}
