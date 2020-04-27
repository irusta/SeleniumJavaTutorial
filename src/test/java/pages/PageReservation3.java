package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PageReservation3 {
	private WebDriver driver;
	private By titleText;
	
	public PageReservation3(WebDriver driver) {
		this.driver = driver;
		titleText= By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font");
	}
	
	public void assertPage()  {
		Assert.assertTrue(driver.findElement(titleText).getText().contains("Flight Finder to search"));
	}
}
