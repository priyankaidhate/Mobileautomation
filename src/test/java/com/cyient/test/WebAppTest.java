package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WebAppTest {
public static void main(String[] args) throws MalformedURLException {
	
	DesiredCapabilities cap=new DesiredCapabilities();
    
    cap.setCapability("platformName", "Android");
    cap.setCapability("deviceName", "redmi");
    cap.setCapability("browserName", "chrome");
   cap.setCapability("chromedriverExecutable", "D:\\company\\cyient\\automation testing\\java_workspace\\MobileAutomation\\src\\main\\resources\\driver\\chromedriver.exe");
   
    //send DesiredCapabilities details to the appium server
    AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
    cap.setCapability("udid","emulator-5554");
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://magento.com/");
	//driver.findElementByXPath("//spam[text()=''])")
    
}
}
