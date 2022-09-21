
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
	
	// changes done by engg-1
	

	// changes done by engg-2
	
	//changes done by engg-2 second time

	// changes done by engg-1 second time
	
	//changes done by engg-1 third time

	
	//changes done by engg-1 fourth time

	@Test
	public void test()
	{
		System.out.println("test executed");
	}
	// changes done in the HMS_01 branch engg-1
	@AfterMethod
	public void afterTest()
	{
		System.out.println("after method executed");
	}
}
