package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethod;
/**
 * 
 * @author Hareesh K
 * @Description To perform Booking Confirmation in Adactin hotel page
 * @Date 08/07/2022
 *
 */
public class BookingConfirmation extends ReusableMethod {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);	}
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement txtconirmation;
	
	@FindBy(id="order_no")
	private WebElement txtorderid;
	


	public WebElement getTxtconirmation() {
		return txtconirmation;
	}

	public WebElement getTxtorderid() {
		return txtorderid;
	}

	/**
	 * 
	 * @return
	 */
	public String getorderid() {
		String order = attributeValue(getTxtorderid(), "value");
		System.out.println(order);
		return order;
	}
}
