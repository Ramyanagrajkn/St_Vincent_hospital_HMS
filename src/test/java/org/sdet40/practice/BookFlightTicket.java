package org.sdet40.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookFlightTicket {
static WebDriver driver= null;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Mumbai");
    driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("New Delhi");
    driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
    driver.findElement(By.name("//a[text()='Search']")).click();
  }
}