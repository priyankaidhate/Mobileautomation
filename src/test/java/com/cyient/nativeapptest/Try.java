package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Try {
	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "priyankaidhate_MpClEK");
	      caps.setCapability("browserstack.key", "7b2kdSfxrKzXvDFeYfS7");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://00d5c3e46485dfa5a07318c8229f18b519fa2920");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "Project 3 try");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "try_test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	  
	    
	   
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Play Music\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Genre\")").click();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'India Top 200')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"India Top 200\")").click();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'Top')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Top\")").click();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'India')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
	
		
	}



}
