package com.appium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import objectrepositorymob.calculator;


public class LaunchCal extends BaseClass {
	
	@Test
	public void LaunchCal() throws Throwable
	{
	
		
		calculator cla = new calculator(driver);
		//cla.getAgreebtn().click();
		
		cla.fiveclick();
		
		cla.getPlusbtn().click();
		
		cla.getSixbtn().click();
		
		cla.getEqualsbtn().click();
	}

}
