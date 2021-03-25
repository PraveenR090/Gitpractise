package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class OpenNotification {
	@Test
	public void openNotify() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "6g");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("UDID", "61804041");
		// cap.setCapability("app", "F:\\APK\\ApiDemos-debug.apk");
		cap.setCapability("appPackage", "com.bhanu.notificationreminders");
		cap.setCapability("appActivity", ".MainDrawerActivity t60465");
		cap.setCapability("noReset", true);
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,cap);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle").sendKeys("MS dhoni");
		driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteText").sendKeys("WorldCup 2007");
		driver.findElementById("com.bhanu.notificationreminders:id/btnNotify").click();
		driver.openNotifications();
		driver.findElementByXPath("//android.widget.LinearLayout[@resource-id='android:id/notification_main_column']").click();
	}


}
