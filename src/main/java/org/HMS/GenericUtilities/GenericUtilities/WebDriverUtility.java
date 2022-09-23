package org.HMS.GenericUtilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
/**
 * This class is used for all webdriver actions
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {

	Select s;
	WebDriver driver;
	JavascriptExecutor jse;
	/**
	 * This method is used for launching the browser
	 * @param browser
	 * @return
	 */
	public WebDriver launchbrowser(String browser) {
		
		switch(browser) {
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

		case "IE":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;	
		}
		return driver;
	}
	/**
	 * This method is used to maximize the browser
	 * @param driver 
	 */
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to wait application till page loads
	 * @param driver
	 * @param timeseconds
	 */
	public void waitImplicityseconds(WebDriver driver, long timeseconds) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeseconds));
	}
	/**
	 * This method is used to launch the browser
	 * @param driver
	 * @param url
	 */
	public void navigationToApplication(WebDriver driver, String url1)
	{
		driver.get(url1);
	}
	/**
	 * This method is used to close the browser
	 * @param driver
	 */
	public void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}

	/**
	 * This method is used to perform common actions for all the scripts
	 * @param browser
	 * @param url
	 * @param timeseconds
	 * @return
	 */
	public WebDriver commonOperation(String browser, String url,long timeseconds)
	{
		WebDriver driver = launchbrowser(browser);
		maximizeBrowser(driver);
		waitImplicityseconds(driver, timeseconds);
		navigationToApplication(driver, url);
		return driver;
	}
	/**
	 * This method is used to perform mouse hover action
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element)
	{
		new Actions(driver).moveToElement(element).perform();
	}
	/**
	 * This method is used to perform double click action
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element)
	{
		new Actions(driver).doubleClick(element).perform();
	}
	/**
	 * This is used to switch the control from one window to another window 
	 * @param driver
	 * @param element
	 */
	public void switchToNewWindow(WebDriver driver, String element)
	{
		driver.switchTo().window(element);
	}
	/**
	 * This method is to initialize the dropdown
	 * @param ele
	 */
	public void initializeDropdown(WebElement ele)
	{
		s=new Select(ele);	
	}
	/**
	 * This method is used to select the dropdown from visible text
	 * @param visibleText
	 */

	public void selectByVisibleTextFromDropdown(String visibleText)
	{
		s.selectByVisibleText(visibleText);
	}
	/**
	 * This is used to initialize the JSE
	 * @param driver
	 */
	public void initializeJSE(WebDriver driver)
	{
		jse=(JavascriptExecutor)driver;
	}
	/**
	 * This method is used to scroll the element by using JSE
	 * @param element
	 */
	public void scrollByUsingJse(WebElement element)
	{
		jse.executeScript("arguments[0].scrollIntoView()",element);
	}
	/**
	 * This method is used to scroll the element
	 * @param element
	 */
	public void scroll(WebElement element)
	{
		jse.executeScript("window.scrollBy(0,500)");
	}
	
	public void waittilElementisVisisble(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}

