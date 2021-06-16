package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TheTimeApp {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "priyankaidhate_MpClEK");
	      caps.setCapability("browserstack.key", "7b2kdSfxrKzXvDFeYfS7");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://1ec20e2829aba28d82c203252ad36c176c67e9ba");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 5");
	      caps.setCapability("os_version", "11.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "advance Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test priyanka");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        

	      /* Write your Custom code here */
	        
	      driver.findElement(By.xpath("//*[@text= 'I Agree']")).click();
	      driver.findElement(By.xpath("//*[@text='Existing subscriber? Log In']")).click();
	     
	      driver.findElement(By.xpath("//*[@text='EMAIL']")).sendKeys("prii@gmail.com");
	      driver.findElement(By.xpath("//*[@text='PASSWORD']")).sendKeys("abc@123");
	      driver.findElement(By.xpath("//*[@resource-id='uk.co.thetimes:id/acs__login_next_button']")).click();
		    
	        
	     
	      driver.quit();
	    
	    }
	      
	  
	}


