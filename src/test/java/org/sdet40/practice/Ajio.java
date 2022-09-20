package org.sdet40.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	static WebDriver driver=null;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com/?gclid=CjwKCAjwu5yYBhAjEiwAKXk_eOoQRpLMcTGRnCqtHTDl7wf28X7OC28-fDfJY3pMZ873P99db0961xoC3rIQAvD_BwE");
}
}
