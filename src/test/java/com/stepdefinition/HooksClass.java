package com.stepdefinition;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.baseclass.ReusableMethod;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * 
 * @author Hareesh K
 * @Description To initiate before and after method
 *
 */
public class HooksClass extends ReusableMethod{

	/**
	 * Description to launch browser for every scenario
	 * @throws IOException
	 * Date 08/07/2022
	 */
	@Before
	public void beforeclass() throws IOException {
		getdriver();
		String url = getpropertyfilevalue("url");
		url(url);
		implicitwait();
	}
	/**
	 * Description To take screenshot after every scenario
	 * @param sc
	 * Date 08/07/2022
	 */
	@After
	public void afterClass(Scenario sc) {
		TakesScreenshot screen = (TakesScreenshot) driver;
		byte[] screenshotAs = screen.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "scenerio");

		close();
	}

}
