package com.atmecs.handling_frames.tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.handling_frames.basetest.BaseTest;
import com.atmecs.handling_frames.pagehelper.HandlingFramesUsingJS;
import com.atmecs.handling_frames.utilities.ReadDataFromExcel;

public class HandlingFrames extends BaseTest
{
	@DataProvider
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData("Form_filling");
		
		return data;
	}
	
	public static Logger log = LogManager.getLogger(HandlingFrames.class);
	@Test(dataProvider = "readData")
	public void handlingFrames(String name, String number, String mail)
	{
		HandlingFramesUsingJS frames = new HandlingFramesUsingJS(driver);
				
		try
		{
			frames.handlingFrameAndClickChatIconTest(name, number, mail);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
