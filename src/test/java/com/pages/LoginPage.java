package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethod;

public class LoginPage extends ReusableMethod {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtUsername;

	@FindBy(id="password")
	private WebElement txtpassword;

	@FindBy(id="login")
	private WebElement btnLogin;

	@FindBy(id="username_show")
	private WebElement txtsearch;
	
	@FindBy(xpath="//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]")
	private WebElement invalidtxt;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public WebElement getTxtsearch() {
		return txtsearch;
	}
	
	public WebElement getInvalidtxt() {
		return invalidtxt;
	}

	public void setInvalidtxt(WebElement invalidtxt) {
		this.invalidtxt = invalidtxt;
	}
	
	public void setTxtsearch(WebElement txtsearch) {
		this.txtsearch = txtsearch;
	}
	
	public void login(String userName, String password) {

		enterText(getTxtUsername(), userName);
		enterText(getTxtpassword(), password);
		Click(getBtnLogin());	}

	public void loginWithEnter(String userName, String password) throws AWTException {
		enterText(getTxtUsername(), userName);
		enterText(getTxtpassword(), password);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
