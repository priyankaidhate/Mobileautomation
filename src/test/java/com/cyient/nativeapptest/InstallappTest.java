package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class InstallappTest {
public static void main(String[] args) throws MalformedURLException {
DesiredCapabilities cap=new DesiredCapabilities();
    
    cap.setCapability("platformName", "Android");
    cap.setCapability("deviceName", "redmi");
    cap.setCapability("app", "D:\\company\\cyient\\automation testing\\java_workspace\\MobileAutomation\\src\\test\\resources\\apkfiles\\Khan Academy_v6.3.0_apkpure.com.apk");
   
   
    //send DesiredCapabilities details to the appium server
    AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
}
}
