/*package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import pages.PageLogin;
import pages.PageLogin3;
import pages.PageLogon;
import pages.PageLogon3;
import pages.PageReservation;
import pages.PageReservation3;
import pages.PageReservation4;



public class Tests4 {
/*	private WebDriver driver;
	@BeforeMethod
	public void setUp() {
	//	DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/");
		Helpers helper = new Helpers();
		helper.sleepSeconds(4);
	}
	
	
	
	@Test(priority=10)
	public void pruebaUno4() {
		PageLogin3 pageLogin = new PageLogin3(driver);	
		PageLogon3 pageLogon = new PageLogon3(driver);
		pageLogin.login("user", "user");
		pageLogon.assertLogonPage();
	
	}

	@Test (priority=9)
	public void pruebaDos4() {
		PageLogin3 pageLogin = new PageLogin3(driver);
		PageReservation3 pageReservation  =  new PageReservation3(driver);
		pageLogin.login("mercury", "mercury");
		pageReservation.assertPage();

	} 

	
	@Test (priority=10)
	public void pruebaTres4() {
		PageLogin3 pageLogin = new PageLogin3(driver);
		PageReservation4 pageReservation  =  new PageReservation4(driver);
		pageLogin.login("mercury", "mercury");
		pageReservation.selectPassenger(2);
		pageReservation.selectFromPort(3);
		pageReservation.selectToPort("London");
		pageReservation.selectFromMonth("2");
		Helpers helper = new Helpers();
		helper.sleepSeconds(5);
	
	} 
													
	@AfterMethod
	public void tearDown() {
		driver.close();
	} 
} */