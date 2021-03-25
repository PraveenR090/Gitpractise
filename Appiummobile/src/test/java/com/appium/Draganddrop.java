package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Draganddrop {
	AndroidDriver driver;
@Test
	public void draganddrop() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "6g");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("UDID", "61804041");
		// cap.setCapability("app", "F:\\APK\\ApiDemos-debug.apk");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");

		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Views").click();

		driver.findElementByAccessibilityId("Drag and Drop").click();
		MobileElement src = (MobileElement) driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		MobileElement dst = (MobileElement) driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		TouchAction ta = new TouchAction(driver);
		ta.longPress(src).waitAction(500).moveTo(dst).release().perform();

		
		

	}
}
