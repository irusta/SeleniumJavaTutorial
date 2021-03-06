
/*
package tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import pages.PageLogin;
import pages.PageLogin12;
import pages.PageLogin13;
import pages.PageLogin14;
import pages.PageLogin3;
import pages.PageLogin5;
import pages.PageLogon;
import pages.PageLogon3;
import pages.PageLogon5;
import pages.PageReservation;
import pages.PageReservation3;
import pages.PageReservation4;
import pages.PageReservation5;
import pages.PageReservation6;



public class Tests18 {
	private WebDriver driver;
	
	ArrayList<String> tabs;
	@BeforeMethod
	public void setUp() {
	//	DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension (900,800));
		driver.manage().window().setPosition(new Point(0,0));
		driver.navigate().to("http://newtours.demoaut.com/");
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
		String googleWindow = "window.open('http://www.google.com')";
		javaScriptExecutor.executeScript(googleWindow);
		tabs = new ArrayList<String> (driver.getWindowHandles());

	}
	


	@Test
	public void pruebaIncorrecto() {
		//aqui estoy concatenando varias cosas en la misma linea de codigo
		driver.switchTo().window(tabs.get(1)).navigate().to("http://www.youtube.com/user/Draculinio");
		driver.switchTo().window(tabs.get(0));
		PageLogin12 pageLogin = new PageLogin12(driver);	
		PageLogon5 pageLogon = new PageLogon5(driver);
		pageLogin.fields_login("user","pass");
		//pageLogon.assertLogonPage();
	
	}
	

	@Test 
	public void pruebaDos5() {
		PageLogin12 pageLogin = new PageLogin12(driver);
		PageReservation6 pageReservation  =  new PageReservation6(driver);
		pageLogin.login("mercury", "mercury");
		pageReservation.assertPage();

	} 

	
	@Test 
	public void pruebaTres5() {
		PageLogin12 pageLogin = new PageLogin12(driver);
		PageReservation6 pageReservation  =  new PageReservation6(driver);
		pageLogin.login("mercury", "mercury");
		pageReservation.selectPassenger(2);
		pageReservation.selectFromPort(3);
		pageReservation.selectToPort("London");
		pageReservation.selectFromMonth("2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	Helpers helper = new Helpers();
	//	helper.sleepSeconds(5);
	
	}
	@Test 
	public void pruebaCantidadDeCampos() {
		PageLogin14 pageLogin = new PageLogin14(driver);
		pageLogin.verifyFields();
		}
		
	
	@Test
	public void Login() {
		PageLogin14 pageLogin = new PageLogin14(driver);	
		pageLogin.login("mary","mary");
	}

		
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(!result.isSuccess()) {
			File myScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(myScreenshot, new File("Error "+System.currentTimeMillis()+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		driver.switchTo().window(tabs.get(1)).close();
		driver.switchTo().window(tabs.get(0)).close();
		}  
} */