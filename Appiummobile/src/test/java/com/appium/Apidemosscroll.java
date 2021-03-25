package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Apidemosscroll {
	AndroidDriver driver;
	@Test
	
	public void scrollaction() throws MalformedURLException {
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
	
        scrolling("text","Layouts");
       WebElement element1 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Layouts']"));
       driver.tap(1, element1, 500);
	}
     public void scrolling(String an, String av)
     {
    	 driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ an +"(\""+ av +"\"))");
	}

}

