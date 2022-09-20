package org.HMS.GenericUtilities;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class consists of all Java reusable actions
 * @author PVN Creations
 *
 */

public class JavaUtility {

	JavascriptExecutor jse;
	/**
 * This method is used to generate the random number
 * @param limit
 * @return
 */
	public int getRandomNumber(int limit) {
		return new Random().nextInt(limit);
	}



}
