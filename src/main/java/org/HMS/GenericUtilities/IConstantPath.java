package org.HMS.GenericUtilities;

/**
 * This interface consists all the external file paths
 * @author PVN Creations
 *
 */

public interface IConstantPath {

	String PROJECT_PATH=System.getProperty("user.dir");
	String EXCEL_PATH=PROJECT_PATH+"/src/test/resources/TestData.xlsx";
	String PROPERTY_FILE_PATH=PROJECT_PATH+"/src/test/resources/commonData.Properties";
}