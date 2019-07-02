package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PaymentDetails {
	WebDriver driver;
	By cardnumber = By.xpath("//input[@id='card_nmuber']");
	By month = By.xpath("//select[@id='month']");
	By year = By.xpath("//select[@id='year']");
	By cvv = By.xpath("//input[@id='cvv_code']");
	By click = By.xpath("//*[@name='submit']");
public PaymentDetails(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}


public void carddetails(String cardno, String monthno, String yearno, String cvvno) {
	// TODO Auto-generated method stub
	driver.findElement(cardnumber).sendKeys(cardno);
	Select monthdetails = new Select(driver.findElement(month));
	monthdetails.selectByVisibleText(monthno);
	Select yeardetails = new Select(driver.findElement(year));
	yeardetails.selectByVisibleText(yearno);
	driver.findElement(cvv).sendKeys(cvvno);
	driver.findElement(click).click();

	
}
}
