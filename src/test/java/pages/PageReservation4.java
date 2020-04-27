package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PageReservation4 {
	private By passengersDrop;  //objectos que necesitamos en nuestros metodos
	private By fromDrop;
	private By toDrop;
	private WebDriver driver;
	private By titleText;
	private By onDrop;
		
	public PageReservation4(WebDriver driver) {
		this.driver = driver;
		titleText =By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font");
		passengersDrop = By.name("passCount");  //definimos el objecto que necesitamos
		fromDrop = By.name("fromPort");
		toDrop = By.name("toPort");
		onDrop = By.name("fromMonth");
	}
	
	public void assertPage()  {
		Assert.assertTrue(driver.findElement(titleText).getText().contains("Flight Finder to search"));
	}
	
	public void selectPassenger(int cant) {
		Select selectPasajeros = new Select(driver.findElement(passengersDrop)); //en este caso el elemento que hemos creado es del tipo Select
		selectPasajeros.selectByVisibleText(Integer.toString(cant));
	}
	
	public void selectFromPort(int index) {
		Select selectFrom = new Select(driver.findElement(fromDrop));
		selectFrom.selectByIndex(index);
	}
	
	public void selectToPort(String city) {
		Select selectTo = new Select(driver.findElement(toDrop));
		selectTo.selectByValue(city);
	}
	
	public void selectFromMonth(String month) {
		Select selectOn = new Select(driver.findElement(onDrop));
		selectOn.selectByValue(month);
	}
}


