package com.demo.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;

	
	//Load the properties file which contains URL & Browser or Credentials etc 
	//@BeforeSuite
	public static void  loadConfig() throws Exception {
		prop = new Properties();
		fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\executable\\config.properties");
		prop.load(fis);

	}
	
	

	//Launch the browser & browser name passing via TestNG.XML file
	public static void browserSetUp(String browserName) throws Exception {

		if (browserName.contentEquals("chrome")) {
			// if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executable\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.contentEquals("firefox")) {
			// else if(browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executable\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Invalid browser");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// driver.get(prop.getProperty("url"));
		driver.get("https://google.com");
	}

}
