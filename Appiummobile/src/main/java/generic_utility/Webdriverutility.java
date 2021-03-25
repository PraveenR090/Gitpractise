package generic_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Webdriverutility {
	/**
	 * @author Praveen
	 * @param driver
	 */
	
	//used for page loading
public void implicitlywait(AndroidDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Pathconstants.implicitwait, TimeUnit.SECONDS);
	
}

/**
 * 
 * @param driver
 * @param an
 * @param av
 * 
 * used for scrolling the page
 */
public void scrolling(AndroidDriver driver, String an, String av)
{
	 driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ an +"(\""+ av +"\"))");
}

public void volumeup(AndroidDriver driver)
{
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
}

public void selectscroll(AndroidDriver driver,String src)
{
	driver.findElementByXPath("//android.widget.TextView[@text='"+src+"']").click();

}
}
