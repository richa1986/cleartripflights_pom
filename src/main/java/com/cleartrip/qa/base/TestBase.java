package com.cleartrip.qa.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cleartrip.qa.util.TestUtil;


public class TestBase {
	public static WebDriver driver;
    public static Properties prop;
	
public TestBase(){
	
	try {
		prop = new Properties();
		FileInputStream ip= new FileInputStream("/Users/Ashish/eclipse-workspace/ClearTripFlightsTest/src/main/java/com/cleartrip/qa/config/config.properties");
				prop.load(ip);		
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	} 
	catch(IOException e)
	{ e.printStackTrace();
		
	}
}

public static void intilalization() {
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
}
}
}
