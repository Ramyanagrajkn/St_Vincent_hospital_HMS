package org.sdet40.practice;

import org.HMS.GenericUtilities.WebDriverUtility;
import org.testng.annotations.Test;

public class mavenPractice {

	@Test
	
	public void practice1()
	{
		String browser=System.getProperty("b");
		String url=System.getProperty("u");
		
		System.out.println("Browser name is =======>>>>>  "+browser);
		System.out.println("URL is =======>>>>>>  "+url);
		
		WebDriverUtility wdu= new WebDriverUtility();
		wdu.commonOperation(browser, url, 10);
		
	}
}