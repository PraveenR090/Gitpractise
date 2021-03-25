package com.appium;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class DropDown {
	AndroidDriver driver;

	@Test
	public void DrgDrp() throws Throwable {
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
		driver.findElementByAccessibilityId("Controls").click();
		driver.findElementByAccessibilityId("2. Dark Theme").click();
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Praveen kumar");
		driver.findElementByAccessibilityId("Checkbox 2").click();
		driver.findElementByAccessibilityId("RadioButton 1").click();
		driver.hideKeyboard();
		driver.findElementById("android:id/text1").click();
		  List<WebElement> list1 = driver.findElementsByClassName("android.widget.CheckedTextView");
		  int count = list1.size();
		  System.out.println(count);
		  
		 
		  
		  for(WebElement ele:list1){
			String data = ele.getText();
			 String EXP = "Earth";
			if(data.equals(EXP))
			{
				ele.click();
				break;
			}
			
		 }
	}

}
