package com.atmecs.handling_frames.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name = "filling_details")
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData("Form_filling");
		
		return data;
	}
	
}
