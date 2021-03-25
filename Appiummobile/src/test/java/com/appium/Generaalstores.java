package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import generic_utility.Webdriverutility;
import io.appium.java_client.android.AndroidDriver;

public class Generaalstores {
	AndroidDriver driver;
@Test
public void shoeaction() throws MalformedURLException {
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
    
    driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("msd");
    
    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    
Webdriverutility uti = new Webdriverutility();
uti.scrolling(driver, "text", "PG 3");

}
}

