package com.atmecs.handling_frames.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.atmecs.handling_frames.basetest.BaseTest;
import com.atmecs.handling_frames.pagehelper.HandlingFramesUsingJS;
import com.atmecs.handling_frames.utilities.DataProviderClass;

public class HandlingFrames extends BaseTest
{

	@Test(dataProvider = "filling_details", dataProviderClass= DataProviderClass.class)
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
