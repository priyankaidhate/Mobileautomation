package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MathAcademy {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "priyankaidhate_MpClEK");
	      caps.setCapability("browserstack.key", "7b2kdSfxrKzXvDFeYfS7");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://bcf57a127d2dc311969da01f7caefc26bc224d37");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "math Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "math_test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        

	      /* Write your Custom code here */
	        driver.findElement(By.xpath("//*[@text='PLAY']")).click();
	        driver.findElement(By.xpath("//*[@text='PRACTICE']")).click();
	        driver.findElement(By.xpath("//*[@text='How to play']")).click();
	        driver.findElement(By.xpath("//*[@text='EASY']")).click();
	        driver.findElement(By.xpath("//*[@text='FOUR FOURS']")).click();
	        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        
	        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			while(driver.findElementsByXPath("//*[contains(@text,'ONE TWO, THREE THREES')]").size()==0) {
				Map<String, String> map = new HashMap <String,String> ();
				map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
				driver.executeScript("mobile:shell", map);
	        
	        
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	      driver.quit();
	    
	    }
	      
	  
	}

}
