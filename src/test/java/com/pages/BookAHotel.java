package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethod;

/**
 * 
 * @author Hareesh K
 * @Description Creating methods
 * @Date 
 *
 */
public class BookAHotel extends ReusableMethod{

	public BookAHotel() {
		PageFactory.initElements(driver, this);	}

	@FindBy(id="first_name")
	private WebElement txtFirstname;

	@FindBy(id="last_name")
	private WebElement txtLastname;

	@FindBy(id="address")
	private WebElement txtaddress;

	@FindBy(id="cc_num")
	private WebElement txtCardno;

	@FindBy(id="cc_type")
	private WebElement txtCardType;

	@FindBy(id="cc_exp_month")
	private WebElement txtCardmonth;

	@FindBy(id="cc_exp_year")
	private WebElement txtCardyear;

	@FindBy(id="cc_cvv")
	private WebElement txtCardCVV;

	@FindBy(id="book_now")
	private WebElement btnBook;
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement txtconfirmation;
	
	@FindBy(id="first_name_span")
	private WebElement txtfirstnamenew;
	
	@FindBy(id="last_name_span")
	private WebElement txtlastnamenew;
	
	@FindBy(id="address_span")
	private WebElement txtaddressnew;
	
	@FindBy(id="cc_num_span")
	private WebElement txtcardnonew;
	
	@FindBy(id="cc_type_span")
	private WebElement txtcctypenew;
	
	@FindBy(id="cc_expiry_span")
	private WebElement txtexpirynew;

	@FindBy(id="cc_cvv_span")
	private WebElement txtcvvnew;
	
	public WebElement getTxtcvvnew() {
		return txtcvvnew;
	}

	public WebElement getTxtconfirmation() {
		return txtconfirmation;
	}

	public WebElement getTxtfirstnamenew() {
		return txtfirstnamenew;
	}

	public WebElement getTxtlastnamenew() {
		return txtlastnamenew;
	}

	public WebElement getTxtaddressnew() {
		return txtaddressnew;
	}

	public WebElement getTxtcardnonew() {
		return txtcardnonew;
	}

	public WebElement getTxtcctypenew() {
		return txtcctypenew;
	}

	public WebElement getTxtexpirynew() {
		return txtexpirynew;
	}

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtCardno() {
		return txtCardno;
	}

	public WebElement getTxtCardType() {
		return txtCardType;
	}

	public WebElement getTxtCardmonth() {
		return txtCardmonth;
	}

	public WebElement getTxtCardyear() {
		return txtCardyear;
	}

	public WebElement getTxtCardCVV() {
		return txtCardCVV;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
/**
 * @Date 08/07/2022
 * @Description to pass test data
 * @param firstName
 * @param lastName
 * @param address
 * @param cardno
 * @param cardType
 * @param cardMonth
 * @param cardyear
 * @param cardCvv
 * 
 */
	public void BookPage(String firstName,String lastName,String address,String cardno,
			String cardType,String cardMonth,String cardyear,String cardCvv) {

		enterText(getTxtFirstname(), firstName);
		enterText(getTxtLastname(), lastName);
		enterText(getTxtaddress(), address);
		enterText(getTxtCardno(), cardno);
		selectVisible(getTxtCardType(), cardType);
		selectVisible(getTxtCardmonth(), cardMonth);
		selectVisible(getTxtCardyear(), cardyear);
		enterText(getTxtCardCVV(), cardCvv);
		Click(getBtnBook());
		implicitwait();

	}
	/**
	 * @Description To perform click in book hotel
	 * @Date 08/07/2022
	 */
	public void BookClickpage() {

		Click(getBtnBook());
	}
}
