package org.sdet40.practice;

import java.io.IOException;

import org.HMS.GenericUtilities.FileUtility;
import org.HMS.GenericUtilities.IConstantPath;
import org.HMS.GenericUtilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookAppointment 
		{
		public static void main(String[] args) throws IOException 
		{
		WebDriverUtility wb = new WebDriverUtility();
		FileUtility fileutil= new FileUtility();
		//ExcelUtility excel = new ExcelUtility();
		
		String browser = fileutil.getKeyValueFromPropertyFile("browser");
		String url = fileutil.getKeyValueFromPropertyFile("url");
		WebDriver driver = wb.commonOperation(browser, url, 10);
		driver.findElement(By.xpath("(//a[.='Click Here'])[1]")).click();
		String username = fileutil.getKeyValueFromPropertyFile("username");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		String password = fileutil.getKeyValueFromPropertyFile("password");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.xpath("//a[@href='book-appointment.php']")).click();
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='Doctorspecialization']"));
		ele1.click();
		Select s = new Select(ele1);
		s.selectByVisibleText("Dermatologist");
		
		WebElement ele2 = driver.findElement(By.id("doctor"));
		
		ele2.click();
		Select s1 = new Select(ele2);
		s1.selectByVisibleText("Bhavani");
		
		WebElement ele3 = driver.findElement(By.xpath("//label[contains(.,'Date')]/following::input[@class='form-control datepicker']"));
		ele3.click();
		driver.findElement(By.xpath("//td[.='15']")).click();
		
		driver.findElement(By.id("timepicker1")).click();
		driver.findElement(By.xpath("//input[@id='timepicker1']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@id='timepicker1']")).sendKeys(Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='timepicker1']")).sendKeys("9:00 AM");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//span[contains(.,' Dashboard ')]")).click();
		driver.findElement(By.xpath("(//a[@href='appointment-history.php'])[2]")).click();
	  }
	}