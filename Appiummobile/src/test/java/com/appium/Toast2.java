package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Toast2 {
@Test
public void tas() throws MalformedURLException
{
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
    
    
    
    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    
    
    
    MobileElement tomsg = driver.findElementByXPath("//android.widget.Toast[1]");
    
   String msg = tomsg.getText();
   
   System.out.println(msg);
}

}

