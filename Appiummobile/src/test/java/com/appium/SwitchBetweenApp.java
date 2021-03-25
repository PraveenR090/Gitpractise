package com.appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwitchBetweenApp {
	@Test
	public void switching() throws Exception
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
		
		String appPackage="com.androidsample.generalstore";
		String appActivity=".SplashActivity";
				
				driver.startActivity(appPackage, appActivity);
				/* again re launch the desired capabilities application    */
				driver.launchApp();
		//driver.runAppInBackground(10);
	}

}
