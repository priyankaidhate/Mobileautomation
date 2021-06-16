package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class KhanacademysigninTest {
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
    caps.setCapability("project", "First Java Project - khanacademy");
    caps.setCapability("build", "Java Android");
    caps.setCapability("name", "first_test _priyanka");
      
    
    // Initialise the remote Webdriver using BrowserStack remote URL
    // and desired capabilities defined above
      AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(
          new URL("http://hub.browserstack.com/wd/hub"), caps);
      
      
      
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	driver.findElementByXPath("//android.widget.TextView[@text='Dismiss']").click(); //click on dismiss
	
		driver.findElementByXPath("//*[@text='Dismiss']").click();
		
		driver.findElementByXPath("//*[@text='Profile']").click();
		
		driver.findElementByXPath("//*[@text='Sign in']").click();
		
		driver.findElementByXPath("//*[@text='Enter an e-mail address or username']").sendKeys("hello@gmail.com");
		
		driver.findElementByXPath("//*[contains(@text,'Pass')]").sendKeys("hello123");
		
		driver.findElementByXPath("(//*[@text='Sign in'])[2]").click();
		
		String actualValue = driver.findElementByXPath("//*[contains(@text,'Invalid')]").getText();
		System.out.println(actualValue);
		
      

    /* Write your Custom code here */
      
      
    // Invoke driver.quit() after the test is done to indicate that the test is completed.
    driver.quit();

}
}