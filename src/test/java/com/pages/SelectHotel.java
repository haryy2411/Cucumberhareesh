package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethod;

public class SelectHotel extends ReusableMethod {
	public SelectHotel() {
		PageFactory.initElements(driver, this);	}

	@FindBy(id="radiobutton_0")
	private WebElement btnSelect;

	@FindBy(id="continue")
	private WebElement btnContinue;

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtBookA;

	@FindBy(id="radiobutton_span")
	private WebElement txtcontinue;
	
	public WebElement getTxtBookA() {
		return txtBookA;
	}
	public WebElement getTxtcontinue() {
		return txtcontinue;
	}
	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void selecthotel() {
		Click(getBtnSelect());
		Click(getBtnContinue());

	}

	public void clickcontinue() {
		Click(getBtnContinue());

	}

}