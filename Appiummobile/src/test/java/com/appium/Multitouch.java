package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Multitouch {
	@Test
	public void mltch() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "6g");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("UDID", "61804041");
		cap.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		cap.setCapability("appActivity", ".MainActivity t60358");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,cap);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("android:id/button1").click();
		
		driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
		
		WebElement picture = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
		
		int y = driver.manage().window().getSize().getHeight()/2;
		int x = driver.manage().window().getSize().getWidth()/2;
		
		TouchAction finger1 = new TouchAction(driver);
		finger1.press(x, y-100).moveTo(x, y-800);
		
		Thread.sleep(2000);
		
		TouchAction finger2 = new TouchAction(driver);
		finger2.press(x, y+100).moveTo(x, y+800);
		
		MultiTouchAction mta = new MultiTouchAction(driver);
		mta.add(finger1).add(finger2).perform();
		
		TouchAction finger3 = new TouchAction(driver);
		finger3.press(x, y-800).moveTo(x, y-100);
		
		Thread.sleep(2000);
		
		TouchAction finger4 = new TouchAction(driver);
		finger4.press(x, y+800).moveTo(x, y+100);
		
		MultiTouchAction mtb = new MultiTouchAction(driver);
				mtb.add(finger3).add(finger4).perform();
	}

}
