package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Calculatoroperation {
@Test
public void summation() throws MalformedURLException
{
	AppiumDriverLocalService servi = AppiumDriverLocalService.buildDefaultService();
	DesiredCapabilities cap = new DesiredCapabilities();
	servi.start();
	cap.setCapability("deviceName", "6g");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "7.1.1");
	cap.setCapability("UDID", "ZL33B292N7");
	cap.setCapability("appPackage", "com.google.android.calculator");
	cap.setCapability("appActivity", "com.android.calculator2.Calculator");
	
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	/*driver.findElementById("android:id/button1").click();
	driver.findElementById("com.miui.calculator:id/btn_5_s").click();
	driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
	driver.findElementById("com.miui.calculator:id/btn_3_s").click();
	driver.findElementByAccessibilityId("equals").click();*/
	
}
}
