package com.atmecs.handling_frames.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.atmecs.handling_frames.basetest.BaseTest;
import com.atmecs.handling_frames.pagehelper.HandlingFramesUsingJS;
import com.atmecs.handling_frames.utilities.ReadDataFromExcel;

public class HandlingFrames extends BaseTest
{

	@DataProvider
	public Object[][] readData(Method method)
	{
		ReadDataFromExcel.readExcelData(method.getName());
		
		return ReadDataFromExcel.readExcelData(method.getName());
	}
	
	@Test(dataProvider = "readData")
	public void Form_filling(String name, String number, String mail)
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
