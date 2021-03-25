package com.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Brightnessup {
@Test
public void bright() throws Exception

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
	driver.findElementById("android:id/button1").click();
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	Thread.sleep(4000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
}
}
