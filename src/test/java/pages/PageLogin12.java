


package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class PageLogin12 {
	private WebDriver driver;
	private By userField;  //buscame por elemento que es de tipo By, pero no digo que existe el objeto con lo cual no me puede devolver que el elemento no existe dentro de la pagina
	                      //uso Fiel para meter texto. Campo de texto.
	private By passwordField;
	private By loginButton;  //ya se que es un boton
	private By fields;

	
	public PageLogin12(WebDriver driver) {
		this.driver = driver;
		userField = By.name("userName");
		passwordField = By.name("password");
		loginButton = By.name("login");
		fields = By.tagName("input");
		}
	
	public void login(String user,String pass) {
		driver.findElement(userField).sendKeys(user);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(loginButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	public void fields_login(String user, String pass) {
		List<WebElement> loginFields = driver.findElements(fields);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginFields.get(2).sendKeys(user);
		loginFields.get(3).sendKeys(pass);
		loginFields.get(4).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
    public void verifyFields() {
    	List<WebElement> loginFields = driver.findElements(fields);
    	System.out.println(loginFields.size());
    	System.out.println("ESTE ES EL TAMAÑO DE LA LISTA");
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	Assert.assertTrue(loginFields.size()==5);
    }
	} 
