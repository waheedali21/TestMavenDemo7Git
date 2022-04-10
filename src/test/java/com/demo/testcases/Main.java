package com.demo.testcases;

import java.io.FileInputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws Exception {


		// WebDriver driver;
		Properties prop;
		FileInputStream fis;
		
	
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\executable\\config.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		System.out.println("BrowserName: " + browserName);
		
		String currentURL = prop.getProperty("url");
		System.out.println("CurrentURL: " + currentURL);


	}

}
