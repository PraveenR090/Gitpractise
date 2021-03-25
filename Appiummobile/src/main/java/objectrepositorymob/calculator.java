package objectrepositorymob;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.Page;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class calculator {
@FindBy(id = "android:id/button1")
private WebElement agreebtn;

@FindBy(id="com.miui.calculator:id/btn_5_s")
private WebElement fivebtn;

@FindBy(id="com.miui.calculator:id/btn_plus_s")
private WebElement plusbtn;

@FindBy(id="com.miui.calculator:id/btn_6_s")
private WebElement sixbtn;

@FindBy(id="com.miui.calculator:id/btn_equal_s")
private WebElement equalsbtn;


 public WebElement getSixbtn() {
	return sixbtn;
}

public WebElement getEqualsbtn() {
	return equalsbtn;
}

public WebElement getPlusbtn() {
	return plusbtn;
}

public calculator(WebDriver driver){
	PageFactory.initElements(driver, this);
	
	
}
 
 public WebElement getAgreebtn() {
	return agreebtn;
	
	
}
 public void fiveclick()
 {
	 fivebtn.click();
 }


}
