package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addPatient {
	static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.Properties");
		Properties property = new Properties();
		property.load(fis);
		String url = property.getProperty("url");
		String un = property.getProperty("username");
		String pass = property.getProperty("password");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//h3[text()='Patients']/following::a[@href='hms/user-login.php']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
		
		//driver.findElement(By.xpath("//i[@class='ti-angle-down']")).click();
		
		driver.findElement(By.xpath("//h2[text()='My Profile']/ancestor::div[@class='panel-body']/span/following::a[contains(.,'Update Profile')]")).click();
		
		driver.findElement(By.xpath("//label[contains(.,'User Name')]/following::input[@name='fname']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//label[contains(.,'User Name')]/following::input[@name='fname']")).sendKeys(Keys.DELETE);
		driver.findElement(By.xpath("//label[contains(.,'User Name')]/following::input[@name='fname']")).sendKeys("Ramya");
		
		driver.findElement(By.xpath("//label[contains(.,'Address')]/following::textarea[@name='address'] ")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//label[contains(.,'Address')]/following::textarea[@name='address'] ")).sendKeys(Keys.DELETE);
		driver.findElement(By.xpath("//label[contains(.,'Address')]/following::textarea[@name='address'] ")).sendKeys("Nelamangala");
		
		driver.findElement(By.xpath("//label[contains(.,'City')]/following::input[@name='city']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//label[contains(.,'City')]/following::input[@name='city']")).sendKeys(Keys.DELETE);
		driver.findElement(By.xpath("//label[contains(.,'City')]/following::input[@name='city']")).sendKeys("Bangalore");
		
		WebElement ele = driver.findElement(By.xpath("//label[contains(.,'Gender')]/following::select[@name='gender']"));
		ele.click();
		Select s = new Select(ele);
		s.selectByVisibleText("Female");
		
		driver.findElement(By.xpath("//label[contains(.,'User Email')]/following::input[@type='email']")).sendKeys("test@mail.com");
		driver.findElement(By.name("submit")).click();
	}
}