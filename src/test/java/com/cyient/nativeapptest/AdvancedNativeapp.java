package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AdvancedNativeapp {
       public static void main(String[] args) throws MalformedURLException {
    	   DesiredCapabilities cap=new DesiredCapabilities();
    	    
    	    cap.setCapability("platformName", "Android");
    	    cap.setCapability("deviceName", "redmi");
    	    cap.setCapability("browserName", "chrome");
    	   cap.setCapability("chromedriverExecutable", "D:\\company\\cyient\\automation testing\\java_workspace\\MobileAutomation\\src\\test\\resources\\apkfiles\\Khan Academy_v6.3.0_apkpure.com.apk");
    	   cap.setCapability("udid","f18f6ada");
    	    //send DesiredCapabilities details to the appium server
    	    AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
    	    driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		driver.findElementByXPath("//*[@text='Dismiss']").click();
    		
	}
}
