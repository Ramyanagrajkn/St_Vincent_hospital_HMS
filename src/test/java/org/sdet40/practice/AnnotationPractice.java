
package org.sdet40.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationPractice {
	@BeforeMethod
	public void beforeTest()
	{
		System.out.println("before method executed");
	}
	
	@Test
	public void test()
	{
		System.out.println("test executed");
	}

	@AfterMethod
	public void afterTest()
	{
		System.out.println("after method executed");
	}
}
