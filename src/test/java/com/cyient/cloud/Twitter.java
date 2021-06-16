package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Twitter {
	public static void main(String[] args) throws MalformedURLException {
		
	
	
	
	DesiredCapabilities caps = new DesiredCapabilities();
    
    // Set your access credentials
    caps.setCapability("browserstack.user", "priyankaidhate_MpClEK");
    caps.setCapability("browserstack.key", "7b2kdSfxrKzXvDFeYfS7");
    
    // Set URL of the application under test
    caps.setCapability("app", "bs://de87f6b1de3f59040aaefde55c9d309a14034f29");
    
    // Specify device and os_version for testing
    caps.setCapability("device", "Google Pixel 3");
    caps.setCapability("os_version", "9.0");
      
    // Set other BrowserStack capabilities
    caps.setCapability("project", "First Java Project-priyanka ");
    caps.setCapability("build", "Java Android");
    caps.setCapability("name", "first_test-twitter");
      
    
    // Initialise the remote Webdriver using BrowserStack remote URL
    // and desired capabilities defined above
      AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(
          new URL("http://hub.browserstack.com/wd/hub"), caps);
      //click on account
      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
      driver.findElement(By.xpath("//*[@resource-id='com.twitter.android:id/primary_action'][1]")).click();
     driver.findElement(By.xpath("//*[@resource-id='com.twitter.android:id/name_field']")).sendKeys("priyanka");
      driver.findElement(By.xpath("//*[@text='Phone number or email address']")).sendKeys("8669026551");
     driver.findElement(By.xpath("//*[@text='Date of birth']")).sendKeys("1 sep");
     driver.findElement(By.xpath("//*[@text='NEXT']")).click();
       
    // Invoke driver.quit() after the test is done to indicate that the test is completed.
   driver.quit();
  
  }
    
}


