package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Tapmethod {
@Test
public void tapping() throws MalformedURLException
{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "6g");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("UDID", "61804041");
	cap.setCapability("appPackage", "com.miui.calculator");
	cap.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
	
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 MobileElement Mob = (MobileElement)driver.findElementById("android:id/button1");
	 driver.tap(1, Mob, 500);
	driver.findElementById("com.miui.calculator:id/btn_5_s").click();
	driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
	driver.findElementById("com.miui.calculator:id/btn_3_s").click();
	driver.findElementByAccessibilityId("equals").click();
	
}
}
