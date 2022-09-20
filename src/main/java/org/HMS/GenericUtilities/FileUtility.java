package org.HMS.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this class consists of reusable method to handle property file
 * 
 */
public class FileUtility {
	/**
	 * this method is used to fetch the data from property file
	 * 
	 * @param propertyfilePath
	 * @param key
	 * @return
	 * @throws IOException 
	 */
	public String getKeyValueFromPropertyFile(String key) throws IOException {

		FileInputStream fis = new FileInputStream(IConstantPath.PROPERTY_FILE_PATH);
		Properties properties = new Properties();
		properties.load(fis);
		String value = properties.getProperty(key).trim();
		return value;
	}
	
	public void initializePropertyFile(String PROPERTY_FILE_PATH) throws IOException
	{
		FileInputStream fis = new FileInputStream(PROPERTY_FILE_PATH);
		Properties properties = new Properties();
		properties.load(fis);
	}
}