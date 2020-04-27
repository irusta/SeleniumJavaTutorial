


//implicitWait
package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Helpers;

public class PageLogin5 {
	private WebDriver driver;
	private By userField;  //buscame por elemento que es de tipo By, pero no digo que existe el objeto con lo cual no me puede devolver que el elemento no existe dentro de la pagina
	                      //uso Fiel para meter texto. Campo de texto.
	private By passwordField;
	private By loginButton;  //ya se que es un boton

	
	public PageLogin5(WebDriver driver) {
		this.driver = driver;
		userField = By.name("userName");
		passwordField = By.name("password");
		loginButton = By.name("login");

    	}
	public void login(String user,String pass) {
		driver.findElement(userField).sendKeys(user);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(loginButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Helpers helper =new Helpers();
		//helper.sleepSeconds(4);
		}
	}
