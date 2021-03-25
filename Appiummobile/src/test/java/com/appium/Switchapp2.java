package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Switchapp2 {
@Test
public void switchbrowser() throws MalformedURLException, Throwable
{
	AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
	service.start();
	
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
	AndroidDriver<MobileElement> driver = new AndroidDriver(url, cap);

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("msd");
    
    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    
    driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();
    
    driver.findElementByXPath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']").click();
    
    driver.findElementById("com.androidsample.generalstore:id/btnProceed").tap(1, 500);
    
         Set<String> apps = driver.getContextHandles();
         
         for(String app:apps)
         {
        	 System.out.println(app);
         }
         Thread.sleep(2000);
    driver.context("WEBVIEW_com.androidsample.generalstore");
    
    driver.findElementByXPath("//input[@name='q']").sendKeys("msdhoni");
}
}
