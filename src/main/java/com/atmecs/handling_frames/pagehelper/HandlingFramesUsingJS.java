// Handling frames using javascript

package com.atmecs.handling_frames.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.handling_frames.constants.Constants;
import com.atmecs.handling_frames.helpers.HelperClass;
import com.atmecs.handling_frames.utilities.PropertyReader;

public class HandlingFramesUsingJS 
{
	public WebDriver driver;

	HelperClass helpers;

	Properties locatorsFile;
	
	Properties datas;
	
	public HandlingFramesUsingJS(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void handlingFrameAndClickChatIconTest(String name, String number, String mail) throws InterruptedException, IOException
	{
		helpers = new HelperClass(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		datas = PropertyReader.readProperties(Constants.DATAS);
		
		helpers.switchToFrame(locatorsFile.getProperty("frame"));
		
		helpers.jsMethods(locatorsFile.getProperty("chaticon"));
		
		driver.findElement(By.xpath(locatorsFile.getProperty("username"))).sendKeys(name);

		driver.findElement(By.xpath(locatorsFile.getProperty("mob"))).sendKeys(number);

		driver.findElement(By.xpath(locatorsFile.getProperty("usermail"))).sendKeys(mail);
		
		helpers.clickOperation(locatorsFile.getProperty("checkbox"));

		helpers.selectValueFromDropDown(locatorsFile.getProperty("client"), "index1_1");

		helpers.clickOperation(locatorsFile.getProperty("button"));
		
	}
	
}
