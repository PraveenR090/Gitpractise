package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Launchchrome {
@Test
public void launchchromebr() throws MalformedURLException
{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "6g");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("UDID", "61804041");
	
//	cap.setBrowserName("Chrome");
	
//	cap.setCapability("browserName", "Chrome");
	
	cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	
	cap.setCapability("noReset", true);
	
	
	
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
}
}
