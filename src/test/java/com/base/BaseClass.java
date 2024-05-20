package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	protected WebDriver driver;
	
	 @BeforeMethod
	 @Parameters("browser")
	    public void setup(String browser) throws Exception {
		 
		 if (browser.equalsIgnoreCase("chrome")) {
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\FirstTest\\drivers\\chromedriver\\chromedriver.exe"); // Set the path to chromedriver
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("--disable-notifications");
	            driver = new ChromeDriver(options);
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            System.setProperty("webdriver.gecko.driver", "");
	            FirefoxOptions options = new FirefoxOptions();
	            driver = new FirefoxDriver(options);
	        } else if (browser.equalsIgnoreCase("edge")) {
	            System.setProperty("webdriver.edge.driver", "path/to/edgedriver");
	            EdgeOptions options = new EdgeOptions();
	            driver = new EdgeDriver(options);
	        } else {
	            throw new Exception("Browser is not supported: " + browser);
	        }
		 
	        driver.get("https://rahulshettyacademy.com/");
	        driver.manage().window().maximize();
	    }
	
	 @AfterMethod
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	 }
}