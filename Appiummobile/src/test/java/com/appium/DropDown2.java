package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class DropDown2 {
	AndroidDriver driver;

	@Test
	public void drpdwn2() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "6g");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("UDID", "61804041");
		// cap.setCapability("app", "F:\\APK\\ApiDemos-debug.apk");
		cap.setCapability("appPackage", "com.androidsample.generalstore");
		cap.setCapability("appActivity", ".SplashActivity");

		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("android:id/text1").click();
	
		
		scrolling("text", "India");
		driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
		
	}
public void scrolling(String an, String av)
{
	 driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ an +"(\""+ av +"\"))");
}


		
		
	
}