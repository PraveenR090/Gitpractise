package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Launchcamera {
@Test
public void camera() throws MalformedURLException, InterruptedException
{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "6g");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("UDID", "61804041");
	cap.setCapability("appPackage", "com.android.camera");
	cap.setCapability("appActivity", ".Camera t60411");
	
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	
	driver.findElementById("android:id/button1").click();
	
	driver.findElementByAccessibilityId("Shutter button").click();
	
	Thread.sleep(3000);
	
	driver.findElementByAccessibilityId("Front and rear camera switch").click();
	Thread.sleep(2000);
	driver.findElementByAccessibilityId("Shutter button").click();
}
}
