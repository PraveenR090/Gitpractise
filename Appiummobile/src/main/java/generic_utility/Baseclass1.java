package generic_utility;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Baseclass1 {
	AppiumDriverLocalService service;
	public	AndroidDriver driver;
	
	@BeforeSuite
	public void connectserver(){
		
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	@BeforeMethod
	public void LaunchApp() throws Throwable
	{
		File_utility fu = new File_utility();
		 String dname = fu.file("deviceName");
		 String aname = fu.file("automationName"); 
		 String pname = fu.file("platformName");
		 String pvname = fu.file("platformVersion");
		 String udname = fu.file("UDID");

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", dname);
			cap.setCapability("automationName", aname);
			cap.setCapability("platformName", pname);
			cap.setCapability("platformVersion", pvname);
			cap.setCapability("UDID", udname);
			cap.setCapability("appPackage", "com.androidsample.generalstore");
			cap.setCapability("appActivity", ".SplashActivity");
			cap.setCapability("noReset", true);
			 
			URL url = new URL("http://localhost:4723/wd/hub");
			 driver = new AndroidDriver(url,cap);
			
		 
		 

		
	}
	}


