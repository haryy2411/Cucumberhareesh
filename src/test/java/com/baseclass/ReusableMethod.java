package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author Hareesh K
 * @Description predefined methods
 * @Date 07/07/2022
 *
 */
public class ReusableMethod {
	public static WebDriver driver;

	public WebElement findElementById(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;

	}
	public static void browserType(String browserType1) {
		switch (browserType1) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
	}
	public String getpropertyfilevalue(String key) throws IOException {
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
		Properties properities = new Properties();
		properities.load(stream);
		Object object = properities.get(key);
		String value =(String)object;
		return value;

	}

	public static void url(String url) {

		driver.get(url);

	}

	public void enterText(WebElement element, String value) {

		element.sendKeys(value);
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}


	public static void getdriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void Alert() {

		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public void AlertDismisss() {

		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public void Click(WebElement element) {
		element.click();

	}

	public void typeJsClick(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
	}

	public void JsScrolltoElement(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();",element );
	}

	public WebElement Linkedtext(String Value) {

		WebElement element = driver.findElement(By.linkText(Value));
		return element;

	}

	public WebElement partialLinkedtext(String Value) {
		WebElement element = driver.findElement(By.partialLinkText(Value));
		return element;

	}

	public WebElement Tagname(String Value) {
		WebElement element = driver.findElement(By.tagName(Value));
		return element;

	}
	public WebElement name(String Value) {
		WebElement element = driver.findElement(By.name(Value));
		return element;

	}

	public WebElement xpath(String Value) {
		WebElement element = driver.findElement(By.xpath(Value));
		return element;

	}

	public void Action(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(Element);

	}
	public void ActionRC(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.contextClick(Element);

	}
	public void ActionDC(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(Element);

	}
	public void ActionDC(WebElement Element ,WebElement value) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(Element, value);
	}

	public void navigateUrl(String url) {

		driver.navigate().to(url);

	}

	public void back() {

		driver.navigate().back();

	}

	public void forward() {

		driver.navigate().forward();

	}

	public void refresh() {

		driver.navigate().refresh();

	}

	public boolean enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;

	}
	public boolean Displayed(WebElement element) {
		boolean display = element.isDisplayed();
		return display;
	}

	public boolean selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	public void frames(int index) {
		driver.switchTo().frame(index);

	}

	public File screenshot() {
		TakesScreenshot  ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		return screenshotAs;

	}

	public Dimension Dimension(WebElement element) {
		Dimension size = element.getSize();
		return size;

	}

	public void windowHandling(String name) {

		driver.switchTo().window(name);

	}

	public void clear(WebElement Ele) {
		Ele.clear();

	}

	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	public void selectVisible(WebElement element, String Text) {

		Select sel = new Select(element);
		sel.selectByVisibleText(Text);
	}

	public void selectindex(WebElement element, int index) {

		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public List<WebElement> selectAll(WebElement element) {

		Select sel = new Select(element);
		List<WebElement> option = sel.getAllSelectedOptions();
		return option;
	}

	public String attributeValue(WebElement element, String value) {

		return element.getAttribute(value);
	}

	public void close() {
		driver.close();

	}
	public static void quit() {
		driver.quit();

	}

	public String Getsheet(String sheetName, int rowNo, int cellNo) throws IOException {

		String res = null;
		File file = new File("C:\\Users\\Scandy\\eclipse-workspace\\Framework\\Excel\\Test.xlsx");
		FileInputStream strean = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(strean);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		CellType type = cell.getCellType();

		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell))
			{
				Date dateCellValue = cell.getDateCellValue();	
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				res = simple.format(dateCellValue);
			}else {
				double cellvalue01 = cell.getNumericCellValue();
				long d=(long)cellvalue01;
				BigDecimal valueOf = BigDecimal.valueOf(d);
				res= valueOf.toString();

			}


			break;
		}
		workbook.close();
		return res;
	}
	public String UpdateCell(String sheetName, int rowNo, int cellNo,String olddata, String newdata) throws IOException {


		File file = new File("C:\\Users\\Scandy\\eclipse-workspace\\Framework\\Excel\\Test.xlsx");
		FileInputStream strean = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(strean);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = cell.getStringCellValue();
		if (value.equals(olddata)) {
			cell.setCellValue(newdata);

		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		workbook.close();
		return value;

	}

	public String insertdata(String sheetName, int rowNo, int cellNo,String data) throws IOException {
		File file = new File("C:\\Users\\Scandy\\eclipse-workspace\\Framework\\Excel\\Test.xlsx");
		FileInputStream strean = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(strean);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		workbook.close();
		return data;


	}


}
