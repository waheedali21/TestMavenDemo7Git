package com.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.base.TestBase;

public class TestCase1 extends TestBase{
	
	
	@BeforeMethod
	public void setUp(String browser) throws Exception {
		TestBase.browserSetUp(browser);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void doVerifyTitle() {
		String currentTitle = driver.getTitle();
		System.out.println("Title: " + currentTitle);
		Assert.assertEquals(currentTitle, driver.getTitle());
		
	}
	
	
	@Test
	public void doVerifyURL() {
		String currentURL = driver.getCurrentUrl();
		System.out.println("URL: " + currentURL);
		Assert.assertEquals(currentURL, driver.getCurrentUrl());
	}
	
	
	

}
