package cpm.android.generalapp.test;

import org.testng.annotations.Test;

import com.mobile.objectrepo.Homepage;

import generic_utility.Baseclass1;
import generic_utility.Webdriverutility;

public class Generaltest1 extends Baseclass1 {
	Webdriverutility webuti = new Webdriverutility();
	
@Test
public void createlogin() throws Throwable
{
	//LaunchApp("com.androidsample.generalstore", ".SplashActivity");
	Homepage hp = new Homepage(driver);
	
	Thread.sleep(4000);
	hp.getCountrydrpdwn().click();
	webuti.scrolling(driver, "text", "Bahamas");
	//driver.findElementByXPath("//android.widget.TextView[@text='Bahamas']").click();
	webuti.selectscroll(driver, "Bahamas");
	
	hp.getNametxtfield().sendKeys("Msd");
	
	hp.getFemaleradiobtn().click();
	
	hp.getLetsshopbtn().click();
}
}
