package com.atmecs.handling_frames.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.handling_frames.constants.Constants;
import com.atmecs.handling_frames.helpers.HelperClass;
import com.atmecs.handling_frames.utilities.Logging;
import com.atmecs.handling_frames.utilities.PropertyReader;

public class HandlingFramesUsingJS 
{
	public WebDriver driver;

	HelperClass helpers;

	Properties locatorsFile;
	
	Properties datas;
	
	Logging log;
	
	public HandlingFramesUsingJS(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void handlingFrameAndClickChatIconTest(String name, String number, String mail) throws InterruptedException, IOException
	{
		helpers = new HelperClass(driver);
		
		log = new Logging();

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);
		
		helpers.switchToFrame(locatorsFile.getProperty("frame"));
		
		log.debug("Switching to frame");
		
		helpers.jsMethods(locatorsFile.getProperty("chaticon"));
		
		log.debug("Clicking on the Chaticon");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("username"))).sendKeys(name);
		
		log.info("Providing Username");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("mob"))).sendKeys(number);
		
		log.info("Providing Mobile Number");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("usermail"))).sendKeys(mail);
		
		log.info("Providing Mail_Id");
		
		helpers.clickOperation(locatorsFile.getProperty("checkbox"));
		
		log.info("Clicking the checkbox");

		helpers.selectValueFromDropDown(locatorsFile.getProperty("client"), "index1_1");
		
		log.info("PSelecting from Dropdown");

		helpers.clickOperation(locatorsFile.getProperty("button"));
		
		log.debug("Clicking on the chatbutton");
	}
	
}