package com.mobile.objectrepo;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage {
AndroidDriver driver;

public Homepage(AndroidDriver driver)
{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	this.driver=driver;
}

@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
private MobileElement nametxtfield;

@AndroidFindBy(id="android:id/text1")
private MobileElement countrydrpdwn;

@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
private MobileElement maleradiobtn;

@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
private MobileElement femaleradiobtn;

@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
private MobileElement letsshopbtn;

public MobileElement getNametxtfield() {
	return nametxtfield;
}

public MobileElement getCountrydrpdwn() {
	return countrydrpdwn;
}

public MobileElement getMaleradiobtn() {
	return maleradiobtn;
}

public MobileElement getFemaleradiobtn() {
	return femaleradiobtn;
}

public MobileElement getLetsshopbtn() {
	return letsshopbtn;
}
}
