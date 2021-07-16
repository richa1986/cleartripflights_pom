package com.cleartrip.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.Home;
import com.cleartrip.qa.util.TestUtil;

public class SearchFlights extends TestBase{
	
    //System.out.println("First");
    
	@BeforeTest
	public void setUp() {
		
		
		//TestBase.prop();
		TestBase.intilalization();
		//setExtentReport();
		
			
	}
	
	@Test
	public void test1() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@href='/flights'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[2]/div[1]/span[1]")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
	//	Thread.sleep(1000);
	}
	
	
	
	
	@AfterTest
	public void tearDown() {
		//extent.flush();
		driver.quit();
	}

}
	
