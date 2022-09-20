package org.sdet40.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarData {
	static WebDriver driver=null;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
	driver.findElement(By.id("datepicker")).click();
	driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	
}
}
