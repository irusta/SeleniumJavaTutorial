package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Helpers;

public class PageLogin {
	private WebDriver driver;
	
	public PageLogin(WebDriver driver) {
		this.driver = driver;
    	}
	public void login(String user,String pass) {
		driver.findElement(By.name("userName")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		Helpers helper =new Helpers();
		helper.sleepSeconds(4);
		}
	}
