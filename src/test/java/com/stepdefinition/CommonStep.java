package com.stepdefinition;

import org.junit.Assert;
import com.baseclass.ReusableMethod;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
/**
 * @Description performing commonStep
 * @author Hareesh k
 * @Date 08/07/2022
 *
 */
public class CommonStep extends ReusableMethod {
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should verify after login {string}")
	public void userShouldVerifyAfterLogin(String excpectedLoginMessage) {
		
		Assert.assertEquals("verifyMessage", excpectedLoginMessage, attributeValue(pom.getLoginPage().getTxtsearch(), "value"));
		}
	
	
}
