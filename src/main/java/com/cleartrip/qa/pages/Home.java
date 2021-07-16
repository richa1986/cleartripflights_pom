package com.cleartrip.qa.pages;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.util.TestUtil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends TestBase {
	
	Home home = new Home();
	
	//page Factory - OR;
	@FindBy(xpath="(//a[@href='/flights'])[1]")
	WebElement flightsMenu;
	
	@FindBy(xpath="//p[contains(text(),'Round trip')]//ancestor::label//input")
	WebElement roundTripMenu;
	
	@FindBy(xpath="//input[@id='fromCity']")
	WebElement fromCityDrop;
	
	@FindBy(xpath = "//input[@value='BOM - Mumbai, IN ']")
	WebElement firstOption;
	
	@FindBy(xpath="//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-secondary-500 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null']")
	WebElement searchFromCity;
	
	@FindBy(xpath="//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-secondary-500 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8']")
	WebElement searchToCity;
	
	@FindBy(xpath="//p[contains(text(),'Mumbai, IN - Chatrapati Shivaji Airport (BOM)')]")
	WebElement departureDrop;
	
	@FindBy(xpath="//p[contains(text(),'New Delhi, IN - Indira Gandhi Airport (DEL)')]")
	WebElement returnDrop;
	
	String departureDate = "//div[@class='p-fixed l-0 r-0 b-0 t-0 flex flex-center flex-middle z-20']";
	String returnDate = "//div[@class='p-fixed l-0 r-0 b-0 t-0 flex flex-center flex-middle z-24']";
	
	@FindBy(xpath="//button[contains(text(),'Search flights')]")
	WebElement searchBtn;
	

	
	// constructor
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	// actions
	public void selectFlightsMenu() {
		flightsMenu.click();
	}
	
	public void selectRoundtripMenu() {
		roundTripMenu.click();
	}
	
	public void enterDepartureCity() {
		fromCityDrop.click();
		searchFromCity.sendKeys(prop.getProperty("From"));
		firstOption.click();
	}
		public void enterReturnCity() {
		searchToCity.sendKeys(prop.getProperty("To"));
		firstOption.click();
		}
	
//	public void enterDepartureDate() {
//		departureDrop.click();
//		TestUtil date = TestUtil.getCurrentAndReturnDates();
//	driver.findElement(TestUtil.customXpath(departureDate,date.departureDate)).click();
//	}
//	
//	public void enterReturnDate() {
//		returnDrop.click();
//		TestUtil date = TestUtil.getCurrentAndReturnDates();
//		driver.findElement(TestUtil.customXpath(returnDate, date.returnDate)).click();
//	}

	public Flights search() {
		searchBtn.click();
		driver.manage().deleteAllCookies();
		return new Flights();
	}
	

}
