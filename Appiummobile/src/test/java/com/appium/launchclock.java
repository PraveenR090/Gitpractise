package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
/**
 * 
 * @author Praveen
 *
 */
public class launchclock {
@Test
public void clocklaunch() throws MalformedURLException
{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "6g");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("UDID", "61804041");
	cap.setCapability("appPackage", "com.android.desklock");
	cap.setCapability("appActivity", "com.android.alarmclock.AlarmClock");
	
	URL url =new URL("http://localhost:4723/wd/hub");
	
	AndroidDriver driver = new AndroidDriver(url, cap);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
