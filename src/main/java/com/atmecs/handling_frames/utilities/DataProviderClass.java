package com.atmecs.handling_frames.utilities;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name = "filling_details")
	public Object[][] readData(Method method)
	{
		Object[][] data = ReadDataFromExcel.readExcelData(method.getName());
		
		return data;
	}
	
}
