package com.tcs.DevopsFinal;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CodePath {

	AndroidDriver driver;
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException
	{

		DesiredCapabilities capabilities = new DesiredCapabilities();
    	// capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
 		//capabilities.setCapability("deviceName", "HTC One X+");
 		capabilities.setCapability("platformName", "Android");
 		capabilities.setCapability("appPackage", "codepath.apps.Myapps");
 		capabilities.setCapability("appActivity", "codepath.apps.demointroandroid.DemoSelector");
 		capabilities.setCapability("deviceName", "S4");
 		//capabilities.setCapability("udid", "3418d0936e66c776ce520fea49d379652e0686ac");
 	
 		 driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities); 
 		 Thread.sleep(3000);
	}
	@Test
	public void runing() throws InterruptedException
	{
		System.out.println("Application Launched");
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Chapter 1: App Fundamentals']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Basic TextView']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Chapter 2: User Interface']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Linear Layout Demo']")).click();
		driver.navigate().back();
	}
}
