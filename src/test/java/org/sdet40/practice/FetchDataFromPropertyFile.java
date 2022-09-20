package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataFromPropertyFile {
	static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.Properties");
		Properties property = new Properties();
		property.load(fis);
		String url = property.getProperty("url");
		String un = property.getProperty("username");
		String pass = property.getProperty("password");

		System.out.println(url);
		System.out.println(un);
		System.out.println(pass);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("(//a[.='Click Here'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
	}
}