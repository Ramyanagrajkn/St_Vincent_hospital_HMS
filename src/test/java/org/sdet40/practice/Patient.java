package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Patient {
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
		
		//Dashboard
		driver.findElement(By.xpath("//span[contains(.,' Dashboard ')]")).click();
		//appointment history
		driver.findElement(By.xpath("(//a[@href='appointment-history.php'])[2]")).click();
		//driver.switchTo().alert().accept();
		//logout
		//driver.findElement(By.xpath("//span[@class='username']/ancestor::a[@class='dropdown-toggle']/following::a[@href='logout.php']")).click();
//		driver.findElement(By.xpath("\"//span[@class='username']")).click();
//		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		 WebElement element = driver.findElement(By.xpath("//a[contains(.,'Log Out')]"));
//		jse.executeScript("arguments[0].scrollIntoView()",element);
		driver.findElement(By.xpath("//i[@class='ti-angle-down']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Log Out')]")).click();
		// login to docto
//		driver.findElement(By.name("username")).click();
//		driver.findElement(By.xpath("//h2[text()='My Appointments']/following::a[@href='appointment-history.php']")).click();
	}
}