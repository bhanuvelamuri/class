package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {
	WebDriver driver;
	By quantity = By.xpath("//select[@name='quantity']");
	By buynow = By.xpath("//input[@value='Buy Now']");
public OrderPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}


public void orderMade(String number) {
	// TODO Auto-generated method stub
	Select quantityno = new Select(driver.findElement(quantity));
	quantityno.selectByVisibleText(number);
	driver.findElement(buynow).click();
}

}
