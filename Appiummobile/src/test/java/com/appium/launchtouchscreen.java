package com.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class launchtouchscreen {
@Test
public void touchscreen()throws Exception
{

	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "6g");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("UDID", "61804041");
	//cap.setCapability("app", "F:\\APK\\ApiDemos-debug.apk");
	cap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
	cap.setCapability("appActivity", ".TouchScreenTestActivity");
	
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	/*driver.swipe(137, 400, 137, 1000,500 );
	driver.swipe(137, 1000, 904, 1000, 500);*/
	
//	driver.swipe(100, 1000, 900, 400,500 );
//	driver.swipe(900, 1000, 100, 400, 500);
	
	Dimension d = driver.manage().window().getSize();
     int ht = d.getHeight();
     System.out.println(ht);
     int wt = d.getWidth();
     System.out.println(wt); 
     
     //swipe horizontal
     int startsx = (int)(wt*.20);
     int startsy = (int)(ht*.50);
     
     int endx = (int)(wt*.80);
     int endy = (int)(ht*.50);
     
     driver.swipe(startsx, startsy, endx, endy, 500);
     
     
     
     
     
	
}
}
